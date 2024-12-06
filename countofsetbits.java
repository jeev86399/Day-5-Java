import java.util.*;
public class countofsetbits{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int c=0;
            while(n>0)
            {
                c=c+(n&1);
                n>>=1;
            }
            System.out.println("count:"+c);
        }
    }
}
