package otr.first;


import otr.RunTask;

import java.util.Scanner;

public class FirstTask implements RunTask {


    private Scanner scanner;

    public FirstTask(Scanner scanner) {
        this.scanner = scanner;
    }

    public void executeTask() {
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
                (new RangeIPAddress(headRange, tailRange)).calculateRange();
            } else {
                printErrorMessage();
            }

        }
    }

    private void printFirstMessage() {
        System.out.println("Введите начальный IP адрес диапозона или exit для выхода");
    }

    private void printSecondMessage() {
        System.out.println("Введите конечный IP адрес диапозона или exit для выхода");
    }

    private void printErrorMessage() {
        System.out.println("Некорректно задан диапозон");
    }

    private boolean exit(String exit) {
        if (exit.equals("exit")) {
            return true;
        } else {
            return false;
        }
    }

    public Scanner getScanner() {
        return scanner;
    }
}
