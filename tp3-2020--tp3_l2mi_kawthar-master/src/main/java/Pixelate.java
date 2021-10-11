public class Pixelate implements Transform{

    private final int newPixelSize;


    public Pixelate(int newPixelSize) {
        this.newPixelSize = newPixelSize;
    }

    @Override
    public void applyTo(GrayImage image) {
        for (int i = 0; i < image.getWidth(); i++){
            for (int j = 0; j < image.getHeight(); j++){
                if (i%newPixelSize == 0){

                }
            }
        }
    }
}
