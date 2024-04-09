package testsChronos;

import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.ProdutoPage;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTests {
    LoginPage loginPage;

    ProdutoPage produtoPage;




    @Test
    public void imprimirNoConsole(){
       System.out.println("Primeiro teste!");
    }

    @Test
    public void realizarLoginValido() throws MalformedURLException {
        Driver.inicializaDriver();
        loginPage=new LoginPage();


        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");

        produtoPage = new ProdutoPage();
        assertEquals("Conheça todos os nossos cursos", produtoPage.getTextTituloProdutos());


    }




    }
