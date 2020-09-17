
import java.util.*;
class apple
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter choice as 1 or 2");
        int ch= in.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter two numbers");
            int x=(int)in.nextInt();
            int y=(int)in.nextInt();
            int sum=x+y;
            System.out.println("sum of the numbers is"+sum);
            break;
            case 2: System.out.println("Enter a number");
            int z= in.nextInt();
            if(z%2 == 0)
            System.out.println("even");
            else
            System.out.println("odd");
            break;
            default: System.out.println("WRONG CHOICE");
        }
    }
}