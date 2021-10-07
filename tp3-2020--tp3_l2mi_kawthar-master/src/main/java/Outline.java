import java.lang.Math;
import java.sql.SQLOutput;

public class Outline implements Transform{

    private final double threshold;

    public Outline(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void applyTo(GrayImage image) {
        for (int i = 0; i < image.getWidth()-1; i++) {
            for (int j = 0; j < image.getHeight()-1; j++) {
                System.out.println(Math.abs(image.getPixelGrayColor(i, j).getLuminosity()-image.getPixelGrayColor(i+1, j).getLuminosity()));
                if (Math.abs(image.getPixelGrayColor(i, j).getLuminosity()-image.getPixelGrayColor(i+1, j).getLuminosity()) > threshold){
                    image.setPixel(new ByteGrayColor(0), i, j);
                    //System.out.println("image1");
                } else if (Math.abs(image.getPixelGrayColor(i, j).getLuminosity()-image.getPixelGrayColor(i, j+1).getLuminosity()) > threshold) {
                    image.setPixel(new ByteGrayColor(0), i, j);
                    //System.out.println("image2");
                } else {
                    image.setPixel(new ByteGrayColor(255), i, j);
                    //System.out.println("image3");
                }
            }
        }
        //System.out.println("FINISH !!!!!");
    }

    /*
    if (Math.abs(image.getPixelGrayColor(i, j).compareTo(image.getPixelGrayColor(i+1, j))) > threshold ){
                    image.setPixel(new ByteGrayColor(0), i,j);
                } if (Math.abs(image.getPixelGrayColor(i, j).compareTo(image.getPixelGrayColor(i, j+1))) > threshold){
                    image.setPixel(new ByteGrayColor(0), i,j);
                }
                if (Math.abs(image.getPixelGrayColor(i, j).compareTo(image.getPixelGrayColor(i+1, j))) <= threshold ) {
                    if (Math.abs(image.getPixelGrayColor(i, j).compareTo(image.getPixelGrayColor(i, j + 1))) <= threshold) {
                        image.setPixel(new ByteGrayColor(255), i, j);

                    }
                }
     */
}
