package Seleniumpaket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumzadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wb = new FirefoxDriver();

		wb.get("http://newtours.demoaut.com/");
		// Thread.sleep(2000);
		wb.findElement(By.linkText("REGISTER")).click();
		// Thread.sleep(2000);
		WebElement ime = wb.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		ime.click();
		ime.sendKeys("Marko");
		WebElement prezime = wb.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
		prezime.click();
		prezime.sendKeys("Mirazic");
		WebElement telefon = wb.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
		telefon.click();
		telefon.sendKeys("1234567890");
		WebElement mail = wb.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]"));
		mail.click();
		mail.sendKeys("mirazicm@yahoo.com");
		WebElement adresa = wb.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/input[1]"));
		adresa.click();
		adresa.sendKeys("Svetog Save 33");
		WebElement grad = wb.findElement(By.name("city"));
		grad.click();
		grad.sendKeys("Belgrade");
		WebElement drzava = wb.findElement(By.name("state"));
		drzava.click();
		drzava.sendKeys("Serbia");
		WebElement postanskiBroj = wb.findElement(By.name("postalCode"));
		postanskiBroj.click();
		postanskiBroj.sendKeys("+381");
		Select country = new Select(wb.findElement(By.name("country")));
		country.selectByVisibleText("SERBIA");
		WebElement user = wb.findElement(By.name("email"));
		user.click();
		user.sendKeys("Mare");
		WebElement pass = wb.findElement(By.name("password"));
		pass.click();
		pass.sendKeys("MareCare12345");
		WebElement pass2 = wb.findElement(By.name("confirmPassword"));
		pass2.click();
		pass2.sendKeys("MareCare12345");
		WebElement submit = wb.findElement(By.name("register"));
		submit.click();

	}

}
