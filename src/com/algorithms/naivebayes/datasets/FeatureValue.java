package com.algorithms.naivebayes.datasets;

class FeatureValue {
    private String name;
    private int occurences;

    public FeatureValue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getOccurences() {
        return occurences;
    }
}