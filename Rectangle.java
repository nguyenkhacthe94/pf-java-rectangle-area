import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        float width = scanner.nextFloat();
        System.out.println("Enter height: ");
        float height = scanner.nextFloat();

        float area = width*height;

        System.out.println("Area = " + area);
    }
}
