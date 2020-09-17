import java.io.*;
class prime
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the term");
        int n=Integer.parseInt(in.readLine());
        int count =0;
        int i=2;
        int num=0;
        while(count!=n)
        {
            num=i;
            int c=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                count++;
            }
            i++;
        }
        System.out.println("The " +n+"th Prime Number is " +num);
    }
}