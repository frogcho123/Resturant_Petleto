package Personal;

import Menu_Storage.Meal;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Chef extends Personal {
    private BigDecimal bonus;//every n meals cooked get salary bonus 5 meal 5% 10 meal 10% nekvo takoa
    private Queue<Meal> orders=new LinkedList<> ();
    private Queue<Meal> readyOrder=new LinkedList<> ();//Meal tableID samiq
    private Stack<Dish> dishes;
    //nujna li mi e opashka koqto e gotovi orderi za da moje servitiora da minava da chisti gotovite orderi vse edno
    // minava da subere poruchkite
    public Chef(String name , String jobDescription , BigDecimal salary) {
        super (name , jobDescription , salary);
    }

    public Chef(String name , String jobDescription , BigDecimal salary , BigDecimal bonus , Queue<Meal> orders , Stack<Dish> dishes) {
        super (name , jobDescription , salary);
        this.bonus = bonus;
        this.orders = orders;
        this.dishes = dishes;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public Queue<Meal> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Meal> orders) {
        this.orders = orders;
    }
    public void checkForProducts(Meal meal){//go through the products from the meal and check in storage

    }
    public void cookMeal(){
        if (!orders.isEmpty ()){
            if (dishes.isEmpty ()) System.out.println ("no clean dishes");
            else{
                orders.poll ();
                Meal meal=orders.poll ();
                System.out.println ("cooked"+meal);
            }
        }else System.out.println ("no orders");
    }

}
