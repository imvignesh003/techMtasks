import java.util.*;

public class StockQuantity {
    public static void stockquantity(int num){
        if(num<50){
            System.out.println("low");
        }else if(num>=50 && num<200){
            System.out.println("medium");
        }else if(num>=200){
            System.out.println("high");
        }else{
            System.out.println("Invalid");
        }
    }

    public static void printnumber(){
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void total(){
     int ii=1;
     while(true){
        if(ii>100){
            break;
        }
        ii+=10;
     }
     System.out.println(ii);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        stockquantity(a);
        printnumber();
        total();
        sc.close();
    }
}