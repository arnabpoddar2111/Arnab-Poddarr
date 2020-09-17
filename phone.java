class phone
{
    public static void main(int a, int b, int c)
    {
        if(a+b+c ==180)
        {
            System.out.println("Triangle is possible");
            if(a==90 || b==90 || c==90)
            System.out.println("The triangle is a right angled triangle");
            else if(a<90 && b<90 && c<90)
            System.out.println("The triangle is a acute triangle");
            else if(a>90 || b>90 || c>90)
            System.out.println("The triangle is a obtuse triangle");
        }
        else
        System.out.println("Triangle is not possible");
    }
}