import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SpotTest {


    @Test
    public void validSpotTest(){
        Spot spot = new Spot("A",1);
        Assertions.assertNotNull(spot);
        Assertions.assertEquals("A",spot.getX() );
        Assertions.assertEquals(1,spot.getY() );


    }

    @Test

    public void invalidXValueTest(){
       Assertions.assertThrows(IllegalArgumentException.class, ()->  {
           Spot spot= new Spot("q",1);

        });
    }


    @ParameterizedTest

    @ValueSource(ints = {-1,0,100})
    public void invalidValueParamsTest(int y) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Spot spot = new Spot("q", y);

        });
    }

}
