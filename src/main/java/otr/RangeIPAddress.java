package otr;


import java.util.Scanner;

public class RangeIPAddress {

    private Scanner scanner;
    private String headRange;
    private String tailRange;

    public RangeIPAddress(Scanner scanner, String headRange, String tailRange) {
        this.scanner = scanner;
        this.headRange = headRange;
        this.tailRange = tailRange;
    }

    public void calculateRange() {
        if (chechIPAdress()) {
            printRange();
        } else {
            printErrorMessage();
        }
    }

    private boolean chechIPAdress() {
        String[] head = headRange.split(".");
        String[] tail = tailRange.split(".");
        int low = Integer.valueOf(head[3]);
        int top = Integer.valueOf(tail[3]);
        if ((top - low) > 0) {
            return true;
        } else {
            return false;
        }
    }

    private void printRange() {

    }

    private void printErrorMessage() {
    }

}
