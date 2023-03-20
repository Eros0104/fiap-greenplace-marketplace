import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean {
	private List<String> listaSelecionados;
	private String quantidade;
	private String pagamento;
		
	public CarrinhoBean(List<String> listaSelecionados, String quantidade, String pagamento) {
		super();
		this.listaSelecionados = listaSelecionados;
		this.quantidade = quantidade;
		this.pagamento = pagamento;
	}
	public CarrinhoBean() {
		super();
	}
	public void comprar() {
		for(String valor : listaSelecionados)
			System.out.println(valor);	
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Forma de pagamento: " + getPagamento());
	}		
	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}
	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}
	public List<Forma> getFormasDePagamento(){
		List<Forma> formas = new ArrayList<Forma>();
		formas.add(new Forma(1, "Crédito"));
		formas.add(new Forma(1, "Débito"));
		formas.add(new Forma(1, "Boleto"));
		return formas;
	}
	public List<ProdutoBean> getProdutos() {
		List<ProdutoBean> lista = new ArrayList<ProdutoBean>();
		lista.add(new ProdutoBean(1, "Notebook", 2500));
		lista.add(new ProdutoBean(2, "Celular", 2000));
		lista.add(new ProdutoBean(3, "Teclado", 250));
		return lista;
	}	
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
}
