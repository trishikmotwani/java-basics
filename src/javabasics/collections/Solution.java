package javabasics.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {
    public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {

        ConcurrentHashMap<String,AppsRating> statsMap = new ConcurrentHashMap<String,AppsRating>();
        @Override
        public void putNewRating(String app, int rating){
            // YOUR CODE HERE
            if(statsMap.get(app) != null) {
                (statsMap.get(app)).setRating(rating);
                (statsMap.get(app)).setCount((statsMap.get(app)).getCount());
            } else {
                AppsRating ar = new AppsRating();
                ar.setCount(1);
                ar.setRating(rating);
            }
        }

        @Override
        public double getAverageRating(String app){
            // YOUR CODE HERE

            return (statsMap.get(app)).getCount();

            // for (String app : apps) {
            //     System.out.println(
            //             String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
            // }
        }

        @Override
        public int getRatingsCount(String app){
            // YOUR CODE HERE
            // return (statsMap.get(app)).getCount();
            return 2;
        }
    }

    public static class AppsRating {

        private int rating;
        private int count = 0;

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating += rating;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count += count;
        }
        
    }
    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingStatisticsCollector {
        // Ratings feed will call this method when new app rating information is received. This is input to your class. ratings is a non negative integer between 0 to 10.
        public void putNewRating(String app, int rating);

        // Report the average rating of the app. 
        public double getAverageRating(String app);

        // Report the total number of rating for an app.
        public int getRatingsCount(String app);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
            final Set<String> apps = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String app = tokens[0];
                apps.add(app);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewRating(app, runs);

            }

            for (String app : apps) {
                System.out.println(
                        String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
            }

        }
        scanner.close();

    }
}