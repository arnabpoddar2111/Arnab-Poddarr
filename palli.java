import java.io.*;
class palli
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number");
        int num=Integer.parseInt(in.readLine());
        int n=num;int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==num)
        {
            System.out.println("The number " +num+" is a Pallindromic Number");
        }
        else
        {
             System.out.println("The number " +num+" is not a Pallindromic Number"); 
        }
    }
}
            
            
        