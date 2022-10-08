import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int ans = (int)(a + (Math.pow(2, 0) * b));
            System.out.print(ans + " ");
            
            for (int j = 1; j < n; j++)
            {
                ans = ans + ((int)(Math.pow(2, j) * b));
                System.out.print(ans + " ");
            }
            System.out.println();
        }
        in.close();
    }
}