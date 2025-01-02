package com.utilityClasses;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(UtilityConstants.excelPath);
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		String data = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		workbook.close();
		return data;
	}

	public String getDataFromPropertiesFiles(String Key) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(UtilityConstants.propertyPath);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String data = properties.getProperty(Key);
		return data;
	}
	

	
}