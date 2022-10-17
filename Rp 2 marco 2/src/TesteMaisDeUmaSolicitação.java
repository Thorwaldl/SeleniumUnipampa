import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteMaisDeUmaSolicitação {

	public static void main(String[] args) throws InterruptedException {
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
		
		if (ok =false) {
			System.out.println(" teste com sucesso");
		}
		
		
		
	}
}
