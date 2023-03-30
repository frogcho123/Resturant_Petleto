package Menu_Storage;

import java.util.Objects;

public class Product {
    private String name;
    private double weight;

    public Product(String name , double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "product name is "+name + " and weights  " + weight+"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Product )) return false;
        Product product = (Product) o;
        return Double.compare (product.getWeight () , getWeight ()) == 0 && Objects.equals (getName () , product.getName ());
    }

    @Override
    public int hashCode() {
        return Objects.hash (getName () , getWeight ());
    }
}
