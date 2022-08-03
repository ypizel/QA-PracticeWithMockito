import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline = new Feline();

    @Test
    public void eatMeatReturnsMeat() throws Exception {
        Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(feline).getFood(Mockito.anyString());
        List<String> actualResult = feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood(Mockito.anyString());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);
    }

    @Test
    public void getFamilyReturnFeline() {
        String actualResult = new Feline()
                .getFamily();
        assertEquals("Кошачьи", actualResult);
    }

    @Test
    public void getKittensWithNoParametersReturnsOne() {

        int result = feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
        assertEquals(1, result);
    }

    @Test
    public void getKittensWithIntReturnThatInt() {
        int actualResult = new Feline()
                .getKittens(4);
        assertEquals(4, actualResult);
    }
}
