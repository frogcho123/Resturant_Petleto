package Personal;

import Menu_Storage.Drink;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;

public class Barman extends Personal{
    private BigDecimal tip;//every n drinks served or depending on client
    private Queue<Drink> orders=new LinkedList<> ();

    public BigDecimal getTip() {
        return tip;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    public Queue<Drink> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Drink> orders) {
        this.orders = orders;
    }

    public Barman(String name , String jobDescription , BigDecimal salary) {
        super (name , jobDescription , salary);
    }
}
