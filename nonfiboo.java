import java.io.*;
class nonfiboo
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the term of Non-Fibo Numbers ");
        int term=Integer.parseInt(in.readLine());
        int a=0;
        int b=1;
        int count=0;
        int c=0;int nonfobo=0;
        while(count<term)
        {
            c=a+b;
            if((c-b)>1)
            {
             nonfobo=b+1;
            while((nonfobo<c)&&(count<term))
            {
                 System.out.print(nonfobo + " ");
                 count++;
                 nonfobo++;
            }
           }
            a=b;
            b=c;
          }
   }
}