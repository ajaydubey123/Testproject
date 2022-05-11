    package com.epicDMC.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Ajay
 *created 11-09-2017
 */
public class ExcelUtils {
     static String filepath=".\\testdata\\TestData.xlsx";
     /**
      * @description readData() will read the data from testData.xlsx
      * @param sheetName
      * @param rowNum
      * @param cellNum
      * return String
      */
     public static String readData(String sheetName,int rowNum,int cellNum)
     {
    	 String value=null;
    	 try{
    		 Workbook wb= WorkbookFactory.create(new FileInputStream(new File(filepath)));
    		 value=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
    	 }
    	 catch(EncryptedDocumentException | InvalidFormatException | IOException e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return value;
     }
//     public static String[] toReadExcelData(String sTestCaseID){
// 		String sData[]=null;
// 		try
// 		{
// 			FileInputStream fis= new FileInputStream(new File(".\\testData\\TestData.xlsx"));
// 			Workbook wb= WorkbookFactory.create(fis);
// 		       Sheet sht = wb.getSheet("Sheet1");
// 		       int iRowNum = sht.getLastRowNum();
// 		       for (int i = 1; i <= iRowNum; i++) {
// 		    	   if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID)){
// 		    		    int iCellNum = sht.getRow(i).getLastCellNum();
// 		    		   sData=new String[iCellNum];
// 		    		   for (int j = 0; j <iCellNum; j++) {
// 		    			   sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
// 		    			  
//					}
// 		    		   break;
// 		    	   }
// 		    	  
//			}
// 		      
// 			
// 		}//end of try
// 		catch(EncryptedDocumentException e)
// 		{
// 			e.printStackTrace();
// 		}
// 		catch(InvalidFormatException e)
// 		{
// 			e.printStackTrace();
// 		}
// 		catch(IOException e)
// 		{
// 			e.printStackTrace();
// 		}
// 		return sData;
// 	}
//     /**************************************/
//    
     
}

