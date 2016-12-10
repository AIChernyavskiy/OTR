package first;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import otr.first.FirstTask;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class FirstTaskTest {

    private Scanner scanner;
    private FirstTask task = new FirstTask(scanner);
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Before
    public void setUp() {
        scanner = new Scanner(System.in);
    }

    @Test
    public void printFirstMessageTest() {
        System.out.print("Введите начальный IP адрес диапозона или exit для выхода");
        Assert.assertEquals("Введите начальный IP адрес диапозона или exit для выхода", outContent.toString());
    }

    @Test
    public void printSecondMessageTest() {
        System.out.print("Введите конечный IP адрес диапозона или exit для выхода");
        Assert.assertEquals("Введите конечный IP адрес диапозона или exit для выхода", outContent.toString());
    }

    @Test
    public void printErrorMessageTest() {
        System.out.print("Некорректно задан диапозон");
        Assert.assertEquals("Некорректно задан диапозон", outContent.toString());
    }

    @Test
    public void exitTest() {
        Assert.assertTrue(true == task.exit("exit"));
    }

}
