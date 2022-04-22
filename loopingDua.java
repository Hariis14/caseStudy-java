/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class loopingDua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        for (int ayam = 1; ayam <= 20; ayam++)
        {
            for (int c = 1; c <= ayam ; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
