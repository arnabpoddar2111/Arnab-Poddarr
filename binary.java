import java.io.*;
class binary
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a Number ");
        int num=Integer.parseInt(in.readLine());
        int n=num;
        int binary[]=new int[10];
        int index=0;
        while(n>0)
        {
            if(n%2==0)
            {
                binary[index]=0;
            }
            else
            {
                binary[index]=1;
            }
            index++;
            n=n/2;
        }
        System.out.println("The binary form of the integer "+num+" is");
        for(int i=index-1;i>=0;i--)
        {
            System.out.print(binary[i]);
        }
    }
}