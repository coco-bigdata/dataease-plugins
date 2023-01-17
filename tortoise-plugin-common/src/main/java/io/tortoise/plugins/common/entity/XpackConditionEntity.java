package io.tortoise.plugins.common.entity;

import io.tortoise.plugins.common.annotation.PluginResultMap;
import lombok.Data;

import java.io.Serializable;

@Data
@PluginResultMap
public class XpackConditionEntity implements Serializable {

    private String field;

    private String operator;

    private Object value;
}
