package br.com.roberto.solid.ocp.violation

class PostgresRepository {
    fun save(order: Order): Boolean {
        val dbConnection = PostGresConnection()
        dbConnection.connect("database-url")

        return try {
            dbConnection.persist(order)
            true
        } catch (e: Exception) {
            //log
            false
        }
    }
}