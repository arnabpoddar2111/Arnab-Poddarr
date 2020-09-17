import java.io.*;
class primef
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the Number");
        int n=Integer.parseInt(in.readLine());
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                int j=1;
                int c=0;
                while(j<=i)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                    j++;
                }
                if(c==2)
                {
                    sum=sum+i;
                }
            }
        }
        System.out.println("The Sum of Prime Factors is "+sum);
    }
}