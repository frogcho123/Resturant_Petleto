package Menu_Storage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Order {
    private Queue<Meal> meals=new LinkedList<> ();
    private Queue<Drink> drinks=new LinkedList<> ();

    private int tableId;
    public Order() {
    }

    public Order(Queue<Meal> meals , Queue<Drink> drinks , int tableId) {
        this.meals = meals;
        this.drinks = drinks;
        this.tableId = tableId;
    }

    public Queue<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Queue<Meal> meals) {
        this.meals = meals;
    }

    public Queue<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(Queue<Drink> drinks) {
        this.drinks = drinks;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public void orderFromMenu(Menu menu) {
        Scanner scanner = new Scanner (System.in);
        boolean flag = true;
        while (flag){
            System.out.println ("press 1-meal 2-drink 3-exit");
        int input = Integer.parseInt (scanner.nextLine ());
        if (input == 1) {
            System.out.println ("enter meal name to order");
            String name=scanner.nextLine ();
            for(Meal meal:menu.getMeals ()){
                if (name.equals (meal.getName ())){
                    meals.add (meal);
                }
            }//set meals name v menu s name vuveden ot klient
        } else if (input == 2) {
            System.out.println ("enter drink name to order");
            String name=scanner.nextLine ();
            for(Drink drink:menu.getDrinks ()){
                if (name.equals (drink.getName ())){
                    drinks.add (drink);
                }
            }
        } else if (input == 3) {
            flag = false;
        } else {
            System.out.println ("wrong input from options above");
            System.out.println ("press 1-meal 2-drink 3-exit");
            input = Integer.parseInt (scanner.nextLine ());
        }
        }
    }


    @Override
    public String toString() {
        return "Order{" +
                "meals=" + meals +
                ", drinks=" + drinks +
                ", tableId=" + tableId +
                '}';
    }
}
