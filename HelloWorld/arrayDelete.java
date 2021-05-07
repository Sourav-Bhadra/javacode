import java.util.Scanner;

public class arrayDelete{
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
        pos=pos-1;
        for(int i=pos;i<n;i++){
            a[i]=a[i+1];
        }
        
        System.out.println("numbers after inserting");
        for(int i =0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}