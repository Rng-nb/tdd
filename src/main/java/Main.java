import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mommifier mommifier = new Mommifier();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String:");
        String string = sc.next();
        String result = mommifier.convert(string);
        System.out.println("Result:" + result);
    }
}
