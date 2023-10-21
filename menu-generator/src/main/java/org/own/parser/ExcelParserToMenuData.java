package org.own.parser;

import lombok.Getter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.own.parser.dto.DishesDto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ExcelParserToMenuData {
    private static final Log LOGGER = LogFactory.getLog(ExcelParserToMenuData.class);
    private XSSFWorkbook myWorkBook;
    @Getter
    private String menuName;
    @Getter
    private final HashMap<String, List<DishesDto>> dishCategoriesMap;

    public ExcelParserToMenuData(final String path) {
        File xlsx = new File(path);
        try (FileInputStream fis = new FileInputStream(xlsx)) {
            this.myWorkBook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
        
        this.dishCategoriesMap = new HashMap<>();
    }
}
