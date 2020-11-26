package slrv2;

/**
 *
 * @author Carlos Varela
 */
public class DSX {

    double[] dataX;

    // Constructor for data set X  obtained from https://www.displayr.com/what-is-linear-regression/
    public DSX(double[] _dataX) {
        this.dataX = _dataX;
    }

    public double[] getDataX() {
        return dataX;
    }

    public void setDataX(double[] dataX) {
        this.dataX = dataX;
    }
}
