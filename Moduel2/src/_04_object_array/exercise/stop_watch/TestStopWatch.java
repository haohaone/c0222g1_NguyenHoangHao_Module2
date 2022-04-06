package _04_object_array.exercise.stop_watch;

import java.util.Scanner;

public class TestStopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch.StopCountTime stopWatch = new StopWatch.StopCountTime();
        int [] Array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            Array[i] = (int)Math.floor(Math.random()*100000);
        }
        System.out.println("Bắt đầu đếm giờ bấm Start:");
        while (true){
            String enter = scanner.nextLine();
            if (enter.equals("Start")){
                break;
            }
        }
        stopWatch.start();
        System.out.println("Thời gian bắt đầu: "+stopWatch.getStarTime());
        int [] newArr = new int[100000];
        int a = 0;
        for (int i = 1; i <= 100000; i++) {
            for (int j = 0; j < Array.length; j++) {
                if (i == Array[j] ){
                    newArr[a] = Array[j];
                    a++;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Thời gian vừa bấm giờ là: "+stopWatch.getEndTime());
        System.out.println(stopWatch.getEndTime() - stopWatch.getStarTime());
    }
}
