import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String firstHalf = A.substring(0, (A.length() / 2));
        String secondHalf = "";
        
        int len = A.length();
        if(len % 2 == 0)
        {
            for(int i = len - 1; i >= len / 2; i--)
            {
                secondHalf += A.charAt(i);
            }
        }
        else
        {
            for(int i = len - 1; i > len / 2; i--)
            {
                secondHalf += A.charAt(i);
            }
        }
        
        
        if(secondHalf.equals(firstHalf))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
        sc.close();
        
    }
}