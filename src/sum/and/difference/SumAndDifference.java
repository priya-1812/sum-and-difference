/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.and.difference;
import java.util.Scanner;
public class SumAndDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N1=in.nextInt();
        int N2=in.nextInt();
        if(N1>N2)
        {
             System.out.println(N1-N2);
        }
        else
        {
             System.out.println(N1+N2);
        }
    }
    
}
