package Personal;

import DEMO.Table;
import Menu_Storage.Order;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;

public class Waiter extends Personal{
    Queue<Order> ordersTables=new LinkedList<> ();
    public Waiter(String name , String jobDescription , BigDecimal salary) {
        super (name , jobDescription , salary);
    }
    public void getOrderFromTable(Table table){//priema poruchka ot dadena masa
    }
    public void getOrdersToChef(Chef chef){
        for (Order order:ordersTables){
            chef.getOrders ().add (order.getMeals ().poll ());
        }
    }
    public void getOrdersToBarman(Barman barman){
        for (Order order:ordersTables){
            barman.getOrders ().add (order.getDrinks ().poll ());
        }
    }

    public void getOrdersToClients(Chef chef,Barman barman){//proverka dali dadena cqla poruchka e gotova ili edno po
        // edno

    }
}
