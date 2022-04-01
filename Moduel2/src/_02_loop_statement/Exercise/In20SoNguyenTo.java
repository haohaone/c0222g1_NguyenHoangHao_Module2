package _02_loop_statement.Exercise;

public class In20SoNguyenTo {
    public static void main(String[] args) {
        int num=1;
        int soLuongSoNt=0;
        while (true){
            int count=0;
            for (int i = 1; i <= num; i++) {
                if (num%i==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(num);
                soLuongSoNt++;
            }
            num++;
            if (soLuongSoNt==20){
                break;
            }
        }
    }
}
