package Practice;

public class palindrome {

    public static void main(String[] args) {

        String str = "nayana";
        String revStr = "";

        for (int i=str.length()-1; i>=0; i--){

             revStr = revStr+str.charAt(i);

        }
        if(revStr.equalsIgnoreCase(str))
        {
            System.out.println("This is palindrome String :- " +str);
        }
        else
        {
            System.out.println("This is not palindrome String :- " +str);
        }

    }


}
