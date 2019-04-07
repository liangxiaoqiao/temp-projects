package com.colter.demo.config;

import com.colter.demo.other.Other;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @author liangchao
 * created on 4/7/2019 1:33 PM
 * desc:
 */
public class MySerializable extends JsonSerializer<Other> {

    @Override
    public void serialize(Other value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.toString() + " myCustom");
    }

    @Override
    public Class<Other> handledType() {
        return Other.class;
    }
}
