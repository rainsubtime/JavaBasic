import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

/**
 * @BelongsProject: javaBasic
 * @BelongsPackage: PACKAGE_NAME
 * @Author: cywork
 * @CreateTime: 2023-12-20  15:31
 * @Description: TODO
 * @Version: 1.0
 */
public class PrimitiveTypes {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("d:\\txt.txt"),"utf-8");
        String txt = scanner.nextLine();
        System.out.println(txt);
    }

}
