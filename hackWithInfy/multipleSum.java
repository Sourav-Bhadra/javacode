import java.util.Scanner;

class calculate{
    public long solution(int x){
        long n;
        n = x / 3;
        long sum3 = (n * (2*3 + (n-1)*3)) / 2;
        n = x / 5;
        long sum5 = (n * (2*5 + (n-1)*5)) / 2;
        n = x / 15;
        long sum15 = (n * (2*15 + (n-1)*15)) / 2;

        return sum3 + sum5 - sum15;
    }
}




class multipleSum{
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x= (int) sc.nextFloat();

        calculate d =new calculate();
        long result=(int)d.solution(x);
        System.out.println(result);
        sc.close();
    }
}