package otr.first;


public class RangeIPAddress {

    String headRange;
    String tailRange;

    public RangeIPAddress(String headRange, String tailRange) {
        this.headRange = headRange;
        this.tailRange = tailRange;
    }

    public void calculateRange() {
        if (checkIPAdress()) {
            printRange();
        } else {
            printErrorMessage();
        }
    }

    public boolean checkIPAdress() {
        int low = getFourthBit(headRange);
        int top = getFourthBit(tailRange);
        if ((top - low) > 1) {
            return true;
        } else {
            return false;
        }
    }

    public int getFourthBit(String str) {
        String[] strings = str.split("\\.");
        int bit = Integer.valueOf(strings[3]);
        return bit;
    }

    private void printRange() {
        int low = getFourthBit(headRange);
        int top = getFourthBit(tailRange);
        for (int i = (low + 1); i < top; i++) {
            System.out.println("192.168.0." + i);
        }
    }

    private void printErrorMessage() {
        System.out.println("Некорректно задан диапозон");
    }

    public String getHeadRange() {
        return headRange;
    }

    public void setHeadRange(String headRange) {
        this.headRange = headRange;
    }

    public String getTailRange() {
        return tailRange;
    }

    public void setTailRange(String tailRange) {
        this.tailRange = tailRange;
    }

}
