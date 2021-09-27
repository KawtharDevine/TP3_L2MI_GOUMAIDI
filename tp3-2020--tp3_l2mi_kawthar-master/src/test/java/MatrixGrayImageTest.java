import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class MatrixGrayImageTest {

    @Test
    void getWidth() {
        assertThat(new MatrixGrayImage(0,0).getWidth(), is(equalTo(0)));
        assertThat(new MatrixGrayImage(10,20).getWidth(), is(equalTo(10)));
        assertThat(new MatrixGrayImage(400,300).getWidth(), is(equalTo(400)));
    }

    @Test
    void getHeight() {
        assertThat(new MatrixGrayImage(0,0).getWidth(), is(equalTo(0)));
        assertThat(new MatrixGrayImage(10,20).getWidth(), is(equalTo(20)));
        assertThat(new MatrixGrayImage(400,300).getWidth(), is(equalTo(300)));
    }
}