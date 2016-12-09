package otr;


import java.util.Scanner;

public class FirstTask {

    private Scanner scanner;

    public FirstTask(Scanner scanner) {
        this.scanner = scanner;
    }

    public void executeFirstTask() {
        String headRange;
        String tailRange;
        IPAddressValidator addressValidator = new IPAddressValidator();
        while (true) {
            printFirstMessage();
            headRange = scanner.nextLine();
            if (exit(headRange)) {
                break;
            }
            printSecondMessage();
            tailRange = scanner.nextLine();
            if (exit(tailRange)) {
                break;
            } else if (addressValidator.validate(headRange) && addressValidator.validate(tailRange)) {
                new RangeIPAddress(scanner, headRange, tailRange).calculateRange();
            } else {

            }

        }
    }

    private void printFirstMessage() {
        System.out.println("Введите начальный IP адрес диапозона или exit для выхода");
    }

    private void printSecondMessage() {
        System.out.println("Введите конечный IP адрес диапозона или exit для выхода");
    }

    private boolean exit(String exit) {
        if (exit.equals("exit")) {
            return true;
        } else {
            return false;
        }
    }

}
