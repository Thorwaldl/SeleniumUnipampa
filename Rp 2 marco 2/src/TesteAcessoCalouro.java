import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAcessoCalouro {

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

		driver.findElement(By.xpath("//imput[@css='p:nth-child(1) > .botão_menu:nth-child(2)'")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//imput[@css='img[alt=Atenção]'")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//imput[@css='img[alt=Voltar]'")).click();
		Thread.sleep(3000);

		
		
		
	}
}
