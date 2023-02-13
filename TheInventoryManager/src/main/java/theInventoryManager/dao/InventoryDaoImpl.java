package theInventoryManager.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import theInventoryManager.entity.Inventory;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class InventoryDaoImpl implements InventoryDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void createInventory(Inventory inventory) {
        this.hibernateTemplate.save(inventory);
    }

    @Transactional
    public void updateInventory(Inventory inventory){
        this.hibernateTemplate.update(inventory);
    }

    @Transactional
    public void deleteInventory(Integer inventoryId) {
        Inventory inventory = this.hibernateTemplate.load(Inventory.class, inventoryId);
        this.hibernateTemplate.delete(inventory);
    }

    public List<Inventory> getAllInventory() {
        return this.hibernateTemplate.loadAll(Inventory.class);
    }

    public Inventory getInventoryById(Integer inventoryId) {
        return this.hibernateTemplate.load(Inventory.class, inventoryId);
    }
}
