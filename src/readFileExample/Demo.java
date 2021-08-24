package readFileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw  new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String lin = "";
            int sum = 0;
            while ((lin = br.readLine()) != null){
                System.out.println(lin);
                sum += Integer.parseInt(lin);
            }
            br.close();
            System.out.println("Total = " +sum);
        }catch ( Exception e){
            System.err.println("Fie does not exist or the content contains an error!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the file path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Demo demo = new Demo();
        demo.readFileText(path);
    }
}
