package Practice;

public class palindromeString {

    public static void main(String[] args) {

        String str = "HItesh";

        String revStr = "";

        for(int i=str.length()-1;i>=0;i--)
        {
            revStr = revStr+str.charAt(i);
        }
        if(revStr.equalsIgnoreCase(str))
        {
            System.out.println("This is palindrome string:     " +str);

        }
        else
        {
            System.out.println("This is not palindrome string:    " +str);
        }
    }
}
