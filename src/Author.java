import java.text.DecimalFormat;
import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author (String name){
        this.name = name;
    }

    public void addTitle(Title title){
        this.titles.add(title);
    }

    public float calculateTotalPay(){
        float totalPay = 0;
        for (Title t : titles){
            totalPay += (float) t.calculateRoyalty();
        }
        return totalPay;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); // Returns calculateTotalPay with two decimals
        return name + ": " + df.format(calculateTotalPay()) + " kr";
    }
}
