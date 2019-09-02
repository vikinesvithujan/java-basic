/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arr[][] = {{"vithujan", "25", "Jaffna"}, {"imthath", "22", "Kalmunai"}, {"Aswika", "03", "Jaffna"}};
        String leftAlignFormat = "| %-15s | %-15s | %-15s |%n";

        System.out.format("+-----------------+------+-----------+%n");
        System.out.format("| Name            | Age  |Address    |%n");
        System.out.format("+-----------------+------+-----------+%n");
        /*
         for (int i = 0; i < 5; i++) {
         System.out.format(leftAlignFormat, "some data" + i, i * i);
         } */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format(leftAlignFormat,arr[i][j]);
            }
            System.out.println();
        }

        // System.out.format(leftAlignFormat, "Vithujan", "hello");
        System.out.format("+-----------------+------+-----------+%n");
    }

}
