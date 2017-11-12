package first;

public class Flanc extends Money{
    public Flanc(int amount) {
        this.amount = amount;
    }

    public Flanc times(int multiplier) {
        return new Flanc(this.amount * multiplier);
    }

}
