package Practice;

import java.util.Arrays;

public class SegrateArrayzeroNone {


    public static void main(String[] args) {

        String str ="01001010";

        char[] ch = str.toCharArray();

        Arrays.sort(ch);


        System.out.print(ch);

        {
            int[] arr = new int[]{0,1,0,0,1,0,1,0};

            Arrays.sort(arr);
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }



        }

    }
}
