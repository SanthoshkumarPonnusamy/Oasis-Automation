package com.oasis.ui.utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class TestDataHelper {
    ResourceBundle rd = ResourceBundle.getBundle("testdata-config");
    Map<String, String> testDataInMap = new HashMap<String, String>();

    public Map<String, String> getTestDataInMap() {
        return testDataInMap;
    }

    public void setTestDataInMap(Map<String, String> testDataInMap) {
        this.testDataInMap = testDataInMap;
    }

    public Map<String, String> getData() throws Exception {
        Map<String, String> TestDataInMap = DataHandler.getTestDataInMap(rd.getString("testDataFilePath"), rd.getString("sheetname"), "TestCase_001");
        setTestDataInMap(TestDataInMap);
        return TestDataInMap;
    }
}
