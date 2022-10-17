import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAcessoSolicitaçãoTrancamentoParcial {

	public static void main(String[] args) throws InterruptedException {
		String matricula="1801560699";
		String exePath = "C:\\Users\\utmgu\\Downloads\\Nova pasta\\chromedriver_win32 (3)\\chromedriver.exe";
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

		driver.findElement(By.xpath("//imput[@css=img[title='Solicitação de Trancamento Parcial]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//imput[@id=chkCurricSolParcial_9650464'")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//imput[@id=imagem_botão_salvar")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//imput[@css=ui-state-hover>.ui-button-text")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//imput[@id=txtJustificativa")).sendKeys("...");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//imput[@id=imagem_botão_salvar")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
	}
}
