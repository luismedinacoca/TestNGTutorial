import org.testng.annotations.DataProvider;

public class _09_CustomDataProvider {

    @DataProvider(name="NameDataProvider")
    public Object[][] getData(){
        Object[][] data = {{"María", "la del Barrio"},
                {"Carlos ", "Dos Pistolas"},
                {"Agusto ", "del Cliente"},
                {"Matrisuicidio ", "sin Paz"}};
        return data;
    }
}
