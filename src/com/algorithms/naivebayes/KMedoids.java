package com.algorithms.naivebayes;

import java.util.ArrayList;
import java.util.List;

public class KMedoids {
    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static int cost(Point a, Point b) {
            return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
        }

        public static void printCluster(int clusterNo, Point clusterHead, List<Point> cluster) {
            System.out.println("Cluster Head " + clusterNo + ": (" + clusterHead.x + ", " + clusterHead.y + ")");
            System.out.println("Cluster " + clusterNo + ": ");
            for (Point point : cluster) {
                System.out.print("(" + point.x + ", " + point.y + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(7, 6));
        pointList.add(new Point(2, 6));
        pointList.add(new Point(3, 8));
        pointList.add(new Point(8, 5));
        pointList.add(new Point(7, 4));
        pointList.add(new Point(4, 7));
        pointList.add(new Point(6, 2));
        pointList.add(new Point(7, 3));
        pointList.add(new Point(6, 4));
        pointList.add(new Point(3, 4));

        int index1, index2 = 0, initialCost = Integer.MAX_VALUE, currentCost;
        Point cluster1, cluster2;
        List<Point> firstList = new ArrayList<>(), secondList = new ArrayList<>();
        List<Point> tempFirstList = new ArrayList<>(), tempSecondList = new ArrayList<>();

        while (true) {
            // Randomly choosing two new clusters
            index1 = (int) Math.floor(Math.random() * pointList.size());
            while (index2 == index1)
                index2 = (int) Math.floor(Math.random() * pointList.size());

            cluster1 = pointList.get(index1);
            cluster2 = pointList.get(index2);

            tempFirstList.clear();
            tempSecondList.clear();
            currentCost = 0;

            for (Point point : pointList) {
                int cost1 = Point.cost(point, cluster1);
                int cost2 = Point.cost(point, cluster2);

                if (cost1 < cost2) {
                    currentCost += cost1;
                    tempFirstList.add(point);
                } else {
                    currentCost += cost2;
                    tempSecondList.add(point);
                }
            }

            if (initialCost > currentCost) {
                initialCost = currentCost;
                firstList.clear();
                firstList.addAll(tempFirstList);
                secondList.clear();
                secondList.addAll(tempSecondList);
            } else break;
        }

        System.out.println("Cost: " + currentCost);
        Point.printCluster(1, cluster1, firstList);
        Point.printCluster(2, cluster2, secondList);
    }
}
