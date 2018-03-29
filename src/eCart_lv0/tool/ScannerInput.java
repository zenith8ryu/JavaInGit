package eCart_lv0.tool;

import java.util.Scanner;

public class ScannerInput {

    /**
     * Common keyboard scanner
     *
     * @return
     */
    public static String ScanerInfoString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input: ");
        return sc.next();
    }

    /**
     * KB scanner for choice.
     *
     * @return
     */
    public static String ScannerInfoChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your choice: ");
        return sc.next();
    }

    /**
     * KB scanner for num input.
     *
     * @return
     */
    public static Integer ScannerInfoNum() {
        Integer num = 0;
        String regex = "[1-9][0-9]*";

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input your number: ");
            String input = sc.next();

            if (input.matches(regex)) {
                System.out.println("Your input is " + input);
                num = Integer.parseInt(input);
            } else {
                System.out.println("Your input is not a integer number.");
                continue;
            }
            break;
        } while (true);

        return num;
    }

    /**
     * KB scanner for price input.
     *
     * @return
     */
    public static Double ScannerInfoPrice() {
        Double price = Double.valueOf(0);
        String regex = "[0-9]+\\.[0-9]{2}";

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input good price: ");
            String input = sc.next();

            if (input.matches(regex)) {
                System.out.println("Your input is " + input);
                price = Double.parseDouble(input);
            } else {
                System.out.println("Your input is not a price (only double num, accuracy of 2 decimal digits is permitted).");
                continue;
            }
            break;

        } while (true);

        return price;
    }
}
