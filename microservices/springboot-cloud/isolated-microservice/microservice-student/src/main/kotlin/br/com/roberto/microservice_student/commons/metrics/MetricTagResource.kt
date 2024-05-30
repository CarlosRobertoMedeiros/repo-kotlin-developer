package br.com.roberto.microservice_student.commons.metrics

object MetricTagResource {

    //INTERNAL
    const val CONTROLLER_POST_STUDENT   = "controller_post_student"
    const val CONTROLLER_GET_STUDENT    = "controller_get_student"
    const val CONTROLLER_PUT_STUDENT    = "controller_put_student"
    const val CONTROLLER_DELETE_STUDENT = "controller_delete_student"

    const val SERVICE_INSERT_STUDENT    = "service_insert_student"
    const val SERVICE_RETRIEVE_STUDENT  = "service_retrieve_student"
    const val SERVICE_UPDATE_STUDENT    = "service_update_student"
    const val SERVICE_DELETE_STUDENT    = "service_delete_student"

    //EXTERNAL
    const val RESOURCE_GET_GRADES_SERVICE =  "resource_get_grades_service"
    const val RESOURCE_POST_GRADES_SERVICE = "resource_post_grades_service"
}