class even
{
    public static void main(int x)
    {
        if(x>0 && x%2==0)
           { int x1= x+2;
             int x2= x1+2;
            int x3= x2+2;
            System.out.println("The successive numbers are" +x1+"," +x2+"," +x3);
        }
        else if(x<0 && x%2!=0)
        { int a1= x-2;
           int a2= a1-2;
          int a3= a2-2;
          System.out.println("The successive numbers are" +a1+"," +a2+"," +a3);

        }
        else
        System.out.println("the number is neither positive even nor it is negative odd");
    }
}
          
           