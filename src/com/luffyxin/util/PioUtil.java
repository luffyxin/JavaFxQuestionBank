package com.luffyxin.util;

import com.luffyxin.bean.Question;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ${DX} on 2018/8/28.
 */
public class PioUtil {
    public static void main(String[] args) throws IOException {
        String source="d:/question.xlsx";
        ArrayList<Question> questions=new ArrayList<>();
        ReadExcel(source,questions);
        for(Question q:questions){
            System.out.println(q);
        }
    }
    public static void ReadExcel(String source,ArrayList<Question> questions) throws IOException {

        Workbook workbook=null;
        FileInputStream fis=new FileInputStream(source);
        if(source.endsWith("xls")){
            workbook=new HSSFWorkbook(fis);
        }
        else{
            workbook=new XSSFWorkbook(fis);
        }

        Iterator<Sheet> sheetIterator=workbook.sheetIterator();
        while (sheetIterator.hasNext()){

            Iterator<Row> rowIterator=sheetIterator.next().rowIterator();
            while (rowIterator.hasNext()){
                String classify=rowIterator.next().getCell(0).getStringCellValue();
                String problem=rowIterator.next().getCell(1).getStringCellValue();
                String answer=rowIterator.next().getCell(2).getStringCellValue();
                questions.add(new Question(classify,problem,answer));
            }
        }
    }
}
