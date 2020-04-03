package com.algorithms.naivebayes.datasets;

public class Data {

    static String[][] WEATHER = { { "outlook", "temperature", "humidity", "windy", "class" },
            { "sunny", "hot", "high", "false", "N" }, { "sunny", "hot", "high", "true", "N" },
            { "overcast", "hot", "high", "false", "P" }, { "rain", "mild", "high", "false", "P" },
            { "rain", "cool", "normal", "false", "P" }, { "rain", "cool", "normal", "true", "N" },
            { "overcast", "cool", "normal", "true", "P" }, { "sunny", "mild", "high", "false", "N" },
            { "sunny", "cool", "normal", "false", "P" }, { "rain", "mild", "normal", "false", "P" },
            { "sunny", "mild", "normal", "true", "P" }, { "overcast", "mild", "high", "true", "P" },
            { "overcast", "hot", "normal", "false", "P" }, { "rain", "mild", "high", "true", "N" } };

    static String[][] TAN = { { "name", "hair", "height", "weight", "dublin", "result" },
            { "Sarah", "blonde", "average", "light", "no", "sunburned" },
            { "Dana", "blonde", "tall", "average", "yes", "none" },
            { "Alex", "brown", "short", "average", "yes", "none" },
            { "Annie", "blonde", "short", "average", "no", "sunburned" },
            { "Emily", "red", "average", "heavy", "no", "sunburned" },
            { "Pete", "brown", "tall", "heavy", "no", "none" }, { "John", "brown", "average", "heavy", "no", "none" },
            { "Katie", "brown", "short", "light", "yes", "none" }, };
}
