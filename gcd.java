import java.io.*;
class gcd
{
    public static void main()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the total Numbers");
        int n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        int gcd=0;
        System.out.println("Enter the Numbers");
        for(int i=0;i<n;i++)
        {
            int n1=Integer.parseInt(in.readLine());
            a[i]=n1;
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
           if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(int i=1;i<=max;i++)
        {
           if(max%i==0)
           {
               int c=0;
               for(int j=0;j<n;j++)
               {
                   if(a[j]%i==0)
                   {
                       c++;
                   }
                }
                if(c==n)
                {
                    gcd=i;
                }
            }
        }
        System.out.println("The GCD is "+gcd);
    }
}
            
        