package br.com.roberto.microservice_student.domain.repository

import br.com.roberto.microservice_student.domain.model.StudentModel
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : MongoRepository<StudentModel, String> {
    fun findByStudentId(id: String): StudentModel?
    fun findByCpf(cpf: String): StudentModel
    fun findByName(name: String): StudentModel?

}

