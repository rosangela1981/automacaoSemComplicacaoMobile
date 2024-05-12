package testsChronos;

import core.Driver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProdutosPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTests {
    LoginPage loginPage;

    ProdutosPage produtosPage;

    @BeforeEach
    public  void inicializaTesteLogin() throws MalformedURLException {
        Driver.inicializaDriver();
        loginPage =new LoginPage();

    }

    @Test
    public void imprimirNoConsole(){
       System.out.println("Primeiro teste!");
    }


    @Test
    public void realizarLoginValido() {
        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");

        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos",produtosPage.getTextTituloProdutos());
    }




    @Test
    public void realizarLoginEmailInvalido() {

        loginPage.realizarLogin("teste","123456");
        assertEquals("O email não é válido.",loginPage.getTxtEmailError());
      }
      @Test
      public void realizarLoginSenhaInvalida(){
              loginPage.realizarLogin("teste@chronos.com.br", "123");
              assertEquals("A senha deve ter no mínimo 6  caracteres.",loginPage.getTxtPasswordError());
      }

     @Test
     public void realizarLoginEmailEmBranco() {
         loginPage.realizarLogin("", "123456");
         assertEquals("O campo de email é obrigatório", loginPage.getTxtEmailError());

     }
     @Test
     public void realizarLoginSenhaEmBranco(){
        loginPage.realizarLogin("teste@chronos.com.br", "");
         assertEquals("O campo senha é obrigatório", loginPage.getTxtPasswordError());
     }


    @Test
     public void realizarLoginComEmailIncorreto(){
        loginPage.realizarLogin("incorreto@chronosacademy","123456");
        assertEquals("Email ou senha incorretos.",loginPage.getTxtEmailError());
     }



    }
