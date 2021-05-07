import java.util.Scanner;

class onBulb{
    public int on(int n){
        return (int) Math.sqrt(n);
    }
}






public class toogleBulb {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        onBulb b=new onBulb();
        int p=b.on(n);
        System.out.println(p);
    }
}
