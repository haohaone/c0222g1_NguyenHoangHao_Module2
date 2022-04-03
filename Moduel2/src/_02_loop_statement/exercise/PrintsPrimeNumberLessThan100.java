package _02_loop_statement.exercise;

public class PrintsPrimeNumberLessThan100 {
    public static void main(String[] args) {
        int num=1;
        while (true){
            int count=0;
            for (int i = 1; i <= num; i++) {
                if (num%i==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(num);

            }
            if (num==100){
                break;
            }
            num++;
        }
    }
}
