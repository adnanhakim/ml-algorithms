package com.algorithms.naivebayes.datasets;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Data {

    public static String[][] WEATHER = { { "outlook", "temperature", "humidity", "windy", "class" },
            { "sunny", "hot", "high", "false", "N" }, { "sunny", "hot", "high", "true", "N" },
            { "overcast", "hot", "high", "false", "P" }, { "rain", "mild", "high", "false", "P" },
            { "rain", "cool", "normal", "false", "P" }, { "rain", "cool", "normal", "true", "N" },
            { "overcast", "cool", "normal", "true", "P" }, { "sunny", "mild", "high", "false", "N" },
            { "sunny", "cool", "normal", "false", "P" }, { "rain", "mild", "normal", "false", "P" },
            { "sunny", "mild", "normal", "true", "P" }, { "overcast", "mild", "high", "true", "P" },
            { "overcast", "hot", "normal", "false", "P" }, { "rain", "mild", "high", "true", "N" } };

    public static String[][] TAN = { { "name", "hair", "height", "weight", "dublin", "result" },
            { "Sarah", "blonde", "average", "light", "no", "sunburned" },
            { "Dana", "blonde", "tall", "average", "yes", "none" },
            { "Alex", "brown", "short", "average", "yes", "none" },
            { "Annie", "blonde", "short", "average", "no", "sunburned" },
            { "Emily", "red", "average", "heavy", "no", "sunburned" },
            { "Pete", "brown", "tall", "heavy", "no", "none" }, { "John", "brown", "average", "heavy", "no", "none" },
            { "Katie", "brown", "short", "light", "yes", "none" }, };

    public static String[][] CAR = { { "color", "type", "origin", "stolen" }, { "red", "sports", "domestic", "yes" },
            { "red", "sports", "domestic", "no" }, { "red", "sports", "domestic", "yes" },
            { "yellow", "sports", "domestic", "no" }, { "yellow", "sports", "imported", "yes" },
            { "yellow", "suv", "imported", "no" }, { "yellow", "suv", "imported", "yes" },
            { "yellow", "suv", "domestic", "no" }, { "red", "suv", "imported", "no" },
            { "red", "sports", "imported", "yes" }, };

    public static String[][] INCOME = { { "age", "income", "student", "credit_rating", "buys_computer" },
            { "<=30", "high", "no", "fair", "no" }, { "<=30", "high", "no", "excellent", "no" },
            { "31...40", "high", "no", "fair", "yes" }, { ">40", "medium", "no", "fair", "yes" },
            { ">40", "low", "yes", "fair", "yes" }, { ">40", "low", "yes", "excellent", "no" },
            { "31...40", "low", "yes", "excellent", "yes" }, { "<=30", "medium", "no", "fair", "no" },
            { "<=30", "low", "yes", "fair", "yes" }, { ">40", "medium", "yes", "fair", "yes" },
            { "<=30", "medium", "yes", "excellent", "yes" }, { "31...40", "medium", "no", "excellent", "yes" },
            { "31...40", "high", "yes", "fair", "yes" }, { ">40", "medium", "no", "excellent", "no" }, };

    static Map<String, String[][]> datas = Collections.unmodifiableMap(new HashMap<String, String[][]>() {
        private static final long serialVersionUID = 1L;
        {
            put("WEATHER", WEATHER);
            put("TAN", TAN);
            put("CAR", CAR);
            put("INCOME", INCOME);
        }
    });
}
