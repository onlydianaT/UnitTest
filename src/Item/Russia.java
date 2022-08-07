package Item;

public class Russia<T> extends Item {
    protected T name;
    protected int countryArea;
    protected T capitalName;

    public Russia(T name, int countryArea, T capitalName) {
        super(name, countryArea);
        this.capitalName = capitalName;
    }

}


