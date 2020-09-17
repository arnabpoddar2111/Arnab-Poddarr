import java.io.*;
class harshad
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a Number ");
        int n=Integer.parseInt(in.readLine());
        int num=n;
        int rem,sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(n%sum==0)
        {
            System.out.println("The number "+n+" is a Harshad Number");
        }
        else
        {
             System.out.println("The number "+n+" is not a Harshad Number");
        }  
    }
}
            
       