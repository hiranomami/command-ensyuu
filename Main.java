import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("身長を入力");
        double h = scanner.nextDouble();
        System.out.println("体重を入力");
        double w = scanner.nextDouble();

        double i =  w / ((h / 100) * (h / 100));
        System.out.println(String.format("%.2f",i));
    }
}