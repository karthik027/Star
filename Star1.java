# Star
import java.io.*;
import java.util.*;
public class Star1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=i;j<n;j++)
      {
        System.out.print("*");
      }
      System.out.print(" ");
      for(int k=i;k<n;k++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
