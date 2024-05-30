package br.com.roberto.microservice_student.domain.model

import br.com.roberto.microservice_student.domain.model.enum.Gender
import java.time.OffsetDateTime

data class StudentModel(
    val studentId: Long?,
    val cpf: String,
    val name: String,
    val birthday: OffsetDateTime,
    val gender: Gender,
    val createdAt: OffsetDateTime?,
    val updatedAt: OffsetDateTime?
)