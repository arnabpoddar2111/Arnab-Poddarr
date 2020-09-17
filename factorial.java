import java.io.*;
class factorial
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Ënter a number to find the factorial of");
        int n=Integer.parseInt(in.readLine());
        int fact=1;
        System.out.println("The Factorial of "+n+"is:");
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}