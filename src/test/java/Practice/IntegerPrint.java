package Practice;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Scanner;

public class IntegerPrint
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter : ");
        int num= reader.nextInt();

        System.out.println("Integeris  " +num);

    }
}
