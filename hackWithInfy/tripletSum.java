
import java.util.Arrays;
import java.util.Scanner;

class sol{
    public void solu(int arr[], int target){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-2; i++) {
            int left=i+1;
            int right=arr.length-1;
            while (left<right){
                int currentSum=arr[i]+arr[left]+arr[right];
                if (currentSum==target){
                   System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                    left++;
                    right--;
                }
                else if (currentSum<target){
                    left++;
                }
                else {
                    right--;
                }
            }
        }

    }
}





public class tripletSum {
    public static void main(String[] args) {
        int arr[] = {0,-1,2,-3,1};
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        sol s = new sol();
        s.solu(arr,target);
    }
}
