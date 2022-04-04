package _04_object_array.exercise;

import java.util.Scanner;

public class StopWatch {
    public static class StopCountTime {
        double starTime, endTime;

        private StopCountTime(){

        }

        public double getStarTime(){
            return this.starTime;
        }

        public double getEndTime(){
            return this.endTime;
        }

        public double start(){
            return this.starTime = System.currentTimeMillis();
        }

        public double stop(){
            return this.endTime = System.currentTimeMillis();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopCountTime stopWatch = new StopCountTime();
        System.out.println("Bắt đầu đếm giờ bấm Start:");
        while (true){
            String enter = scanner.nextLine();
            if (enter.equals("Start")){
                break;
            }
        }
        stopWatch.start();
        System.out.println("Thời gian bắt đầu: "+stopWatch.getStarTime());
        System.out.println("Kết thúc đếm giờ bấm Stop:");
        while (true){
            String stop = scanner.nextLine();
            if (stop.equals("Stop")){
                break;
            }
        }
        stopWatch.stop();
        System.out.println("Thời gian vừa bấm giờ là: "+stopWatch.getEndTime());
    }
}
