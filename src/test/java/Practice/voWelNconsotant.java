package Practice;

import java.util.Scanner;

public class voWelNconsotant {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        System.out.println("Enter Char: ");
        char ch = reader.next().charAt(0);






        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("this is Vowel>>>>" +ch);

        }
        else {
            System.out.println("this is Constoanet>>>>>" +ch);
        }

    }
}
