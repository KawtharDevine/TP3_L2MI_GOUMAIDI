import java.lang.Math;

public class DecreaseGrayLevels implements Transform{

    private final int nbGrayLevels;

    public DecreaseGrayLevels(int nbGrayLevels) {
        this.nbGrayLevels = nbGrayLevels;
    }

    @Override
    public void applyTo(GrayImage image) {
        for (int i = 0; i < image.getWidth(); i++){
            for (int j =0; j<image.getHeight(); j++){
                //System.out.println(image.getPixelGrayColor(i,j).getLuminosity());
                int luminosity = (int) Math.round(image.getPixelGrayColor(i,j).getLuminosity() * (this.nbGrayLevels - 1));
                //System.out.println(luminosity);
                image.setPixel(new ByteGrayColor(luminosity), i, j);
            }
        }
    }
}
