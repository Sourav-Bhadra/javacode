import java.util.Scanner;

public class addingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]= new int[n][n];
        int c[][]=new int[n][n];
        System.out.println("enter a matrices");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter b matrices");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        System.out.println("Summations are");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
