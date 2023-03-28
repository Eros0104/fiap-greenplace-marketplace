import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean (name = "deliveryBean")
public class DeliveryBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
    private String address;
    private String phone;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void placeOrder() {

    }
}