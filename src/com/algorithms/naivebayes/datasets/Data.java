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
                        { "Pete", "brown", "tall", "heavy", "no", "none" },
                        { "John", "brown", "average", "heavy", "no", "none" },
                        { "Katie", "brown", "short", "light", "yes", "none" }, };

        static String[][] CAR = { { "red", "sports", "domestic", "yes" }, { "red", "sports", "domestic", "no" },
                        { "red", "sports", "domestic", "yes" }, { "yellow", "sports", "domestic", "no" },
                        { "yellow", "sports", "imported", "yes" }, { "yellow", "suv", "imported", "no" },
                        { "yellow", "suv", "imported", "yes" }, { "yellow", "suv", "domestic", "no" },
                        { "red", "suv", "imported", "no" }, { "red", "sports", "imported", "yes" }, };

        static String[][] INCOME = { { "<=30", "high", "no", "fair", "no" },
                        { "<=30", "high", "no", "excellent", "no" }, { "31...40", "high", "no", "fair", "yes" },
                        { ">40", "medium", "no", "fair", "yes" }, { ">40", "low", "yes", "fair", "yes" },
                        { ">40", "low", "yes", "excellent", "no" }, { "31...40", "low", "yes", "excellent", "yes" },
                        { "<=30", "medium", "no", "fair", "no" }, { "<=30", "low", "yes", "fair", "yes" },
                        { ">40", "medium", "yes", "fair", "yes" }, { "<=30", "medium", "yes", "excellent", "yes" },
                        { "31...40", "medium", "no", "excellent", "yes" }, { "31...40", "high", "yes", "fair", "yes" },
                        { ">40", "medium", "no", "excellent", "no" }, };
}
