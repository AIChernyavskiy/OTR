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
        while (true) {
            printFirstMessage();
            headRange = scanner.nextLine();
            printSecondMessage();
            tailRange = scanner.nextLine();
                new IPAddressValidator().validate(headRange);
        }
    }

    private void printFirstMessage() {
        System.out.println("Введите начальный IP адрес диапозона или exit для выхода");
    }

    private void printSecondMessage() {
        System.out.println("Введите конечный IP адрес диапозона или exit для выхода");
    }

}
