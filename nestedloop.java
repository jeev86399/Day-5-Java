import java.util.*;
public class nestedloop{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}