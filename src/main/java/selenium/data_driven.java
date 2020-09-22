package selenium;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class data_driven {

	public static void main(String[] args) throws IOException {
		//reading data from excel
		FileInputStream file=new FileInputStream("c://Users/alfin.anthonyraj/emp_det.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("sheet1");
		int rc=sheet.getLastRowNum();
		int cc=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rc;i++)
		{
			XSSFRow cr=sheet.getRow(i);
			for(int j=0;j<cc;j++)
			{
				String value=cr.getCell(j).toString();
				System.out.print(" " +value);
			}
			System.out.println();
		}
		//writing data to excel
		FileOutputStream fo=new FileOutputStream("c://Users/alfin.anthonyraj/emp_det1.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook();
		XSSFSheet sheet1=wb.createSheet("sheet2");
		for(int i=0;i<=5;i++)
		{
			XSSFRow row=sheet1.createRow(i);
			for(int j=0;j<3;j++)
			{
				row.createCell(j).setCellValue("sddghg");
			}
		}
		wb1.write(fo);
		fo.close();
		System.out.println("Writen data is completed..");
	}

}
