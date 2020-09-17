import java.util.*;
class laptop
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a three digited number");
        int a= in.nextInt();
        int fd= a/100;
        int bal= a%100;
        int sd= bal/10;
        int ld= bal%10;
        int sum=fd+sd+ld;
        System.out.println("sum of the digits is" +sum);
        if(a%7==0 && ld==7)
        System.out.println("The number entered is a BUZZ number");
        else
        System.out.println("The number entered is not a BUZZ number");
    }
}

        