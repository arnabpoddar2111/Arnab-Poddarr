import java.util.*;
class mango
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Ënter choice");
        int ch=in.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter a number");
            int a=in.nextInt();
            int b=(int)Math.abs(a);
            System.out.println(b);
            break;
            case 2: int res=(int)Math.pow(10,2);
            System.out.println(res);
            break;
            case 3: double res2=(double)Math.sqrt(50);
            System.out.println(res2);
            break;
            default: System.out.println("WRONG CHOICE");
        
        }
    }
}
           
        