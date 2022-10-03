import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {

    protected int amountOfObject;
    protected T[] items;
    private Random random = new Random();

    public MagicBox(int amountOfObject) {
        this.amountOfObject = amountOfObject;
        items = (T[]) new Object[amountOfObject];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Mest dlya dobavleniya new object net");
        System.out.println(Arrays.toString(items));
        return false;
    }

    public T pick() {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                count++;
            }
        }
        if (count != 0) {
            throw new RuntimeException("Box is not full, free cells are " + count + " shtuk");
        } else {
            int randomInt = random.nextInt(amountOfObject);
            T choosenItem = items[randomInt];
            System.out.println("Vibor sohranennogo elementa metodom Random: " + choosenItem);
            return (choosenItem);
        }
    }
}
