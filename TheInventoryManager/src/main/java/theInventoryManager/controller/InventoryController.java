package theInventoryManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import theInventoryManager.dao.InventoryDao;
import theInventoryManager.entity.Inventory;

import java.util.List;

@Controller
public class InventoryController {

    @Autowired
    private InventoryDao inventoryDao;

    @RequestMapping("/home")
    public String home (Model model){
        List<Inventory> inventories = this.inventoryDao.getAllInventory();
        model.addAttribute("inv", inventories);
        return "index";
    }

    @RequestMapping("/inventory")
    public String createInventory(Model model){
        model.addAttribute("title", "Inventory Form");
        return "Inventory-form";
    }

    @RequestMapping(path = "/handle-inventory", method = RequestMethod.POST)
    public RedirectView handleInventory (@ModelAttribute Inventory inventory){
        inventory.setTotalPrice(inventory.getPricePerItem() * inventory.getQuantity());
        this.inventoryDao.createInventory(inventory);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("home");
        return redirectView;
    }

    @RequestMapping("/inventory/{id}")
    public RedirectView deleteInventory (@PathVariable("id") Integer id){
        this.inventoryDao.deleteInventory(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/TheInventoryManager/home");
        return redirectView;
    }
}
