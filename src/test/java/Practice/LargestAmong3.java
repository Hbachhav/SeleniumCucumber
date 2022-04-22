package Practice;

public class LargestAmong3 {

    public static void main(String[] args) {

        int a=101;
        int b=111;
        int c=140;


       if(a>=b && a>=c)
       {
           System.out.println(a+"  Is largest no");
       }

       else if(b>=c)
        {
            System.out.println(b+" Is largest no");
        }
        else
       {
           System.out.println(c+" Is largest no");

       }


    }
}
