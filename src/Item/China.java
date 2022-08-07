package Item;

public class China<T> extends Item {
    protected T name;
    protected int countryArea;
    protected T capitalName;

    public China(T name, int countryArea, T capitalName) {
        super(name, countryArea);
        this.capitalName = capitalName;
    }
}
