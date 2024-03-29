import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            //Đọc file theo đường dẫn
            File file = new File(filePath);

            // kiểm tra file không tồn tại thì ném ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // đọc từng dòng của file và tổng cộng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            //Hiển thị ra màn hình
            System.out.println("tổng= "+ sum);
        }catch (Exception e){
            // file lỗi hay sao đó thì hiện
            System.err.println("File không tồn tại hoặc lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}

