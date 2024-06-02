package br.com.roberto.microservice_student.domain.services

import br.com.roberto.microservice_student.domain.contracts.service.StudentService
import br.com.roberto.microservice_student.domain.model.StudentModel
import br.com.roberto.microservice_student.domain.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl(
    private val studentRepository: StudentRepository
) : StudentService {
    override fun addStudent(studentModel: StudentModel): StudentModel {
        return studentRepository.addStudent(studentModel)
    }

}