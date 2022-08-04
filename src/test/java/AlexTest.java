import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    protected Feline feline;

    @Test
    public void getFriendsReturnListOfFriends() throws Exception{
        List<String> expectedResult = List.of("Марти", "Глория", "Мелман");
        List<String> actualResult = new Alex()
                .getFriends();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingReturnNewYorkZoo() throws Exception {
        String expectedResult = "Нью-Йоркский зоопарк";
        String actualResult = new Alex()
                .getPlaceOfLiving();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensReturnZeroKittens() throws Exception{
        int actualResult = new Alex()
                .getKittens();
        assertEquals(0, actualResult);
    }

    @Test
    public void doesHasManeReturnTrue() throws Exception{
        boolean doesHasMane = new Alex()
                .doesHaveMane();
        assertTrue(doesHasMane);
    }

    @Test
    public void getFoodReturnMeatList() throws Exception{
        Alex alex = new Alex(feline);
        Mockito.when(feline.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = alex.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);
    }
}
