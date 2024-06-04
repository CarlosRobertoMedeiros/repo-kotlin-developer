package br.com.roberto.microservice_student.application.rest.converter

import br.com.roberto.microservice_student.domain.model.StudentModel
import br.com.roberto.microservice_student.domain.model.enum.Gender
import br.com.roberto.microservice_student.model.StudentResponse

import java.time.OffsetDateTime

data class StudentResponseConverter(
    val studentId: Long,
    val cpf: String,
    val name: String,
    val birthday: OffsetDateTime,
    val gender: Gender,
    val createdAt: OffsetDateTime,
    val updatedAt: OffsetDateTime
) {
    companion object {
        fun fromDomain(studentModel: StudentModel) = StudentResponse(
            studentId =  studentModel.studentId!!,
            cpf = studentModel.cpf,
            name = studentModel.name,
            birthday = studentModel.birthday.toString(),
            gender = StudentResponse.Gender.valueOf(studentModel.gender.toString()),
            createdAt = studentModel.createdAt.toString(),
            updatedAt = studentModel.updatedAt.toString()
        )
    }
}


