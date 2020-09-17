import java.util.*;
class comp
{ 
    public static void main()
    { 
      Scanner in=new Scanner (System.in);
      System.out.println("Enter a number upto four digits");
      int n=in.nextInt();
      System.out.println(n);
      int fd=n/1000;
      int bal=n%1000;
      int sd=bal/100;
      int bl=bal%100;
      int td=bl/10;
      int ld=bl%10;
      int sum=fd+sd+td+ld;
      System.out.println("SUM="+sum);
      if(sum%2==0)
      System.out.println("EVEN");
      else
      System.out.println("ODD");
    }
}
      