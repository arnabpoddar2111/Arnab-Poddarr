class blue
{
    public static void main(int a)
    {
        System.out.println("The number of sides entered is" +a);
        if(a==4)
        System.out.println("SQUARE/RECTANGLE");
        else if(a==3)
        System.out.println("TRIANGLE");
        else if(a>4)
        System.out.println("POLYGON");
        else
        System.out.println("CIRCLE");
    }
}