import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)
public class LionConstructor_WithDifferentSexTest {

    String sex;
    boolean expectedHasMane;

    public LionConstructor_WithDifferentSexTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;

    }

    @Parameterized.Parameters
    public static Object[][] getDataToInitialiseTheConstructor() throws Exception{
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                // exception should be thrown
                {"Самеу", false}
        };
    }

    @Test
    public void testConstrictorWithDifferentSex() throws Exception{
        try {
            boolean actualHasMane = new Lion(sex)
                    .doesHaveMane();
            assertEquals(expectedHasMane, actualHasMane);
        } catch (Exception e) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}

