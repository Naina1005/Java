//Problem statement : To print the following pattern(arrow)
/*

  *
  **
*****
  **
  *

*/

//Main class
public class Main{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==3 || j==3 || (j==4 && (i==2 || i==4)))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}