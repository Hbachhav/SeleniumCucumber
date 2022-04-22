package Practice;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.apache.tools.ant.types.selectors.SelectSelector;

import java.util.HashMap;

public class NoOfOccuranceString {


    public static void main(String[] args) {

       String str1 = "Nayan";
        String str = str1.toLowerCase();

       HashMap<Character ,Integer> charCount = new HashMap<>();

       for(int i=str.length()-1; i>=0; i--)
       {
           if(charCount.containsKey(str.charAt(i)))
           {
               int count = charCount.get(str.charAt(i));
               charCount.put(str.charAt(i), ++count);

           }
           else
           {
                charCount.put(str.charAt(i),1);
           }

       }

       System.out.println(charCount);
    }
}
