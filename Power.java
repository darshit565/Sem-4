import java.util.*;
import java.lang.Math;
public class Power{
    public static void main(String[] args) {
        /*int n = 2;
        int ans = 1;
        for(int i=0;i<11;i++)
        {
            System.out.println("2-"+i+"=\t"+ans);
            ans = ans*n;
        }
        int ans = 2;
        for(int i=0;i<11;i++)
        {
            System.out.println(Math.pow(ans,i));
        }*/
        // calc 
        /* 
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 2 numbers :- ");
        int a = inp.nextInt() ;
        int b = inp.nextInt() ;
        System.out.println("Select :- ");
        System.out.println(" 1 for + \n 2 for - \n 3 for * \n 4 for / \n 5 for %");
        int c = inp.nextInt() ;
        switch(c)
        {
            case 1: System.out.println("Addition of "+a+" + "+b+" = "+(a+b));
                    break;
            case 2: System.out.println("Substraction of "+a+" - "+b+" = "+(a-b));
                    break;
            case 3: System.out.println("Multiplication of "+a+" * "+b+" = "+(a*b));
                    break;
            case 4: System.out.println("Division of "+a+" / "+b+" = "+(a/b));
                    break;
            case 5: System.out.println("Modulus of "+a+" % "+b+" = "+(a+b));
                    break;
            default: System.out.println("Enter valid imput");
                    break;
        }
        */
        // sq rt , cube , square 
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        System.out.println("Sqrt = "+Math.sqrt(a));
        System.out.println("Cube = "+Math.pow(a,3));
        System.out.println("Square = "+Math.pow(a,2));

        // associativity & precedence 
    }
}
