package BDDAutomationExerciseUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BDDAutomationExercisePage.ReadConfigFile;

public class ReadExcelSheet{
	
	public static Properties prop=ReadConfigFile.generateProp();

	public static HashMap<String, String> readData(String sheetName, int rowNumber){
		
		List<HashMap<String, String>> data=new ArrayList<HashMap<String, String>>();
		
		try {
			
//		File fs = new File("data/automationExerciseData.xlsx");
		File fs = new File((String) prop.getProperty("styleSheetPath"));

		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet(sheetName);
		XSSFCell cell;

		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(0).getLastCellNum();

		
		HashMap<String, String> data1;

		for (int i = 1; i < rows; i++) {
			data1 = new HashMap<String, String>();
			for (int j = 0; j < columns; j++) {
				cell = sheet.getRow(i).getCell(j);
				String key = sheet.getRow(0).getCell(j).toString();
				if (cell == null) {
					data1.put(key, "");

				} else
					data1.put(key, cell.toString());

			}
			data.add(data1);
			data1 = null;
		}
		wb.close();
		}catch(InvalidFormatException|IOException e) {
			e.printStackTrace();
		}
		return data.get(rowNumber);

	}

	

	

}
