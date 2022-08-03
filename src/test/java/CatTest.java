import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnMeow() {
        String actualResult = new Cat(feline)
                .getSound();
        assertEquals("Мяу", actualResult);
    }

    @Test
    public void getFoodReturnsMeatFood() throws Exception{
        Cat cat = new Cat(feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat())
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = cat.getFood();
        assertEquals(expectedResult, actualResult);
    }
}

