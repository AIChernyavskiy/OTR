package otr;

import otr.first.FirstTask;
import otr.second.SecondTask;

import java.util.Scanner;

public class Main {

    static void printMainMenu() {
        System.out.println("1-Первое задание");
        System.out.println("2-Второе задание");
        System.out.println("exit-для выхода");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RunTask firstTask = new FirstTask(in);
        RunTask secondTask = new SecondTask(in);
        printMainMenu();
        String stringMainMenu;
        while (!(stringMainMenu = in.nextLine()).equals("exit")) {
            switch (stringMainMenu) {
                case "1":
                    runTask(firstTask);
                    break;
                case "2":
                    runTask(secondTask);
                    break;
                default:
                    System.out.println("Введите 1 или 2 для продолжения, или exit для завершения");
            }
            printMainMenu();
        }
    }

    static void runTask(RunTask task) {
        task.executeTask();
    }
}
