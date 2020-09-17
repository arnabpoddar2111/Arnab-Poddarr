class walnut
{
    public static void main ()
    {
        int num = 965;
        int ab = num/100;
        int yz = num%100;
        int bc = yz/10;
        int cd = yz%10;
        int sum = ab+bc+cd;
        System.out.println("sum of the digits are "+sum);
    }
}
     