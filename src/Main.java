import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int width=scanner.nextInt();
        System.out.print("Nhập chiều cao: ");
        int height=scanner.nextInt();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.print("Diện tích hình chữ nhật là:"+rectangle.Area());
        System.out.print("\n"+"Chu vi hình chữ nhật là:"+rectangle.Perimeter());
    }
}
