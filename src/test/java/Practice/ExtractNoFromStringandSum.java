package Practice;

import io.cucumber.java.sl.In;

public class ExtractNoFromStringandSum {


    public static void main(String[] args) {

        String str = "hie8e78iih";
         String t= "";
         int sum;

         for (int i =0;i<str.length();i++){

             int a=str.charAt(i);

             if(a >=48 && a<=57) {
                 t += (char) a;
             }

         }

         int number = Integer.parseInt(t);
         System.out.println(number);


         for(sum=0;number!=0;number=number/10){
             sum=sum+number%10;


         }
        System.out.println("sum of no is :  "+sum);


    }
}
