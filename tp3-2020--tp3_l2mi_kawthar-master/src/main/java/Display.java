import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelWriter;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Arnaud Labourel on 04/10/2018.
 */
public class Display implements Initializable {
    @FXML
    private Canvas canvas;

    MatrixGrayImage image;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.image = MatrixGrayImage.createImageFromPGMFile("images/luminy.pgm");
        // TODO : Ajouter les transformations d'image.
        //new Invert().applyTo(image);
        //new DecreaseGrayLevels(200).applyTo(image);
        //new Outline(0.055).applyTo(image);
        /*
        Transform[] transforms = {new DecreaseGrayLevels(150),new Outline(0.05),new Invert()};
        new CompositeTransform(transforms).applyTo(image);
        */
        render();
    }

    public void render() {
        int pixelWidth = image.getWidth();
        int pixelHeight = image.getHeight();

        canvas.setWidth(pixelWidth);
        canvas.setHeight(pixelHeight);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        PixelWriter pixelWriter = graphicsContext.getPixelWriter();

        for (int i = 0; i < pixelWidth; i++) {
            for (int j = 0; j < pixelHeight; j++) {
                renderPixel(i,j, pixelWriter);
            }
        }
    }

    private void renderPixel(int x, int y, PixelWriter pixelWriter) {
        pixelWriter.setColor(x, y, image.getPixelColor(x, y));
    }

}
