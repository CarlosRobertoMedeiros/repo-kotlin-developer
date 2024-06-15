package br.com.roberto.microservice_student.domain.model.enum

enum class Gender(val fullName: String) {
    M("male"),
    F("female");

    companion object {
        fun from(input: String): Gender? {
            return values().find { it.name == input }
        }
    }
}