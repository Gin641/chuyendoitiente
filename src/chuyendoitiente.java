import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        usd = sc.nextDouble();
        double trade = usd * 23000;
        System.out.println("giá trị VND : " + trade);
    }
}
