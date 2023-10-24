import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну сторон треугольника ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        Triangle tit = new Triangle(a,b,c);
        System.out.println(tit.perimeter());
    }
}