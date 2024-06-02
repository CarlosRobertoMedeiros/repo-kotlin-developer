package br.com.roberto.microservice_student.resource.repository

import br.com.roberto.microservice_student.domain.model.StudentModel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentResourceRepository : MongoRepository<StudentModel, Long> {
}