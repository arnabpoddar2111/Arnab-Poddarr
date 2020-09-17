import java.io.*;
class armstrong
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the number to check if it's an armstrong number");
        int n=Integer.parseInt(in.readLine());
        int num=n;int mul=1;int rem;int sum=0;
        while(num>0)
        {
            rem=num%10;
            mul=rem*rem*rem;
            sum=sum+mul;
            num=num/10;
        }
        if(sum==n)
        {
            System.out.println("The Number "+n+" is an Armstrong Number");
        }
        else
        {
            System.out.println("The Number "+n+" is NOT an Armstrong Number");
    }
}
}