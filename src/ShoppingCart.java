import java.util.ArrayList;

/*
a) ShoppingCart classını oluşturun. Oluşturmuş olduğunuz Item class’ını burada
 kullanmalısınız.
b) Sepete ekleyen metodu yazınız.
c) Sepetteki ürünlerin toplam fiyatını hesaplayan metodu yazınız.
 */

public class ShoppingCart {

    private ArrayList<Item> items; //sepetteki ürünler burada tutulur

    public ShoppingCart(ArrayList<Item> items) {
        this.items = (items == null) ? new ArrayList<>() : items; //eğer sepet yok ise(boşsa) oluşturulur.
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void listItems() {
        System.out.println(items);
    }

    public float totalPrice() {
        //   return (float) items.stream().mapToDouble(Item::getSatisFiyati).sum();

        float totalPrice = 0.0F;
        for (Item item : items) {
          totalPrice += item.getSatisFiyati();
        }
        return totalPrice;
    }
}
