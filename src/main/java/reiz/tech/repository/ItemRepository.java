package reiz.tech.repository;
import reiz.tech.entity.Item;
import reiz.tech.factory.ItemFactory;

public class ItemRepository {

    private final ItemFactory itemFactory;

    public ItemRepository(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
    }

    public Item getItemById(String id) {
        return null;
    }
}

