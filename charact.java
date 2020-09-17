import java.io.*;
class charact
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Énter a character ");
        char ch=Character.parseChar(in.readLine());
        System.out.println("The Character is "+ch);
    }
}
