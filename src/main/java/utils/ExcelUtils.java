package utils;

import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;

/*
ExcelUtils handles reading and writing test data.
Random test data is saved so it can be reused
and validated later.
*/

public class ExcelUtils {

static String path = "src/test/resources/TestData.xlsx";

public static void writeData(int row, String value) {

try {

XSSFWorkbook workbook;

File file = new File(path);

if(file.exists())
workbook = new XSSFWorkbook(path);
else
workbook = new XSSFWorkbook();

XSSFSheet sheet = workbook.createSheet("data");

sheet.createRow(row).createCell(0).setCellValue(value);

FileOutputStream fos = new FileOutputStream(path);

workbook.write(fos);

fos.close();

} catch(Exception e) {

e.printStackTrace();
}

}

}
