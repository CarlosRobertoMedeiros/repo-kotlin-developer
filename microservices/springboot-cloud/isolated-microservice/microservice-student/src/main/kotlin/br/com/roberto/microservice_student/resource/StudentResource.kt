package br.com.roberto.microservice_student.resource

import br.com.roberto.microservice_student.domain.model.StudentModel
import br.com.roberto.microservice_student.domain.repository.StudentRepository
import br.com.roberto.microservice_student.resource.repository.StudentResourceRepository
import org.springframework.stereotype.Component

@Component
class StudentResource(val studentResourceRepository:StudentResourceRepository) : StudentRepository {
    override fun addStudent(studentModel: StudentModel): StudentModel {
        return studentResourceRepository.save(studentModel)
    }


}