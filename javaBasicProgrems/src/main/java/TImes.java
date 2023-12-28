import java.time.LocalDateTime;

/**
 * @BelongsProject: javaBasic
 * @BelongsPackage: PACKAGE_NAME
 * @Author: cywork
 * @CreateTime: 2023-12-21  10:23
 * @Description: TODO
 * @Version: 1.0
 */
public class TImes {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        int month = localDateTime.getMonthValue();
        int day = localDateTime.getDayOfMonth();
        System.out.println("month = " + month);
        System.out.println("day = " + day);


    }

}
