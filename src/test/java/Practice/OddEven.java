package Practice;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("ENter no:");
        int num = reader.nextInt();

            if(num%2 == 0)
            {
                System.out.println("Its an Even no");
            }
            else
            {
                System.out.println("Its an Odd no");
            }

    }
}
