package com.algorithms.ml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.algorithms.ml.datasets.Data;

public class NaiveBayes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Select your dataset
        String[][] data = Data.WEATHER;
        // String[][] data = Data.CAR;
        // String[][] data = Data.TAN;
        // String[][] data = Data.INCOME;

        double total = data.length - 1;

        String[] headers = data[0];
        ArrayList<HashMap<String, Integer>> maps = new ArrayList<HashMap<String, Integer>>();
        for (int i = 0; i < headers.length; i++) {
            HashMap<String, Integer> map = getMap(getDataByColumn(data, i));
            maps.add(map);
        }

        HashMap<String, String> values = new HashMap<String, String>();

        // Start i from 1 if Data.TAN
        for (int i = 0; i < headers.length - 1; i++) {
            String header = headers[i];
            System.out.println("Enter value for " + header);
            String value = scanner.nextLine();
            values.put(header, value);
        }

        ArrayList<Double> finalResults = new ArrayList<Double>();
        ArrayList<String> outputs = getListofOutput(getDataByColumn(data, maps.size() - 1));
        for (String result : outputs) {

            ArrayList<Double> tempResults = new ArrayList<Double>();
            // Start i from 1 if Data.TAN
            for (int i = 0; i < maps.size() - 1; i++) {
                double valueResult = 0;
                double resultValue = 0;

                for (int j = 1; j < data.length; j++) {
                    if (data[j][i].equals(values.get(headers[i])) && data[j][maps.size() - 1].equals(result)) {
                        resultValue++;
                    }
                }
                resultValue = resultValue / maps.get(i).get(values.get(headers[i]));
                double probValue = maps.get(i).get(values.get(headers[i])) / total;
                double probResult = maps.get(maps.size() - 1).get(result) / total;
                valueResult = (resultValue * probValue) / probResult;
                tempResults.add(valueResult);
            }

            double mul = 1;
            for (double resultValue : tempResults) {
                mul = mul * resultValue;
            }
            finalResults.add(mul * (maps.get(maps.size() - 1).get(result) / total));
        }

        double max = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < finalResults.size(); i++) {
            double result = finalResults.get(i);
            if (result > max) {
                max = result;
                index = i;
            }
        }

        if (index != Integer.MIN_VALUE) {
            System.out.println("Final Answer is: " + outputs.get(index));
        }

        scanner.close();
        return;
    }

    public static String[] getDataByColumn(String[][] data, int column) {
        String[] result = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            result[i] = data[i][column];
        }

        return result;
    }

    public static HashMap<String, Integer> getMap(String[] dataList) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 1; i < dataList.length; i++) {
            String data = dataList[i];
            if (map.containsKey(data)) {
                map.put(data, (map.get(data) + 1));
            } else {
                map.put(data, 1);
            }
        }
        return map;
    }

    public static ArrayList<String> getListofOutput(String[] dataList) {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 1; i < dataList.length; i++) {
            String data = dataList[i];
            if (!list.contains(data)) {
                list.add(data);
            }
        }
        return list;
    }
}