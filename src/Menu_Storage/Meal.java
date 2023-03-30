package Menu_Storage;

import java.util.Map;

public class Meal {
    private String name;
    private Map<Product, Integer> products;

    public Meal(String name , Map<Product, Integer> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public String getWeight() {
        double sum = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet ()) {
            double temp = entry.getKey ().getWeight ()*entry.getValue ();
            sum += temp;
        }
        return ("weight of the meal is " + sum + " grams");
    }

    @Override
    public String toString() {
        return "Meal name is " + name + " , " + products + "  "+getWeight ()+
                "\n ";

    }
}
