package ch5ex13;
import java.util.Scanner;
import java.lang.Math;

public class Ch5Ex13 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double p,r,m,total,i,holder;
        
        System.out.println("Enter the principal owning price");
            p=input.nextInt();
        System.out.println("Enter the interest rate in whole numbers");
            r=input.nextInt();
        System.out.println("Enter the amount of monthly payments");
            m=input.nextInt();
            
                m*=-1;
                r/=100;
                holder=(1+r/12);
            i=Math.pow(holder,m);
            total=((p*(r/12))/(1-i));
            
            System.out.format("The cost of your monthly payments is %.2f",total);
    }
    
}
