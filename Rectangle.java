import java.util.Scanner;

public class Rectangle {

public static void main (String args[]) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("ВВедите высоту прямоугольника");
    double height = scanner.nextDouble();

    System.out.println("Введите ширину прямоугольника");
    double width = scanner.nextDouble();

    double area = (height*width);
    System.out.println("Площадь прямоугольника равна: " + area);

}

}


