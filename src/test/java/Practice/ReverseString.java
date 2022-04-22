package Practice;

import ch.qos.logback.core.net.SyslogOutputStream;

public class ReverseString {

    public static void main(String[] args) {
        String str ="Hitesh";
        String revStr="";

        for(int i=str.length()-1;i>=0;i--)
        {
            revStr = revStr+str.charAt(i);
        }
        System.out.println("Given string:"+str);
        System.out.println("Reversed  string:"+revStr);


    }
}
