package _04_object_array.exercise.stop_watch;

import java.util.Scanner;

public class StopWatch {
    public static class StopCountTime {
        private double starTime, endTime;

        StopCountTime(){

        }

        public double getStarTime(){
            return this.starTime;
        }

        public double getEndTime(){
            return this.endTime;
        }

        public void start(){
            this.starTime = System.currentTimeMillis();
        }

        public void stop(){
            this.endTime = System.currentTimeMillis();
        }

    }
}
