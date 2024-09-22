import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 // 1-task :
        Car obj = new Car();
        obj.setColor("Black");
        obj.setModel("BMW");
        obj.setType("Automatic");
        obj.setPrice(40000);

 // 2-task :
        Triangle obj2 = new Triangle();
        System.out.println(obj2.getPerimetr(5 , 6 , 8));
        System.out.println(obj2.getArea(6,8,10));

 // 3-task  :
        Scanner scanner = new Scanner(System.in);
        Point obj3 = new Point();
        System.out.println(" Enter points");
        obj3.setA(scanner.nextInt());
        obj3.setB(scanner.nextInt());
        obj3.setC(scanner.nextInt());

    }
}