package br.com.roberto.microservice_student.domain.repository

import br.com.roberto.microservice_student.domain.model.StudentModel

interface StudentRepository {
    fun addStudent(studentModel: StudentModel) : StudentModel
}

