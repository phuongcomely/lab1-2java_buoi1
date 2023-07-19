import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String tenhang = scanner.nextLine();

        System.out.println("Mời bạn nhập ngày tháng năm sinh(yyyy/MM/dd): ");
        String ngaysinh = scanner.nextLine();

        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss): ");
        String thoigianNhaphang = scanner.nextLine();

        System.out.println("Mời bạn nhập thời gian (HH:mm:ss): ");
        String thoiGian = scanner.nextLine();

        System.out.println("'Tên hàng nhập kho: " + tenhang);
        System.out.println("Ngày tháng năm sinh: " + ngaysinh);
        System.out.println("Thời gian nhập hàng: " + thoigianNhaphang);
        System.out.println("Thời gian: "+thoiGian);
    }
}