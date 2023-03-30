//categories(Meal and Drink)
//every meal needs different amount of products from the storage
//information about a meal(price weight ingredients ...)
//set because we need only the meals and drinks in the menu the client doesnt care how
// much we have in storage

package Menu_Storage;

import java.util.Scanner;
import java.util.Set;

public class Menu {
    private Set<Meal> meals;
    private Set<Drink> drinks;
    public Menu(Set<Meal> meals , Set<Drink> drinks) {
        this.meals = meals;
        this.drinks = drinks;
    }

    public Set<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }

    public Set<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(Set<Drink> drinks) {
        this.drinks = drinks;
    }

    public void addMeal() {
        System.out.println ("enter number of product in meal");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        for (int i = 0; i < n; i++) {
            System.out.println ("do we need new products to make the meal 0-NO 1-YES");
            boolean flag=scanner.nextBoolean ();
            if (flag){
            //add new product to storage or just add previously and be sure that we have products
            }else {

            }

        }
    }//manager adds meal and buys products so chef can cook it
    //manager or menu counts most and least ordered product
    public void addDrink() {
    }

    @Override
    public String toString() {
        return "Menu has" +
                "" + meals +
                ", drinks=" + drinks +
                "}";
    }
}
