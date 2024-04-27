public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <first_number> <second_number>");
            return;
        }

        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[1]);

        double sum = firstNumber + secondNumber;

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
    }
}
