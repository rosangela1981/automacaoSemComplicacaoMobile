package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProdutoPage {
    @AndroidFindBy(accessibility = "conhecaTodosOsNossosCursos")
    public WebElement txtTituloProdutos;

    public ProdutoPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public String getTextTituloProdutos(){
        return txtTituloProdutos.getText();
    }

}
