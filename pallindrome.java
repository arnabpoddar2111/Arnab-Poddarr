import java.io.*;
class pallindrome
{
    public static void main()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Ënter the Lower Limit");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Eneter the Upper Limit");
        int b=Integer.parseInt(in.readLine());
        System.out.println("The Pallindrome Numbers between the range "+a+" and "+ b+" are:");
        for(int i=a;i<=b;i++)
        {
            int num=i;int rev=0;
            while(num>0)
            {
                int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            if(rev==i)
            {
              System.out.print(i+",");
            }
        }
    }
}