package otr.second;


import otr.RunTask;

import java.util.*;

public class SecondTask implements RunTask {

    private Scanner scanner;

    public SecondTask(Scanner scanner) {
        this.scanner = scanner;
    }


    public void executeTask() {
        String fio;
        while (true) {
            printMessage();
            fio = scanner.nextLine();
            if (exit(fio)) {
                break;
            } else {
                (new PrintTelephone(fio)).checkFio();
            }
        }
    }

    private void printMessage() {
        System.out.println("Введите ФИО или exit для выхода");
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
