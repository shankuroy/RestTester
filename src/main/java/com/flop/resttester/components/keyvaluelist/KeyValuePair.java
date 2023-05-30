/*
 * Rest Tester
 * Copyright (C) 2022-2023 Florian Plesker <florian dot plesker at web dot de>
 *
 * This file is licensed under LGPLv3
 */

package com.flop.resttester.components.keyvaluelist;

import com.google.gson.JsonObject;

public class KeyValuePair implements Cloneable {

    public String key;
    public String value;

    public KeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public JsonObject getAsJson() {
        JsonObject jObj = new JsonObject();
        jObj.addProperty("key", this.key);
        jObj.addProperty("value", this.value);
        return jObj;
    }

    public static KeyValuePair createFromJson(JsonObject jObj) {
        if (!jObj.has("key") && !jObj.has("value")) {
            throw new RuntimeException("Invalid key value object. Key or value property not found.");
        }
        return new KeyValuePair(jObj.get("key").getAsString(), jObj.get("value").getAsString());
    }

    public KeyValuePair clone() {
        return new KeyValuePair(this.key, this.value);
    }
}