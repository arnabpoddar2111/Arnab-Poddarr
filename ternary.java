import java.io.*;
class ternary
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter Number ");
        double num=Double.parseDouble(in.readLine());
        double number=Math.round(num);
        System.out.println("The rounded number is "+ number);
    }
}