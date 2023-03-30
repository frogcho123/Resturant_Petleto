package Menu_Storage;

public class Drink {
    private String name;
    private int millilitres;

    public Drink(String name , int millilitres) {
        this.name = name;
        this.millilitres = millilitres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMillilitres() {
        return millilitres;
    }

    public void setMillilitres(int millilitres) {
        this.millilitres = millilitres;
    }

    @Override
    public String toString() {
        return  "drink name is "+ name +" and is " + millilitres+" millilitres \n";
    }
}
