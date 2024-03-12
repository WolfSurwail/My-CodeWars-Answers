package com.wolfsurwail.kata.kyu8;
import java.text.DecimalFormat;

public class LocalizeTheBarycenterOfATriangle {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double resultX = (x[0] + y[0] + z[0]) / 3.0;
        double resultY = (x[1] + y[1] + z[1]) / 3.0;

        DecimalFormat df = new DecimalFormat("#.####");
        resultX = Double.parseDouble(df.format(resultX));
        resultY = Double.parseDouble(df.format(resultY));
        return new double[]{resultX, resultY};
    }
}
