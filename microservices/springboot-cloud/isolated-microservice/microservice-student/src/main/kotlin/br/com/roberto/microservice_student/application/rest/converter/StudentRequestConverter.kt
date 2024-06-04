package br.com.roberto.microservice_student.application.rest.converter

import br.com.roberto.microservice_student.domain.model.StudentModel
import br.com.roberto.microservice_student.domain.model.enum.Gender
import br.com.roberto.microservice_student.model.StudentRequest
import java.time.LocalDateTime

data class StudentRequestConverter(
    val cpf: String,
    val name: String,
    val birthday: LocalDateTime,
    val gender: StudentRequest.Gender,
    val studentId: Long?,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
    companion object {
        fun toDomain(studentRequest: StudentRequest) = StudentModel(
            cpf = studentRequest.cpf,
            name = studentRequest.name,
            birthday = LocalDateTime.parse(studentRequest.birthday),
            gender = Gender.valueOf(studentRequest.gender.toString()),
            studentId =  null,
            createdAt = null,
            updatedAt = null
        )
    }
}


