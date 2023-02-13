package theInventoryManager.dao;

import theInventoryManager.entity.Inventory;

import java.util.List;

public interface InventoryDao {

    void createInventory(Inventory inventory);

    void updateInventory(Inventory inventory);

    void deleteInventory(Integer inventoryId);

    List<Inventory> getAllInventory();

    Inventory getInventoryById(Integer inventoryId);
}
