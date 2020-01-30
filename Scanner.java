import java.util.*;

class Scanner {
    public static void main(String[] args){

        // create out Map storing our rules
        Map<String, String> rules = new HashMap<String, String>();
        rules.put("A", "3 130");
        rules.put("B", "2 45");
        rules.put("C", "none");
        rules.put("D", "none");

        // create items and checkout
        ItemA a = new ItemA();
        ItemA a2 = new ItemA();
        Item a3 = new ItemA();

        ItemB b = new ItemB();

        ItemC c = new ItemC();

        ItemD d = new ItemD();

        // create our checkout
        Checkout ourCheckout = new Checkout(rules);

        // scan items

        ourCheckout.Scan(a);
        ourCheckout.Scan(b);
        ourCheckout.Scan(c);
        ourCheckout.Scan(d);
        ourCheckout.Scan(a2);
        ourCheckout.Scan(a3);

        int price = ourCheckout.Total();

        // print final price
        System.out.println("Final Price: "+price);
    }
}