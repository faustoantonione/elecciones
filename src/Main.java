import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import test.Tests;

public class Main {

    public static void main(String[] args) {

        System.out.println("Iniciando tests...\n");

        Result result = JUnitCore.runClasses(Tests.class);

        System.out.println("Test ejecutados " + result.getRunCount());
        System.out.println("Test ignorados " + result.getIgnoreCount());
        System.out.println("Test fallidos " + result.getFailureCount());

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }

}
