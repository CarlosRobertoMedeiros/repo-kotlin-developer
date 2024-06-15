package br.com.roberto.microservice_student.domain.model

import br.com.roberto.microservice_student.domain.model.enum.Gender
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "student_collection")
data class StudentModel(
    @Id
    //val id: ObjectId = ObjectId(),
    val studentId: ObjectId? = ObjectId(),
    var cpf: String?,
    var name: String?,
    var birthday: LocalDateTime?,
    var gender: Gender?,
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    var updatedAt: LocalDateTime? = LocalDateTime.now()
)