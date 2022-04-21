package _16_io_text_file.practice.read_file;

import java.io.*;

public class ReadFile {
    public static final String FILENAME = "src\\_16_io_text_file\\practice\\read_file\\text.txt";
    public static void main(String[] args) throws IOException {
        File text = new File(FILENAME);
        int sum = 0;
        try(FileReader fileReader = new FileReader(text);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                sum += Integer.parseInt(line);
            }
            System.out.println("tổng: "+sum);
        }catch (FileNotFoundException e){
            System.err.println("Không tìm thấy file");
        }
    }
}
