package br.com.roberto.microservice_student.domain.contracts.service

import br.com.roberto.microservice_student.domain.model.StudentModel
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface StudentService {
    fun getStudents(pageable: Pageable): Page<StudentModel>
    fun addStudent(studentModel: StudentModel) : StudentModel
    fun deleteStudent(studentId: String) : Boolean
    fun findByCpf(cpf: String): StudentModel
    fun findById(studentId: String): StudentModel?
    fun findByName(name: String): StudentModel?
    fun updateStudent(id: Long, updatedStudent: StudentModel): StudentModel?
}