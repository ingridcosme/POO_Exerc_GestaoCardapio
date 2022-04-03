package edu.curso;

public class Prato {

	private long id;
	private String codigo;
	private String nome;
	private int calorias;
	private double preco;
	private String ingredientes;
	
	public Prato() {
		
	}
	
	@Override
	public String toString() {
		return "Prato " + nome + " contém " + calorias + " calorias e custa R$ %4.2f" + preco + ".";
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCalorias() {
		return calorias;
	}
	
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getIngredientes() {
		return ingredientes;
	}
	
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
}
