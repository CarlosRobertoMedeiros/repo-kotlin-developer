package br.com.roberto.microservice_student.domain.services

import br.com.roberto.microservice_student.domain.contracts.service.StudentService
import br.com.roberto.microservice_student.domain.model.StudentModel
import br.com.roberto.microservice_student.domain.model.enum.Gender
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.ZoneOffset

@Service
class StudentServiceImpl() : StudentService {
    override fun addStudent(studentModel: StudentModel): StudentModel {
        return StudentModel(
            1L,
            "11476009023",
            "Matheus",
            OffsetDateTime.of(LocalDate.of(1981, 12, 12).atStartOfDay(), ZoneOffset.UTC),
            Gender.M,
            OffsetDateTime.of(LocalDate.of(1981, 12, 12).atStartOfDay(), ZoneOffset.UTC),
            OffsetDateTime.of(LocalDate.of(1981, 12, 12).atStartOfDay(), ZoneOffset.UTC)
        )
    }

}