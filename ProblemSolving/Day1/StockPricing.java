import java.util.Scanner;

class StockPricing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }


        int max = Integer.MIN_VALUE;
        int loss = 0, maxLoss = 0;
        for(int i=0; i<nums.length ; i++){
            max = Math.max(nums[i],max);
            loss = max - nums[i];
            maxLoss = Math.max(loss , maxLoss);
        }
        System.out.println(maxLoss);


    }
}