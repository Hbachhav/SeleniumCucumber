package Practice;

public class thoughworks1 {



        static int extractInt() {

            String str = "abc22def42ghi123";

            str = str.replaceAll("[^\\d]", "");

            str = str.trim();

            str = str.replaceAll(" +", "");

            System.out.println(str);

            int sum = Integer.parseInt(str);

            return sum;


        }


        public void addingSum(int sum){



        }
}
