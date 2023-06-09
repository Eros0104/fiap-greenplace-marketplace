import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "cartBean")
@SessionScoped
public class CartBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<CartItem> items;

    public CartBean() {
        items = new ArrayList<CartItem>();
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }
    
    public double getTotalPrice() {
    	double totalPrice = 0;
    	
        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }
        
        return totalPrice;
    }

    public void addToCart(Product product) {
        for (CartItem item : items) {
            if (item.getProduct().equals(product)) {
                item.setQuantity(item.getQuantity() + 1);
                return;
            }
        }
        
        CartItem newItem = new CartItem(product, 1);
        items.add(newItem);
    }
    
    public int getSize() {
    	return items.size();
    }
    
    public void cleanCart() {
    	items = new ArrayList<CartItem>();
    }
}