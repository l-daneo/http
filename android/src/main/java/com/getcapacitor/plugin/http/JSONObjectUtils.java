package com.getcapacitor.plugin.http;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONObjectUtils {

    public static String getString(JSONObject obj, String name, String defaultValue) {
        try {
            return obj.getString(name);
        } catch (JSONException e) {
            return defaultValue;
        }
    }
}
