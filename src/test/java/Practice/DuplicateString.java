package Practice;

public class DuplicateString {

    public static void main(String[] args) {

        String str = "Great responsibility";

       char[] ab = str.toCharArray();

       System.out.println("String is:  "+str);
        System.out.println("Duplicate character as per below");

       for(int i=0;i<str.length();i++){
           for(int j=i+1;j<str.length();j++){
               if(ab[i]==ab[j] && ab[i]!=0){
                System.out.print(ab[j]+" ");
                break;
               }
           }
       }


    }
}
