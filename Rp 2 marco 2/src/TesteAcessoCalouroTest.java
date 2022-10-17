import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TesteAcessoCalouroTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws InterruptedException {
		String matricula="1801560699";
		String exePath = "C:\\Users\\utmgu\\Downloads\\chromedriver_win32 (2)";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		String url ="http://guriensino.unipampa.edu.br/guri/";
		
		driver.get(url);
		driver.findElement(By.xpath("//imput[@id='login']")).sendKeys(matricula);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//imput[@id='senha']")).sendKeys("123");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//imput[@id='entrar']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//imput[@linkText='Painel do Aluno']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//imput[@css='p:nth-child(1) > .botão_menu:nth-child(2)'")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//imput[@css='img[alt=Atenção]'")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//imput[@css='img[alt=Voltar]'")).click();
		Thread.sleep(3000);
		
		
	}
	void testmdu() throws InterruptedException {
		String matricula="151150225";
		WebDriver driver = new ChromeDriver();
		String url ="http://guriensino.unipampa.edu.br/guri/";
		
		driver.get(url);
		driver.findElement(By.xpath("//imput[@id='login']")).sendKeys(matricula);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//imput[@id='senha']")).sendKeys("123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//imput[@id='entrar']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//imput[@linkText='Painel do Aluno']")).click();
		Thread.sleep(3000);

		boolean ok = driver.findElement(By.xpath("//imput[@css='img[title = Solicitação de trancamento total negada por exeder o limite por semestre.]'")).isEnabled();
		Thread.sleep(3000);
		assertEquals(false,ok);

	}
	
}
