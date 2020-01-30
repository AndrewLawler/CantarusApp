import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class SimpleTest {

    @Test 
    public void testCheckout(){

        Map<String, String> rules = new HashMap<String, String>();
        rules.put("A", "3 130");
        rules.put("B", "2 45");
        rules.put("C", "none");
        rules.put("D", "none");
        ItemA a = new ItemA();
        ItemA a2 = new ItemA();
        Item a3 = new ItemA();
        ItemB b = new ItemB();
        ItemC c = new ItemC();
        ItemD d = new ItemD();
        Checkout ourCheckout = new Checkout(rules);
        ourCheckout.Scan(a);
        ourCheckout.Scan(b);
        ourCheckout.Scan(c);
        ourCheckout.Scan(d);
        ourCheckout.Scan(a2);
        ourCheckout.Scan(a3);
        int price = ourCheckout.Total();
        int expected = 195;
        assertEquals(price, expected);

    }

}
