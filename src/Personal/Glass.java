package Personal;

public class Glass {
    private boolean isClean;

    public Glass(boolean isClean) {
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
        return "Glass{" +
                "isClean=" + isClean +
                '}';
    }
}
