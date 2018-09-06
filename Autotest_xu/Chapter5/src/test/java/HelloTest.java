import com.xu.testng.HelloWorld;
import org.junit.Test;

public class HelloTest {


    @Test
    public void testHello(){
        HelloWorld hello = new HelloWorld();
        hello.hello();
    }
}
