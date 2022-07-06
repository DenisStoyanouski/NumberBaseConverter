package converter;

import java.util.Scanner;

public class Main {
    static int decimal;
    static int targetBase;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number in decimal system: ");
        decimal = scanner.nextInt();
        System.out.print("Enter target base: ");
        targetBase = scanner.nextInt();

        switch (targetBase) {
            case 2:
                System.out.printf("Conversion result: %s", Integer.toBinaryString(decimal));
                break;
            case 8:
                System.out.printf("Conversion result: %s", Integer.toOctalString(decimal));
                break;
            case 16:
                System.out.printf("Conversion result: %s", Integer.toHexString(decimal));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
