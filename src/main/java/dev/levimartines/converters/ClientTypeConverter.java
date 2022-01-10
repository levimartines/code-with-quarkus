package dev.levimartines.converters;

import dev.levimartines.enums.ClientTypeEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ClientTypeConverter implements AttributeConverter<ClientTypeEnum, Short> {

    @Override
    public Short convertToDatabaseColumn(ClientTypeEnum attribute) {
        return attribute != null ? attribute.getId() : null;
    }

    @Override
    public ClientTypeEnum convertToEntityAttribute(Short id) {
        return ClientTypeEnum.valueOfId(id);
    }
}
