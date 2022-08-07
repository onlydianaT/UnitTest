package Item;

public class Brazil<T> extends Item {
    protected T name;
    protected int countryArea;
    protected T capitalName;

    public Brazil(T name, int countryArea, T capitalName) {
        super(name, countryArea);
        this.capitalName = capitalName;
    }
}
