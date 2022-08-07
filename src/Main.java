import Item.Item;
import Item.Russia;
import Item.Canada;
import Item.Brazil;
import Item.USA;
import Item.China;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MagicBox<Item> magicBox = new MagicBox<>(4);

        Item<Integer> item = new Russia<>("Russia", 17_102_345, "Moscow");
        Item<Integer> item1 = new Canada<>("Canada", 9_976_139, "Ottawa");
        Item<Integer> item2 = new China<>("China", 9_640_821, "Beijing");
        Item<Integer> item3 = new USA<>("USA", 9_522_057, "Washington");
        Item<Integer> item4 = new Brazil<>("Brazil", 8_511_965, "Brazilia");

        magicBox.add(item);
        magicBox.add(item1);
        magicBox.add(item2);
        magicBox.add(item3);
        magicBox.add(item4);
        magicBox.pick();

        System.out.println(" ");

        MagicBox<Item> magicBox1 = new MagicBox<>(4);

        Item<String> item5 = new Russia<>("Russia", 17_102_345, "Moscow");
        Item<String> item6 = new Canada<>("Canada", 9_976_139, "Ottawa");
        Item<String> item7 = new China<>("China", 9_640_821, "Beijing");
        Item<String> item8 = new USA<>("USA", 9_522_057, "Washington");
        Item<String> item9 = new Brazil<>("Brazil", 8_511_965, "Brazilia");

        magicBox1.add(item6);
        magicBox1.add(item8);
        magicBox1.add(item7);
        magicBox1.add(item5);
        magicBox1.add(item9);
        magicBox1.pick();

    }
}
