package br.com.roberto.microservice_student.application.rest.converter

import br.com.roberto.microservice_student.domain.model.StudentModel
import br.com.roberto.microservice_student.domain.model.enum.Gender
import br.com.roberto.microservice_student.model.StudentRequest
import java.time.OffsetDateTime

data class StudentRequestConverter(
    val cpf: String,
    val name: String,
    val birthday: OffsetDateTime,
    val gender: StudentRequest.Gender,
    val studentId: Long?,
    val createdAt: OffsetDateTime?,
    val updatedAt: OffsetDateTime?
) {
    companion object {
        fun toDomain(studentRequest: StudentRequest) = StudentModel(
            cpf = studentRequest.cpf,
            name = studentRequest.name,
            birthday = studentRequest.birthday,
            gender = Gender.valueOf(studentRequest.gender.toString()),
            studentId =  null,
            createdAt = null,
            updatedAt = null
        )
    }
}


