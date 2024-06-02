package br.com.roberto.microservice_student.resource.config

import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClients
import org.bson.codecs.configuration.CodecRegistries
import org.bson.codecs.configuration.CodecRegistry
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory

@Configuration
class MongoConfig {

    @Value("spring.data.mongodb.database")
    private val databaseName: String = "db_student"

    @Bean
    fun mongoTemplate(): MongoTemplate {
        val codecRegistry: CodecRegistry = CodecRegistries.fromRegistries(
            MongoClientSettings.getDefaultCodecRegistry(),
            CodecRegistries.fromCodecs(OffsetDateTimeCodec())
        )

        val mongoClientSettings = MongoClientSettings.builder()
            .codecRegistry(codecRegistry)
            .build()

        val mongoClient = MongoClients.create(mongoClientSettings)
        val factory = SimpleMongoClientDatabaseFactory(mongoClient, "db_student"/*"your_database_name"*/)

        return MongoTemplate(factory)
    }
}
