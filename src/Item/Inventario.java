package Item;

public class Inventario {
    
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;

    public void adicionaItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
}
