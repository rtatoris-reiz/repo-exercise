package reiz.tech.factory;
import reiz.tech.entity.Item;
public interface ItemFactory {

    Item buildNewItem(String id);

}
