package br.com.roberto.microservice_student.commons.logs

import br.com.roberto.microservice_student.commons.logs.LogTagResource.CONTROLLER
import br.com.roberto.microservice_student.commons.logs.LogTagResource.SERVICE
import br.com.roberto.microservice_student.commons.logs.LogTagResource.STUDENT

object LogMessages {

    object StudentController{
        const val CONTROLLER_STUDENT_RESTRICTIVE_START = "[${STUDENT}_${CONTROLLER}] " +
            "Starting process to student restrictive for [%s] identifier"

        const val CONTROLLER_STUDENT_RESTRICTIVE_SUCCESS = "[${STUDENT}_${CONTROLLER}] " +
                "Success getting student restrictive by identifier [%s]"

        const val CONTROLLER_STUDENT_RESTRICTIVE_ERROR = "[${STUDENT}_${CONTROLLER}] " +
                "Error when trying to get student by identifier [%s] "

    }

    object StudentService{
        const val SERVICE_STUDENT_RESTRICTIVE_START = "[${STUDENT}_${SERVICE}] " +
                "Starting process to student restrictive for [%s] identifier"

        const val SERVICE_STUDENT_RESTRICTIVE_SUCCESS = "[${STUDENT}_${SERVICE}] " +
                "Success getting student restrictive by identifier [%s]"

        const val SERVICE_STUDENT_RESTRICTIVE_ERROR = "[${STUDENT}_${SERVICE}] " +
                "Error when trying to get student by identifier [%s] "

    }
}