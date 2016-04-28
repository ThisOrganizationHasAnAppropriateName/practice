/*
 * Political Map Project
 * Name: 
 * Block:
 * 
 * Program Purpose:
 *
 * Algorithm:
 * 
 * Future/possible improvements:
 *
 */
package map;
import edu.princeton.cs.introcs.*;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class PoliticalMap {
    public static void main(String[] args)throws Exception{
        String year = "2000";
        String colorFile = "USA"+year+".txt";
        File drawing = new File("C:\\PA\\practice\\src\\map\\USAcounty.txt");
        File coloring = new File(colorFile);
        Scanner drawScan = new Scanner(drawing);
        double xmin = drawScan.nextDouble();
        double ymin = drawScan.nextDouble();
        double xmax = drawScan.nextDouble();
        double ymax = drawScan.nextDouble();
        int numCounties= drawScan.nextInt();
        
        
    }
}
