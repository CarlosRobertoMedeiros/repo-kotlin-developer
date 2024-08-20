package br.com.roberto.solid.ocp.solution

class PostGresConnection {

    fun connect(dbUrl:String) {
        println("Simulating create connection in PostgresDB")
    }

    fun persist(order:Order) {
        println("Simulating create connection in PostgresDB")
    }
}