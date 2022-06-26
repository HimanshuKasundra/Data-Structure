import java.util.Scanner;
public class NumberofDigit
{
    public static int digits(int a)
    {
        int count=0;
        if(a==0)
        {
            return count;
        }
        else{
            return 1+digits(a/10);
        }
    }
    public static void main(String[] arStrings)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr number:");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("number of digits:1");
        }
        else{
            int digitno;
        digitno=digits(n);
        System.out.println("Number_of_digits:"+ digitno);

        }
        
    }
}