import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("How many numbers you want to enter: ");
        int n=sc.nextInt();

        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the position");
        int pos=sc.nextInt();
        System.out.println("enter the value");
        int val=sc.nextInt();
        for(int i=n;i>pos;i--){
            a[i]=a[i-1];
        }
        a[pos]=val;
        System.out.println("numbers after inserting");
        for(int i =0;i<=n;i++){
            System.out.println(a[i]);
        }
    }
}