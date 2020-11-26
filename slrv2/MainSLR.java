package slrv2;

/**
 *
 * @author Carlos Varela
 */
public class MainSLR {

    public static void main(String[] args) {
        
        // data set obtained from: https://www.displayr.com/what-is-linear-regression/

        double[] benettonx = {23, 26, 30, 34, 43, 48, 52, 57, 58}; // X: independent variable 
        double[] benettony = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518}; //Y: dependent variable 

        DSX dsx = new DSX(benettonx);
        DSY dsy = new DSY(benettony);
        Procedure slr = new Procedure(dsx, dsy);
        slr.Prediction();
        
    }
}
