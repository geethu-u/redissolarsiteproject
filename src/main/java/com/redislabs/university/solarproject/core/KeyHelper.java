package com.redislabs.university.solarproject.core;

public class KeyHelper {

    final private static String defaultPrefix = "app";

    private static String prefix = null;

    public static void setPrefix(String keyPrefix) {
        prefix = keyPrefix;
    }

    public static String getKey(String key) {
        return getPrefix() + ":" + key;
    }

    public static String getPrefix() {
        if (prefix != null) {
            return prefix;
        } else {
            return defaultPrefix;
        }
    }
}
