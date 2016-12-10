package second;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import otr.second.SecondTask;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SecondTaskTest {

    private Scanner scanner;
    private SecondTask task = new SecondTask(scanner);

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void exitTest() {
        Assert.assertTrue(true == task.exit("exit"));
    }

    @Test
    public void printMessageTest() {
        System.out.print("Введите ФИО или exit для выхода");
        Assert.assertEquals("Введите ФИО или exit для выхода", outContent.toString());
    }

}
