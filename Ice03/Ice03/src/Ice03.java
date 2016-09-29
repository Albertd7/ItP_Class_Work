/** Created by Albert Dubovik on 9/6/2016.
 */
public class Ice03
{
    public static void main(String[] args)
    {
        String s1 = "Hi", s2 = "Hello World";
        System.out.println("" + s1.length()+ " " + s2.length());
        System.out.print(s1.indexOf("o",0)+" ");
        System.out.println(s2.indexOf("o",5));
        System.out.println(s1 + s2.substring(6));
        System.out.println(s1.toLowerCase() + " " + s2.toLowerCase());
        System.out.println(s1.toUpperCase() + " " + s2.toUpperCase());
    }
}
