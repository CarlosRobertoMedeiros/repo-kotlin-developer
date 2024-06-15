package br.com.roberto.microservice_student.application.rest.converter

import br.com.roberto.microservice_student.domain.model.StudentModel
import br.com.roberto.microservice_student.domain.model.enum.Gender
import br.com.roberto.microservice_student.model.StudentRequest
import java.time.LocalDateTime

data class StudentRequestConverter(
    val studentId: Long?,
    val cpf: String,
    val name: String,
    val birthday: LocalDateTime,
    val gender: StudentRequest.Gender

) {
    companion object {
        fun toDomain(studentRequest: StudentRequest) = StudentModel(
            studentId = null,
            cpf = studentRequest.cpf,
            name = studentRequest.name,
            birthday = LocalDateTime.parse(studentRequest.birthday),
            gender = toGenderDomain(studentRequest.gender.toString())
        )

        fun toGenderDomain(gender: String): Gender? {
            return Gender.from(gender)
        }
    }
}


