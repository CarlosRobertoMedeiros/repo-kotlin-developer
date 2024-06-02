package br.com.roberto.microservice_student.application.rest

import br.com.roberto.microservice_student.api.StudentsApi
import br.com.roberto.microservice_student.application.rest.converter.StudentRequestConverter
import br.com.roberto.microservice_student.application.rest.converter.StudentResponseConverter
import br.com.roberto.microservice_student.commons.metrics.AppMetrics
import br.com.roberto.microservice_student.commons.metrics.MetricTagResource
import br.com.roberto.microservice_student.domain.contracts.service.StudentService
import br.com.roberto.microservice_student.model.StudentRequest
import br.com.roberto.microservice_student.model.StudentResponse
import br.com.roberto.microservice_student.model.StudentResponsePage
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

        innerStudentResponse.takeIf {
            it.studentId != null
        }.apply {
            return ResponseEntity.status(HttpStatus.CREATED).body(innerStudentResponse)
        }?.runCatching {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null)
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
        TODO("Not yet implemented")
    }

    override fun deleteStudent(studentId: Int): ResponseEntity<Unit> {
        TODO("Not yet implemented")
    }

    override fun getStudentByCpf(cpf: Long): ResponseEntity<StudentResponse> {
        TODO("Not yet implemented")
    }

    override fun getStudentById(studentId: Long): ResponseEntity<StudentResponse> {
        TODO("Not yet implemented")
    }

    override fun getStudentByName(name: String): ResponseEntity<StudentResponse> {
        TODO("Not yet implemented")
    }

    override fun getStudents(page: Int, pageSize: Int): ResponseEntity<StudentResponsePage> {
        TODO("Not yet implemented")
    }

    override fun updateStudent(studentId: Int, studentRequest: StudentRequest?): ResponseEntity<StudentResponse> {
        TODO("Not yet implemented")
    }


}