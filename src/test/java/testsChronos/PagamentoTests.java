package testsChronos;


import core.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.DetalhesCursoPage;
import pages.LoginPage;
import pages.PagamentoPage;
import pages.ProdutosPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoTests {
    LoginPage loginPage;
    ProdutosPage produtosPage;
    DetalhesCursoPage detalhesCursoPage;
    PagamentoPage pagamentoPage;

    @BeforeEach
    public void inicializaTeste() throws MalformedURLException {
        Driver.inicializaDriver();
        loginPage = new LoginPage();
        produtosPage = new ProdutosPage();
        detalhesCursoPage = new DetalhesCursoPage();
        pagamentoPage = new PagamentoPage();
    }

    @Test
    public void realizarCompraDeCurso() {
        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTextTituloProdutos());


        Driver.swipe(0,0,"down",1.0);


        produtosPage.clickPacoteCurso();
        detalhesCursoPage.clickBtnIrParaPagamento();
        pagamentoPage.clickCartaoDeCredito();
        pagamentoPage.finalizaCompraCartao("5320775618951072", "05/09/2025", "855",
                "Chronos", "50899911030");



        assertEquals("Pagamento Realizado!", pagamentoPage.getMsgPagamento());
    }


    }



