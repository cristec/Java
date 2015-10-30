package testeUnitarios2;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendaTest {

		@Test 
		public void testTotalVenda() {
			
			// Cen�rio 
			Venda venda = new Venda(); 
			venda.getItens().add(new ItemVenda("Camiseta", 50.0));
			venda.getItens().add(new ItemVenda("Calca", 100.0)); 
			
			// Chamada ao m�todo que estamos testando 
			Double totalVenda = venda.totalVenda(); 
			
			// Verifica��o do resultado esperado 	
			Assert.assertEquals(new Double(164), totalVenda,1); 
			System.out.println("Executando o processo");
	}
		@Before public void preparacao() { 
			// Exemplo: Configura��o de conex�o com banco de dados 
			System.out.println("iniciando teste");
		 }
		@After public void finalizacao() { 
			System.out.println("Terminado teste");
			
		}
}
