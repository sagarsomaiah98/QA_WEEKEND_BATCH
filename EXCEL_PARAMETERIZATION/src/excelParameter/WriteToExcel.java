package excelParameter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteToExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		try (OutputStream fileOut = new FileOutputStream("S:\\QA_WEEKEND_BATCH\\EXCEL_PARAMETERIZATION\\src\\TestData\\Test.xlsx")) {
			
			Workbook wb = new XSSFWorkbook();  // or new XSSFWorkbook();
			Sheet S1 = wb.createSheet("SHEET 1");
			Sheet S2 = wb.createSheet("SHEET 2");
			Row row = S1.createRow(0);
			//Cell cell = row.createCell(0);
			//cell.setCellValue(900);
			
			row.createCell(1).setCellValue(1.2);
			row.createCell(2).setCellValue("SELENIUM");
			row.createCell(3).setCellValue(true);
		    wb.write(fileOut);
		}

	}

}
