package br.com.roberto.microservice_student.domain.model

import br.com.roberto.microservice_student.domain.model.enum.Gender
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "student_collection")
data class StudentModel(
    @Id
    val studentId: String?,//ObjectId = ObjectId(),
    val cpf: String?,
    val name: String?,
    val birthday: LocalDateTime?,
    val gender: Gender?,
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = LocalDateTime.now()
)