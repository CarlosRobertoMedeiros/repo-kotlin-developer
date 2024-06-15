package br.com.roberto.microservice_student.application.rest

import br.com.roberto.microservice_student.api.StudentsApi
import br.com.roberto.microservice_student.application.rest.converter.StudentRequestConverter
import br.com.roberto.microservice_student.application.rest.converter.StudentResponseConverter
import br.com.roberto.microservice_student.commons.metrics.AppMetrics
import br.com.roberto.microservice_student.domain.contracts.service.StudentService
import br.com.roberto.microservice_student.model.StudentRequest
import br.com.roberto.microservice_student.model.StudentResponse
import br.com.roberto.microservice_student.model.StudentResponsePage
import org.springframework.data.domain.PageRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/student")
class StudentController(
    private val studentService: StudentService,
    private val metrics: AppMetrics
) : StudentsApi {
    override fun addStudent(studentRequest: StudentRequest): ResponseEntity<StudentResponse> {
        val studentModel = studentService.addStudent(StudentRequestConverter.toDomain(studentRequest))
        val innerStudentResponse = StudentResponseConverter.fromDomain(studentModel)
        return if (innerStudentResponse?.studentId != null) {
            ResponseEntity.status(HttpStatus.CREATED).body(innerStudentResponse)
        } else {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null)
        }
    }

    override fun deleteStudent(studentId: String): ResponseEntity<Unit> {
        val deleted = studentService.deleteStudent(studentId)
        return if (deleted) {
            ResponseEntity.status(HttpStatus.NO_CONTENT).build()
        } else {
            ResponseEntity.status(HttpStatus.NOT_FOUND).build()
        }
    }

    override fun getStudentByCpf(cpf: Long): ResponseEntity<StudentResponse> {
        val studentModel = studentService.findByCpf(cpf.toString())
        val innerStudentResponse = StudentResponseConverter.fromDomain(studentModel)

        return if (innerStudentResponse != null) {
            ResponseEntity.ok(innerStudentResponse)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    override fun getStudentById(studentId: String): ResponseEntity<StudentResponse> {
        val studentModel = studentService.findById(studentId)
        val innerStudentResponse = StudentResponseConverter.fromDomain(studentModel!!)

        return if (innerStudentResponse != null) {
            ResponseEntity.ok(innerStudentResponse)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    override fun getStudentByName(name: String): ResponseEntity<StudentResponse> {
        val studentModel = studentService.findByName(name)
        val innerStudentResponse = StudentResponseConverter.fromDomain(studentModel!!)

        return if (innerStudentResponse != null) {
            ResponseEntity.ok(innerStudentResponse)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    override fun getStudents(page: Int, pageSize: Int): ResponseEntity<StudentResponsePage> {
        val pageable = PageRequest.of(page, pageSize)
        val studentsPage = studentService.getStudents(pageable)
        val students = studentsPage.content

        val responsePage = StudentResponsePage(
            totalPages = studentsPage.totalPages,
            totalElements = studentsPage.totalElements,
            pageSize = studentsPage.size,
            page = studentsPage.number,
            data = students.map {
                StudentResponse(
                    studentId = it.studentId.toString(),
                    cpf = it.cpf ?: "",
                    name = it.name ?: "",
                    birthday = it.birthday?.toString() ?: "",
                    gender = StudentResponse.Gender.valueOf(it.gender!!.name),
                    createdAt = it.createdAt?.toString() ?: "",
                    updatedAt = it.updatedAt?.toString() ?: ""
                )
            }
        )

        return ResponseEntity.ok(responsePage)
    }

    override fun updateStudent(studentId: String, studentRequest: StudentRequest?): ResponseEntity<StudentResponse> {

        val studentModel = StudentRequestConverter.toDomain(studentRequest!!);
        val updatedStudentModel = studentService.updateStudent(studentId.toLong(), studentModel)
        val innerStudentResponse = StudentResponseConverter.fromDomain(updatedStudentModel!!)
        return if (innerStudentResponse != null) {
            ResponseEntity.ok(innerStudentResponse)
        } else {
            ResponseEntity.notFound().build()
        }
    }


}

/*return metrics.incrementalInternal(MetricTagResource.CONTROLLER_POST_STUDENT){
          runCatching {
              val studentResponse =
                  StudentResponseConverter.fromDomain(
                      studentService.addStudent(
                          StudentRequestConverter.toDomain(studentRequest)
                      )
                  )
              ResponseEntity.status(HttpStatus.CREATED).body(studentResponse)
          }.onFailure {
                  var studentErrorResponse = StudentErrorResponse()
                  with(studentErrorResponse){
                      status = "Error",
                      message = it.message,
                      debugMessage = it.cause
                  }
                ResponseEntity(studentErrorResponse , HttpStatus.BAD_REQUEST)

          }
      }*/