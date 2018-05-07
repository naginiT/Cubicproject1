package Operation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Repository.Inspectelement;

public class Login_operation {
	
	public static void show() throws Exception
	{
		Inspectelement.signin().click();
		Thread.sleep(3000);
		FileInputStream fis=new FileInputStream("D:\\vijaylaxmi\\BookStoreSummary.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=workbook.getSheet(" Test Data for USER LOGIN");
        System.out.println(sheet.getSheetName());
        System.out.println("sheet.getLastRowNum() "+sheet.getLastRowNum());
        System.out.println(sheet.getRow(4).getCell(1));
        XSSFCell cell ;
        //driver.get("http://matrimony.cubicitsolution.com/");
		System.out.println("sheet.getLastRowNum() "+sheet.getLastRowNum());
       /* for(int i=2;i<=sheet.getLastRowNum();i++)
        {*/
        	
        	cell=sheet.getRow(2).getCell(1);
          
    		//Inspectelement().signin().click();
    		Thread.sleep(3000);
    		
    		
    		Inspectelement.email().sendKeys(cell.getStringCellValue());
    		Thread.sleep(3000);
    		
		cell=sheet.getRow(2).getCell(2);
		  cell.setCellType(cell.CELL_TYPE_STRING);
          String data=cell.getStringCellValue();
          System.out.println("data on excel "+data );
		//double data0= workbook.getSheetAt(0).getRow(i).getCell(1).getNumericCellValue();

        
		/*System.out.println("data in excel  "+data);
		
		String str=String.valueOf(data);
		System.out.println("Double is  "+str);	*/	
    		/*driver.findElement(By.name("password")).clear();	
    		Thread.sleep(4000);*/
		Inspectelement.password().sendKeys(cell.getStringCellValue());
	/*	driver.findElement(By.id("top-area-button-submit")).click();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[2]/a"));
		if(element.isDisplayed()) {
			Sheet1.getRow(i).createCell(3).setCellValue("Pass");
			FileOutputStream foi=new FileOutputStream("D:\\vijaylaxmi\\readexcel.xlsx");
			workbook.write(foi);
		}
		else {
			
			Sheet1.getRow(i).createCell(3).setCellValue("fail");
			FileOutputStream foi=new FileOutputStream("D:\\vijaylaxmi\\readexcel.xlsx");

			workbook.write(foi);

		}
		
		
		driver.findElement(By.xpath("//*[@id=\"top-area-nav\"]/ul/li[4]/a")).click();
		System.out.println("logout completed");
		
		
		


        }

		*/
		
		
		
		Inspectelement.signin1().click();
		cell=sheet.getRow(3).getCell(1);
		Thread.sleep(3000);
		Inspectelement.email().sendKeys(cell.getStringCellValue());
		Thread.sleep(3000);

	//	Inspectelement.login().click();
		
		cell=sheet.getRow(3).getCell(2);
		  cell.setCellType(cell.CELL_TYPE_STRING);
		  Inspectelement.password().sendKeys(cell.getStringCellValue());
		Inspectelement.reset().click();
		Thread.sleep(3000);
		Inspectelement.clickhere().click();
		Thread.sleep(3000);cell=sheet.getRow(2).getCell(1);
		Thread.sleep(3000);
		Inspectelement.email().sendKeys(cell.getStringCellValue());
		
		Inspectelement.technology().click();
		
WebElement element = Inspectelement.technology() ;
Select sel=new Select(element);
		
		sel.selectByVisibleText("Java");
		Inspectelement.sendpassword().click();
		
        }

	}

