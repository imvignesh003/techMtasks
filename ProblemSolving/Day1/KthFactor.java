import java.util.Scanner;

public class KthFactor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int fact = 1;
        int kcnt = 0;
        boolean flag = false;
        while(fact<=n/2){
            if(n%fact  == 0){
                kcnt++;
            }
            if(kcnt==k){
                System.out.println(fact);
                flag = true;
                break;
            }
            fact++;
        }
        if(kcnt+1 == k){
            System.out.println(n);
            flag = true;
        }
        if(!flag){
            System.out.println(1);
        }
    }
}
