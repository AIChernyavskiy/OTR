package first;


import org.junit.Assert;
import org.junit.Test;
import otr.first.IPAddressValidator;

public class IPAdrdressValidatorTest {

    private IPAddressValidator validator = new IPAddressValidator();

    @Test
    public void validateTest() {
        Assert.assertTrue(true == validator.validate("192.168.0.2"));
    }
}
