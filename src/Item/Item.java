package Item;

public class Item<T> {
    int countryArea;
    protected T name;


    public void setName(T Name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setCountryArea(int countryArea) {

        this.countryArea = countryArea;
    }

    public int getCountryArea() {
        return countryArea;
    }

    public Item(T name, int countryArea) {
        this.name = name;
        this.countryArea = countryArea;
    }


    public boolean add(int countryArea) {
        if ((int) countryArea > 0) {

            return true;
        }
        return false;
    }


}
