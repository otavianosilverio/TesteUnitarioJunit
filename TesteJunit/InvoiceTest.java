package TesteJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvoiceTest {
	
    
	@Test
	void testSetQuantidade() {

		 // Implementa método de teste unitário: Idade
        Invoice p2 = new Invoice();
        p2.setQuantidade(2);
        assertEquals(2, p2.getQuantidade());
	}

	@Test
	void testSetPreco() {
		 // Implementa método de teste unitário: Idade
        Invoice p3 = new Invoice();
        p3.setPreco(16.20);
        assertEquals(16.20, p3.getPreco());
      
        
	}
	
	@Test
	void testGetAmount() {
		 // Implementa método de teste unitário: Idade
		 Invoice p2 = new Invoice();
	     p2.setQuantidade(2);
	     p2.setPreco(10.00);
         assertEquals(21.00,p2.getInvoiceAmount(),"Mensagem indicando o que deveria ocorrer");
        
	}
	
	@Test
	void testSetDescricao() {
		
		// Implementa método de teste unitário: Nome
        Invoice p1 = new Invoice();
        p1.setDescricao("Jose");
        assertEquals("Jose", p1.getDescricao());
	}

	

}
