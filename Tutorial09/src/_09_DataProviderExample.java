import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _09_DataProviderExample {

    @DataProvider(name="LoginDataProvider")
    public Object[][] getData(){
        Object[][] data = {{"marialuz@gmail.com", "maria01"},
                {"carlos@gmail.com", "carlos02"},
                {"agusto@gmail.com", "agusto03"},
                {"matrivias@gmail.com", "matrivias04"}};
        return data;
    }

    @Test(dataProvider= "LoginDataProvider", priority=1)
    public void loginTest(String email, String pwd){
        System.out.println(email + "\t\t\t\t"+pwd);
    }

    //DataProvider from another class
    @Test(dataProvider= "NameDataProvider",dataProviderClass = _09_CustomDataProvider.class, priority=2)
    public void InfoTest(String name, String lastname){
        System.out.println(name + "\t\t\t\t\t\t\t" + lastname);
    }
}