import java.util.*;

class Checkout {

    // internal reference to rules
    Map<String, String> rules;

    // holds our originalPrices, scanned items and overall total
    Map<String, Integer> originalPrices = new HashMap<String, Integer>();
    int total;
    LinkedList<String> scannedItems = new LinkedList<String>(); 

    public Checkout(Map<String, String> rules){
        this.rules = rules;
    }

    // scan to add
    void Scan(Item theItem) {
        originalPrices.put(theItem.name, theItem.unitPrice);
        scannedItems.add(theItem.name);
    }

    // calculate overall total
    int Total() {
        String[] itemCatalog = {"A", "B", "C", "D"};
        for(int i=0; i<=3; i++){
            total += howManyItems(itemCatalog[i]);
            System.out.println(total +" with " + itemCatalog[i]);
        }
        return total;
    }

    // calculate total for each item
    int howManyItems(String input) {

        int normalPrice = originalPrices.get(input);
        int count = 0;

        String rule = rules.get(input);
        String[] splitted = rule.split("\\s+");
    
        for(int num=0; num<scannedItems.size(); num++){
            if(scannedItems.get(num) == input) {
                count++;
            }
        }

        if(rule != "none"){
            int rule1 = Integer.parseInt(splitted[0]);
            int rule2 = Integer.parseInt(splitted[1]);
            if(rule1 > count){
                return count * normalPrice;
            }
            int itemsWithoutDeal = count%rule1;
            int itemsWithDeal = count-itemsWithoutDeal;
            return ((itemsWithDeal/rule1) * rule2) + (itemsWithoutDeal * normalPrice);
        }
        else {
            return count * normalPrice;
        }
        
    }

    

}