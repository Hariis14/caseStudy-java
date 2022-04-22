import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class loopingTiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Baris :");
        int V = input.nextInt();
        System.out.print("\n");

        for (int a = 1; a <= V; a++)
        {
            for (int b = 20; b >= a; b++)
            {
                System.out.print(' '); //spasi
            }
            for (int c = 1; c <= a; c++)
            {
                System.out.print('<'); //kiri
            }
            for (int d = 1; d <= a; d++)
            {
                System.out.print('>'); //kanan
            }
            System.out.println();  //enter
        }
    }
    
}
