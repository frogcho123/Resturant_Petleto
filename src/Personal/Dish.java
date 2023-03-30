package Personal;

public class Dish {
    private boolean isClean;

    public Dish(boolean isClean) {
        this.isClean = isClean;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "isClean=" + isClean +
                '}';
    }
}
