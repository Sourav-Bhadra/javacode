import java.util.Arrays;
import java.util.Scanner;

class solution{
    public int[] sol(int arr[],int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int currentSum=arr[left]+arr[right];
            if(currentSum==target){
                return new int[] {arr[left],arr[right]};
            }
            else if (currentSum<target){
                left+=1;
            }
            else if(currentSum>target){
                right-=1;
            }
        }
        return new int[] {};
    }

}




public class twoNumbersum {
    public static void main(String[] args) {
        int array[]={3,5,-1,7,8,9,6,-4};
        Scanner sc =new Scanner(System.in);
        int target=sc.nextInt();
        solution s = new solution();
        int[] numbers=s.sol(array,target);
        if(numbers.length==2){
            System.out.println(numbers[0]+" and "+numbers[1]);
        }
        else {
            System.out.println("not found !");
        }
    }

}
