package project;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;


public class Project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
        driver.findElement(By.name("q")).sendKeys("amazon");
        try {
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        
       
        
		
        String csvfile= "C:/Users/chinm/OneDrive/Desktop/clg/project.csv";
		String line;
		
		try(BufferedReader br = new BufferedReader(new FileReader(csvfile))){
			br.readLine();
			while((line= br.readLine())!=null) {
			String[] data= line.split(",");
			String username= data[0];
			String password=data[1];
			
			
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bsign%2Bin%26adgrpid%3D138506081990%26ext_vrnc%3Dhi%26hvadid%3D674474151981%26hvdev%3Dc%26hvlocphy%3D9062045%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D12840195820171337422%26hvtargid%3Dkwd-24787317188%26hydadcr%3D564_2683761%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			WebElement usernameField= driver.findElement(By.id("ap_email"));
			usernameField.sendKeys(username);
			WebElement loginbutton= driver.findElement(By.id("continue"));
			loginbutton.click();
			//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bsign%2Bin%26adgrpid%3D138506081990%26ext_vrnc%3Dhi%26hvadid%3D674474151981%26hvdev%3Dc%26hvlocphy%3D9062045%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D12840195820171337422%26hvtargid%3Dkwd-24787317188%26hydadcr%3D564_2683761%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			WebElement passwordField= driver.findElement(By.id("ap_password"));
			
			passwordField.sendKeys(password);
			WebElement login= driver.findElement(By.id("signInSubmit"));
			login.click();
			Thread.sleep(1000);
			if (driver.getCurrentUrl().contains("https://www.amazon.in/")) {
			System.out.println("logged in for user:" + username);
			 //driver.get("https://www.amazon.in/gp/css/order-history?ref_=nav_AccountFlyout_orders");
		       
			
		}
			else {
				System.out.println("Failed login for user:"+ username);
			}
			
		
			}	

}
	catch (IOException e) {
		e.printStackTrace();
	}driver.get("https://www.amazon.in/");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shampoo");
    driver.findElement(By.id("nav-search-submit-button")).click();
    driver.get("https://www.amazon.in/Park-Avenue-Shampoo-Shiny-Bouncy/dp/B00HT03X76/ref=sr_1_17_mod_primary_new?crid=L3M96UORUWFY&dib=eyJ2IjoiMSJ9.v3oY7UFqgm8sSUonMbJAl44sPbiGLzD2duSGRJ4aIdi_9S0pYw5_dqfNoiTH64sjkxSaJSiEtgxS2Tm2LbCdf8OWVEoaYoYW4FVJByTerPlU-_cbZLyAqvJcrmHp4b-ZpRcPEonJzqt5ZFXp-BdIgHqzBI6hnCyRdW2wK3OIWLMaupmjvE2y9tkgFjg2cswqOpcs4LsfCCWY8pWNUxC5fmGtNHWkSFwRUV5xwalyk5GnusyBQrIpzxGm-PzuOwS1RL3ReT4fXF6-HWssa-ZC2kT0py_EpC2iQDBLDua2l9qMuYKr-Pwkh--jLIszzaeLiDWpUGUOmp__IVkInj4g9_0tgLVSWUAJrYd2QqkTw-nJa0MtDCTi35pK2t8shTdTilRZJDIybCLx6a2rlZN9N8KH5c9HUj-GNkxbm59u6roj8mdfUT0WrOMv8ZuWGASW.Jzb8bcwfKP0b8YVqpe7Ofu28cF523Vd1any8Y_Cm5tQ&dib_tag=se&keywords=shampoo&qid=1734536711&sbo=RZvfv%2F%2FHxDF%2BO5021pAnSA%3D%3D&sprefix=shampo%2Caps%2C250&sr=8-17&th=1");
    
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        
        String screenshotPath ="C:/Users/chinm/OneDrive/Desktop/screenshot.bmp"; // Change the path if needed
        com.google.common.io.Files.copy(screenshot, new File(screenshotPath));

        System.out.println("Screenshot saved at: " + screenshotPath);
    } catch (IOException e) {
        System.err.println("Failed to save screenshot: " + e.getMessage());
    }
        driver.get("https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fhz%2Fwishlist%2Fintro&ref_=footer_lang");
        WebElement radiobutton = driver.findElement(By.id("icp-language-translation-hint"));
        if( !radiobutton.isSelected()) {
        	radiobutton.click();
        	Thread.sleep(1000);
        	
        }
    	driver.get("https://www.amazon.in/customer-preferences/country?ie=UTF8&preferencesReturnUrl=%2Fs%3Fk%3Dshampoo%26crid%3DL3M96UORUWFY%26sprefix%3Dshampo%252Caps%252C250%26ref%3Dnb_sb_noss_2&ref_=footer_icp_cp");
    	WebElement dropdown = driver.findElement(By.id("icp-dropdown"));
    	Select select = new Select(dropdown);
    	
    	select.selectByVisibleText("Australia");

        // Optionally, verify the selected option
        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("Selected option: " + selectedOption.getText());
        Thread.sleep(1000);
        driver.navigate().forward();
         
        
        driver.quit();
    }
	}



