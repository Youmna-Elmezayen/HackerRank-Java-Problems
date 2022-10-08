import java.io.*;
import java.util.*;

public class Solution 
{
    private static double breadth;
    private static double height;
    
    static
    {
        Scanner scan = new Scanner(System.in);
        breadth = scan.nextDouble();
        height = scan.nextDouble();
    }
    
    public static void main(String[] args) 
    {
        if (breadth <= 0 || height <= 0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
        {
            System.out.println((int)(breadth * height));
        }
    }
}