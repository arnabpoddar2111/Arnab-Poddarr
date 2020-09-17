
class kile
{
    public static void main(int a, int b, int c)
    {
       if(a!=b && b!=c && a!=c)
       {
          System.out.println("The 3 numbers are unequal");
       
          if(a>b && a>c)
          System.out.println("First number is the largest");
          else if(b>c && b>a)
          System.out.println("Second number is the largest");
          else
          System.out.println("Third number is the largest");
        }
        else
        System.out.println("The 3 numbers are equal");
        if(a>0 && b>0 && c>0)
        System.out.println("All the numbers are positive");
        else if(a<0 && b<0 && c<0)
        System.out.println("All the numbers are negative");
        else
        System.out.println("The numbers are combination of both");
        if(a%2==0)
        System.out.println("The first number is even");
        else
        System.out.println("The first number is odd");
        if(b%2==0)
        System.out.println("The second number is even");
        else
        System.out.println("The second number is odd");
        if(c%2==0)
        System.out.println("The third number is even");
        else
        System.out.println("The third number is odd");
    }
}