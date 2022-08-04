import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionConstructor_ThrowsExceptionTest { //another way to test exception
    @Mock
    protected Feline feline;

    @Test
    public void lionConstructorThrowsExceptionWhenInitialisedWithWrongSex() throws Exception{
        assertThrows("Используйте допустимые значения пола животного - самец или самка", Exception.class, () -> new Lion("Самеу", feline));
        }
}

