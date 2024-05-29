import java.util.Scanner;

import Counter.Counter;
import Exceptions.InvalidParametersException;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int firstParam = scan.nextInt();

        System.out.print("Digite o primeiro parâmetro: ");
        int secondParam = scan.nextInt();

        try {
            Counter counter = new Counter();
            counter.count(firstParam, secondParam);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}
