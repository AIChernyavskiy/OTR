package first;


import org.junit.Assert;
import org.junit.Test;
import otr.first.RangeIPAddress;

public class RangeIPAddressTest {

    private RangeIPAddress address= new RangeIPAddress("192.168.0.5","192.168.0.10");


    @Test
    public void checkIPAdressTest() {
        Assert.assertTrue(true == address.checkIPAdress());
    }

    @Test
    public void getFourthBitTest() {
        Assert.assertNotNull(address.getFourthBit("192.168.0.5"));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getFourthBitTestArrayIndexException() {
        address.getFourthBit("192.168.0");
    }

    @Test(expected = NumberFormatException.class)
    public void getFourthBitTestNumberFormatException() {
        address.getFourthBit("192.168.0.s");
    }
}
