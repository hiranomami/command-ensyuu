import java.util.Scanner;
public class Bmi{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("身長を入力");
        double h = sc.nextDouble();
        double h2 = sc.nextDouble();
        System.out.println("体重を入力");
        double w = sc.nextDouble();
        double w2 = sc.nextDouble();
        double i =  w / ((h / 100) * (h / 100));
        double i2 = w2 / ((h2 / 100) * (h2 / 100));
        System.out.println(String.format("%.2f",i));
        System.out.println(String.format("%.2f",i2));
    }
}
