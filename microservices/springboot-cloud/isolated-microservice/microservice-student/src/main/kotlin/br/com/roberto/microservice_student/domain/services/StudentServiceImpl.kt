package br.com.roberto.microservice_student.domain.services

import br.com.roberto.microservice_student.domain.contracts.service.StudentService
import br.com.roberto.microservice_student.domain.model.StudentModel
import br.com.roberto.microservice_student.domain.repository.StudentRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class StudentServiceImpl(
    private val studentRepository: StudentRepository
) : StudentService {

    override fun getStudents(pageable: Pageable): Page<StudentModel> {
        return studentRepository.findAll(pageable)
    }

    override fun addStudent(studentModel: StudentModel): StudentModel {
        return studentRepository.save(studentModel)
    }

    override fun deleteStudent(studentId: String) : Boolean {
        val existingStudent = studentRepository.findById(studentId)
        if (existingStudent.isEmpty) {
            return false
        }
        studentRepository.deleteById(studentId);
        return true
    }

    override fun updateStudent(id: Long, updatedStudent: StudentModel): StudentModel? {
        val existingStudent = findById(id.toString()) ?: return null

        // Atualiza os campos do estudante existente com base nos dados fornecidos
        existingStudent.apply {
            cpf = updatedStudent.cpf ?: cpf
            name = updatedStudent.name ?: name
            birthday = updatedStudent.birthday ?: birthday
            gender = updatedStudent.gender ?: gender
            updatedAt = LocalDateTime.now()
        }

        // Salva e retorna o estudante atualizado
        return studentRepository.save(existingStudent)
    }


    override fun findByCpf(cpf: String): StudentModel {
        return studentRepository.findByCpf(cpf)
    }

    override fun findById(studentId: String): StudentModel? {
        val existingStudent: Optional<StudentModel> = studentRepository.findById(studentId)
        return existingStudent.orElse(null)
    }

    override fun findByName(name: String): StudentModel? {
        return studentRepository.findByName(name)
    }
}