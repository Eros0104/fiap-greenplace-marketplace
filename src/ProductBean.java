import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "productBean")
@SessionScoped
public class ProductBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Product> products;

    public ProductBean() {
        products = new ArrayList<>();
        products.add(new Product("Product 1", 10.00));
        products.add(new Product("Product 2", 20.00));
        products.add(new Product("Product 3", 30.00));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}