import java.util.Scanner;
import java.text.NumberFormat;
public class Mortage_calculator{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Principle:");
        int principle=input.nextInt();
        System.out.print("Annual Interest Rate:"); 
        float interest_rate=input.nextFloat();
        System.out.print("Period(year):"); 
        int period=input.nextInt();
        float r=interest_rate/12;
        int n=period*12;
        float r2= (float) Math.pow((1 + r), n);
        float m=(principle*r*r2/(r2-1));
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String result= currency.format(m);
System.out.print("Mortgage="+result);


    }
}

    