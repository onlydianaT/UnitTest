package Item;

public class Canada<T, U> extends Item {
    protected T name;
    protected int countryArea;
    protected T capitalName;

    public Canada(T name, int countryArea, T capitalName) {
        super(name, countryArea);
        this.capitalName = capitalName;
    }

}
