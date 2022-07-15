package tests.searchflats;

import org.testng.annotations.Test;

public class SOUTTest {

    @Test(dataProvider = "dataProviderMethod", dataProviderClass = DataProviderClass.class)
    public void SOUTTest(String number, String string) {
        System.out.println("Test!!" + number + string);
    }


}
