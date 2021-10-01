public class Invert implements Transform {

    @Override
    public void applyTo(GrayImage image) {
        for (int i = 0; i < image.getWidth(); i++){
            for (int j = 0; j < image.getHeight(); j++){
                image.setPixel(image.getPixelGrayColor(i, j).invert(), i, j);
            }
        }
    }
}
