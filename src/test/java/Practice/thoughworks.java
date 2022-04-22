package Practice;

public class thoughworks {

    public static void main(String[] args) {

        String str = "abc22def42ghi123";

        int ans =0;
        String t="";

        for( int i=0;i<str.length();i++){
            //System.out.println("Value:___" + str.charAt(i));

            if((str.charAt(i)>0) && (str.charAt(i)<9))


            {

                t+=str.charAt(i);



            }
            else {

                ans+=str.charAt(i);
            }

        }
        if (t.length()>0){
            ans+=Integer.parseInt(t);
            System.out.println(ans);

        }
    }
}
