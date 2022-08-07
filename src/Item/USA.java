package Item;

public class USA<T> extends Item {
    protected T name;
    protected int countryArea;
    protected T capitalName;

    public USA(T name, int countryArea, T capitalName) {
        super(name, countryArea);
        this.capitalName = capitalName;
    }
}
