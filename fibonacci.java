import java.io.*;
class fibonacci
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the term of the fibonacci series ");
        int term=Integer.parseInt(in.readLine());
        int count=2;
        int a=0;
        int b=1;
        int c=0;
        while(count<=term)
        {
            c=a+b;
            count++;
            if(count==term)
            {
            System.out.print("The nth Term is "+c);
            }
            a=b;
            b=c;
        }
    }
}
        
            
            