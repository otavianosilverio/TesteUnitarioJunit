package TesteJunit;

public class Invoice {

	  private int numero, quantidade;
	    private String descricao;
	    private double preco;
	   
	    Invoice(){}
	    Invoice(int numero, int quantidade, String descricao, double preco){
	        this.numero=numero;
	        this.quantidade=quantidade;
	        this.descricao=descricao;
	        this.preco=preco;
	    }
	   
	    public void setNumero(int numero){
	        this.numero=numero;
	    }
	    public void setQuantidade(int quantidade){
	        this.quantidade=quantidade;
	    }
	    public void setDescricao(String descricao){
	        this.descricao=descricao;
	    }
	    public void setPreco(double preco){
	        this.preco=preco;
	    }
	   
	    public int getNumero(){
	        return numero;
	    }
	    public int getQuantidade(){
	        return quantidade;
	    }
	    public String getDescricao(){
	        return descricao;
	    }   
	    public double getPreco(){
	        return preco;
	    }

	    public double getInvoiceAmount(){
	        double amount = preco*quantidade;
	        if(quantidade<0){ this.quantidade=0; }
	        if(preco<0){this.preco=0.0;}
	        return amount;
	    }
}
	
