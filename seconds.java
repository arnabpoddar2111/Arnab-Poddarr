import java.io.*;
class seconds
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the number of seconds");
        int a=Integer.parseInt(in.readLine());
        int hr=a/(60*60);
        int min=a/60;
        min=min%60;
        double s=a%60;
        System.out.println("Ḧour is "+hr);
        System.out.println("Minutes is "+min);
        System.out.println("Seconds is "+s);
    }
}