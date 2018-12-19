package com.aries.playground.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime dateTime)
    {
        return dateTime == null ? null: Timestamp.valueOf(dateTime);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp time)
    {
        return time == null ? null : time.toLocalDateTime();
    }

}

