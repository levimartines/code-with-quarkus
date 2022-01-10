package dev.levimartines.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum ClientTypeEnum {

    PHYSICAL_PERSON((short) 1, "Physical Person"),
    JURIDICAL_PERSON((short) 2, "Juridical Person");

    private final Short id;
    private final String description;

    private static final Map<Short, ClientTypeEnum> LOOKUP_BY_ID = new HashMap<>();

    ClientTypeEnum(Short id, String description) {
        this.id = id;
        this.description = description;
    }


    public static ClientTypeEnum valueOfId(Short id) {
        return LOOKUP_BY_ID.get(id);
    }

    static {
        ClientTypeEnum[] var0 = values();
        for (ClientTypeEnum e : var0) {
            LOOKUP_BY_ID.put(e.getId(), e);
        }
    }
}
