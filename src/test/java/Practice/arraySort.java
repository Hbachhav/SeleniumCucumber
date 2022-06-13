package Practice;

public class arraySort {
    public static void main(String[] args) {

       int[] a= {0,1,1,1,0,0,1};


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
           System.out.print("sorted   "+a[i]);
       }


    }
}
