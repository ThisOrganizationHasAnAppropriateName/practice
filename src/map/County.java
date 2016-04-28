/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.Scanner;

/**
 *
 * @author hcps-hallocbr1
 */
public class County {
    public County(Scanner scan){
        String name = scan.next();
        String stateName = scan.next();
        int numberPoints = scan.nextInt();
        double[] xVals = new double[numberPoints];
        double[] yVals = new double[numberPoints];
        for(int i = 0; i<numberPoints.length; i++){
            xVals[i] = scan.nextDouble();
            yVals[i] = scan.nextDouble();
        }
    }
}
