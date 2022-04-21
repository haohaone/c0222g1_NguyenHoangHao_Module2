package _16_io_text_file.exercise.copy_file;

import java.io.File;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        File sourceFile = new File("src\\_16_io_text_file\\exercise\\copy_file\\source_file.txt");
        File targetFile = new File("src\\_16_io_text_file\\exercise\\copy_file\\target_file.txt");

        List<String> list = ReadAndWrite.readString(sourceFile);

        int countChar = 0;
        for (int i = 0; i < list.size(); i++) {
            ReadAndWrite.write(targetFile, list.get(i));
            countChar += list.get(i).length();
        }

        System.out.println("Copy thành công! \n file có " + countChar );
    }
}
