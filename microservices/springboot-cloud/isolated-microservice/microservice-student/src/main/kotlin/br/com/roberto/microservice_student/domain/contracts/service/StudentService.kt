package br.com.roberto.microservice_student.domain.contracts.service

import br.com.roberto.microservice_student.domain.model.StudentModel

interface StudentService {
    fun addStudent(studentModel: StudentModel) : StudentModel
}