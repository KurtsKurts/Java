package HomeWork2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class second {
    public static String readFile(String path) {
        String line = "";
        try {
            String str;
            File file = new File(path);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            while ((str = bf.readLine()) != null) {
                line += str + "\n";
            }
            bf.close();
            return line;
        } catch (Exception e) {
            return line;
        }
    }

    public static void parser(String line) {
        
        String[] text = new String[] {"Студент", "получил", "по предмету"};
        String[] parseString = line.split("\n");
        for (String string : parseString) {
            String[] studentString = string.split("(:|,)");
            for (int i = 0; i < studentString.length; i++) {
                studentString[i] = studentString[i].replace("\"", "");
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length; i++) {
                sb.append(text[i] + " ");
                sb.append(studentString[i*2 + 1] + " ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        String path = "HomeWork2/school.txt";
        parser(readFile(path));
    }
}
