package Menu_Storage;

import java.util.Map;
import java.util.Scanner;

public class Storage {//has limit has no quantity of a product
    private Map<Product, Integer> productsInStorage;

    public Storage(Map<Product, Integer> productsInStorage) {
        this.productsInStorage = productsInStorage;
    }

    public Map<Product, Integer> getProductsInStorage() {
        return productsInStorage;
    }

    public void setProductsInStorage(Map<Product, Integer> productsInStorage) {
        this.productsInStorage = productsInStorage;
    }
    public void addNewProductToStorage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("enter new product name");
        String name=scanner.nextLine ();
        System.out.println ("enter new product weight");
        double weight=Double.parseDouble (scanner.nextLine ());

        Product newProduct=new Product (name,weight);

        System.out.println ("enter quantity ");
        int quantity=scanner.nextInt ();

        productsInStorage.put (newProduct,quantity);
    }

    public void addQuantityToProductInStorage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("enter product name");
        String name=scanner.nextLine ();
        System.out.println ("enter product weight");
        double weight=Double.parseDouble (scanner.nextLine ());

        Product product=new Product (name,weight);

        System.out.println ("enter quantity ");
        int quantity=scanner.nextInt ();
        for (Map.Entry<Product, Integer> entry : productsInStorage.entrySet ()) {
            if (entry.getKey ().equals (product)){
                entry.setValue (entry.getValue ()+quantity);
            }
        }


    }

    @Override
    public String toString() {
        return "Storage{" +
                "productsInStorage=" + productsInStorage +
                '}';
    }
}
