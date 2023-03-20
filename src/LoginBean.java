import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	private String login;
	private String senha;
	private boolean termo;
	
	public void logar() {		
		System.out.println("eros".equals(getLogin()) && "1234".equals(getSenha()) ?
			"Usuario logado: " + getLogin():"Usuario nao autorizado!");
		System.out.println("Checkbox conectado: " + termo);
	}	
	public boolean isTermo() {
		return termo;
	}
	public void setTermo(boolean termo) {
		this.termo = termo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public LoginBean(String login, String senha, boolean termo) {
		super();
		this.login = login;
		this.senha = senha;
		this.termo = termo;
	}
	public LoginBean() {
		super();
	}	
}
