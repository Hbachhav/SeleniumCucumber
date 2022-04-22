package Practice;

public class arraySort {
    public static void main(String[] args) {

       int[] a= {1,3,2,9,5};


       for(int i=0;i<a.length;i++){
           for(int j=i+1;j< a.length;j++)
           {
               int temp;
               if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
               }
           }
           System.out.println("sorted   "+a[i]);
       }


    }
}
