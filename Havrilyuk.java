import java.util.Scanner;

public class DimasJavuTukTuk{
    public static void main(String[] args) {
        printPrimitiveTypesInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите число (int): ");
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println("ваше число int: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("неверное значения int.");
        }

        System.out.println("введите число с плавающей точкой (double): ");
        String doubleInput = scanner.nextLine();
        try {
            double doubleValue = Double.parseDouble(doubleInput);
            System.out.println("double перемога: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("double зрада");
        }
// Я нарешті розкладку змінив

        System.out.println("введите short ");
        String shortInput = scanner.nextLine();
        try {
            short shortValue = Short.parseShort(shortInput);
            System.out.println("short: " + shortValue);
        } catch (NumberFormatException e) {
            System.out.println("неверное значение short");
        }
//Ya snova pomenyal obratno haha

        System.out.println("введите long ");
        String longInput = scanner.nextLine();
        try {
            long longValue = Long.parseLong(longInput);
            System.out.println("long: " + longValue);
        } catch (NumberFormatException e) {
            System.out.println("неверное значение long.");
        }

        System.out.println("введи (float): ");
        String floatInput = scanner.nextLine();
        try {
            float floatValue = Float.parseFloat(floatInput);
            System.out.println("float: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("не верное значение float.");
        }

        System.out.println("ввести число (char): ");
        String charInput = scanner.nextLine();
        if (charInput.length() == 1) {
            char charValue = charInput.charAt(0);
            System.out.println("char: " + charValue);
        } else {
            System.out.println("не верное значение char.");
        }

        System.out.println("вести булевое (true/false): ");
        String booleanInput = scanner.nextLine();
        try {
            boolean booleanValue = Boolean.parseBoolean(booleanInput);
            System.out.println("boolean: " + booleanValue);
        } catch (Exception e) {
            System.out.println("не верное значение boolean.");
        }

        scanner.close();
    }

    public static void printPrimitiveTypesInfo() {
        System.out.println("info:");
        
        System.out.println("int: =" + Integer.SIZE + " bit, минимальное значение = " + Integer.MIN_VALUE + ", максимальное значение = " + Integer.MAX_VALUE);
        System.out.println("double: = " + Double.SIZE + " bit,минимальное значение = " + Double.MIN_VALUE + ", максимальное значение = " + Double.MAX_VALUE);
        System.out.println("short: = " + Short.SIZE + " bit, минимальное значение = " + Short.MIN_VALUE + ",максимальное значение = " + Short.MAX_VALUE);
        System.out.println("long: = " + Long.SIZE + " bit, минимальное значение = " + Long.MIN_VALUE + ", максимальное значение = " + Long.MAX_VALUE);
        System.out.println("float: = " + Float.SIZE + " bit, минимальное значение = " + Float.MIN_VALUE + ", максимальное значение = " + Float.MAX_VALUE);
        System.out.println("char: = " + Character.SIZE + " bit, минимальное значение = " + (int) Character.MIN_VALUE + ", максимальное значение = " + (int) Character.MAX_VALUE);
        System.out.println("boolean: = true/false");
    }
}

