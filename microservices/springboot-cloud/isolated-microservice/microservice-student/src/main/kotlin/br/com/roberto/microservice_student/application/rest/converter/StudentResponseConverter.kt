package br.com.roberto.microservice_student.application.rest.converter

import br.com.roberto.microservice_student.domain.model.StudentModel
import br.com.roberto.microservice_student.domain.model.enum.Gender
import br.com.roberto.microservice_student.model.StudentResponse

import java.time.OffsetDateTime

data class StudentResponseConverter(
    val studentId: Int,
    val cpf: String,
    val name: String,
    val birthday: OffsetDateTime,
    val gender: Gender,
    val createdAt: OffsetDateTime,
    val updatedAt: OffsetDateTime
) {
    companion object {
        fun fromDomain(studentModel: StudentModel): StudentResponse? {
            val studentId = studentModel.studentId ?: return null
            val cpf = studentModel.cpf ?: return null
            val name = studentModel.name ?: return null
            val birthday = studentModel.birthday ?: return null
            val gender = studentModel.gender ?: return null
            val createdAt = studentModel.createdAt ?: return null
            val updatedAt = studentModel.updatedAt ?: return null

            // Converte para StudentResponse
            return StudentResponse(
                studentId = studentId.toString(),
                cpf = cpf,
                name = name,
                birthday = birthday.toString(),
                createdAt = createdAt.toString(),
                updatedAt = updatedAt.toString(),
                gender = StudentResponse.Gender.F,
            )
        }
    }
}


