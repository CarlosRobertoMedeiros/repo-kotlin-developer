package br.com.roberto.microservice_student.resource.config

import org.bson.BsonReader
import org.bson.BsonWriter
import org.bson.codecs.Codec
import org.bson.codecs.DecoderContext
import org.bson.codecs.EncoderContext
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class OffsetDateTimeCodec : Codec<OffsetDateTime> {

    private val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    override fun encode(writer: BsonWriter?, value: OffsetDateTime?, encoderContext: EncoderContext?) {
        writer?.writeString(value?.format(formatter))
    }

    override fun getEncoderClass(): Class<OffsetDateTime> {
        return OffsetDateTime::class.java
    }

    override fun decode(reader: BsonReader?, decoderContext: DecoderContext?): OffsetDateTime {
        return OffsetDateTime.parse(reader?.readString(), formatter)
    }

}