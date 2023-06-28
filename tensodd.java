public class tensodd {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int temp;
        int a[] =new int[arr.length];
        for (int j = 0; j < arr.length; j++) 
            
        {
        temp = (arr[j] / 10) % 10;
        a[j]=temp;
        }
        for (int i = 0; i <= a.length-1; i++) {
            if(a[i]%2!=0){
                int s = a[i];
                System.out.println(s);
            }
        }
    }
}
