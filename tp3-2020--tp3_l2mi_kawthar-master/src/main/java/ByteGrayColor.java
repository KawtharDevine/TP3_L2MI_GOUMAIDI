import javafx.scene.paint.Color;
import java.lang.Math;

/**
 * Created by Arnaud Labourel on 02/10/2018.
 */

public class ByteGrayColor implements GrayColor {

    private static final int MINIMUM_GRAY_LEVEL = 0;
    private static final int MAXIMUM_GRAY_LEVEL = 255;
    private static final int OPACITY = 1;

    private final double grayLevel;

    public ByteGrayColor(){
        this.grayLevel = MINIMUM_GRAY_LEVEL;
    }

    public ByteGrayColor(int grayLevel) {
        // TODO : Corriger l'initialisation de la propriété grayLevel de l'instance.
        this.grayLevel = grayLevel;
    }

    public ByteGrayColor(double luminosity) {
        // TODO : Corriger l'initialisation de la propriété grayLevel de l'instance.
        this.grayLevel = luminosity;
    }

    @Override
    public double getLuminosity() {
        // TODO : Retourner la luminosité de la couleur (entre 0 noir et 1 blanc)
        return grayLevel;
    }

    @Override
    public Color getColor(){
        double component = grayLevel / (double) MAXIMUM_GRAY_LEVEL;
        return new Color(component, component, component, OPACITY);
    }


    @Override
    public int compareTo(GrayColor o) {
        // TODO : Retourner la différence de niveau de gris.
        return Double.compare(this.getLuminosity(), o.getLuminosity());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;
        ByteGrayColor color = (ByteGrayColor) o;
        return this.compareTo(color) == 0;
    }

}
