import java.util.*;
public class palindrome{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int temp=n;
            int rev=0;
            while(n>0)
            {
                int dig=n%10;
                rev=rev*10+dig;
                n=n/10;
            }
            System.out.println((temp==rev)?"palindrome":"not palindrome");
        }
    }
}