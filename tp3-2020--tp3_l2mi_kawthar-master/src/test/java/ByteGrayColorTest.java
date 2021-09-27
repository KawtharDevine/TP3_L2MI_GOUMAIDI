import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ByteGrayColorTest {
  @Test
  public void testGetLuminosity_whenColorCreatedWithGrayLevel(){
    ByteGrayColor black = new ByteGrayColor(0);
    ByteGrayColor white = new ByteGrayColor(255);
    assertThat(black.getLuminosity(), is(closeTo(0.,.0001)));
    assertThat(white.getLuminosity(), is(closeTo(1.,.0001)));
  }

  @Test
  public void testGetLuminosity_whenColorCreatedWithLuminosity(){
    ByteGrayColor color1 = new ByteGrayColor(.25);
    ByteGrayColor color2 = new ByteGrayColor(.75);
    assertThat(color1.getLuminosity(), is(closeTo(.25,.0001)));
    assertThat(color2.getLuminosity(), is(closeTo(.75,.0001)));
  }
}
