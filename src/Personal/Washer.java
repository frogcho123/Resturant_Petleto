package Personal;

import java.math.BigDecimal;
import java.util.Stack;

public class Washer extends Personal{
    private BigDecimal bonus;//same as chef and waiter
    private Stack<Dish> cleanDish=new Stack<> ();
    private Stack<Dish> dirtyDish=new Stack<> ();
    private Stack<Glass> cleanGlass=new Stack<> ();
    private Stack<Glass> dirtyGlass=new Stack<> ();
    public Washer(String name , String jobDescription , BigDecimal salary) {
        super (name , jobDescription , salary);
    }

    public Washer(String name , String jobDescription , BigDecimal salary , Stack<Dish> cleanDish ,
                  Stack<Dish> dirtyDish , Stack<Glass> cleanGlass , Stack<Glass> dirtyGlass) {
        super (name , jobDescription , salary);
        this.cleanDish = cleanDish;
        this.dirtyDish = dirtyDish;
        this.cleanGlass = cleanGlass;
        this.dirtyGlass = dirtyGlass;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public Stack<Dish> getCleanDish() {
        return cleanDish;
    }

    public void setCleanDish(Stack<Dish> cleanDish) {
        this.cleanDish = cleanDish;
    }

    public Stack<Dish> getDirtyDish() {
        return dirtyDish;
    }

    public void setDirtyDish(Stack<Dish> dirtyDish) {
        this.dirtyDish = dirtyDish;
    }

    public Stack<Glass> getCleanGlass() {
        return cleanGlass;
    }

    public void setCleanGlass(Stack<Glass> cleanGlass) {
        this.cleanGlass = cleanGlass;
    }

    public Stack<Glass> getDirtyGlass() {
        return dirtyGlass;
    }

    public void setDirtyGlass(Stack<Glass> dirtyGlass) {
        this.dirtyGlass = dirtyGlass;
    }

    @Override
    public String toString() {
        return "Washer{" +
                "bonus=" + bonus +
                ", cleanDish=" + cleanDish +
                ", dirtyDish=" + dirtyDish +
                ", cleanGlass=" + cleanGlass +
                ", dirtyGlass=" + dirtyGlass +
                '}';
    }
    public void washDish(){
        if (!dirtyDish.empty ()){
            Dish dish=dirtyDish.pop ();
            cleanDish.push (dish);
            dish.setClean (true);
            System.out.println ("dish is washed"+dish);
        }else System.out.println ("all dishes are clean");
    }
    public void washGlass(){
        if (!dirtyGlass.empty ()){
            Glass glass=dirtyGlass.pop ();
            cleanGlass.push (glass);
            glass.setClean (true);
            System.out.println ("glass is washed"+glass);
        }else System.out.println ("all glasses are clean");
    }
}
