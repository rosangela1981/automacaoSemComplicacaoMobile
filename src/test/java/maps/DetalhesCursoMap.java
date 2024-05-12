package maps;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DetalhesCursoMap {

    @AndroidFindBy (accessibility = "irParaoPagamentoProductText")
    protected WebElement btnIrParaPagamento;

    @AndroidFindBy(accessibility = "adicionar_Carrinho")
    protected WebElement btnAdicionarCarrinho;

    @AndroidFindBy(accessibility = "voltar_detalhes_texto")
    protected WebElement txtBotaoVoltar;

    @AndroidFindBy(accessibility = "descricaoProduto")
    protected WebElement txtDescricaoProduto;

    @AndroidFindBy(accessibility = "tituloProduto")
    protected WebElement txtTituloProduto;

    @AndroidFindBy(accessibility = "imagemProduto")
    protected WebElement imagemProduto;

    @AndroidFindBy(accessibility = "detalhesCurso")
    protected WebElement txtDetalheCurso;

    @AndroidFindBy(accessibility = "73.15_pacote_11_cursos_19_tecnologias")
    protected WebElement txtValorCurso;




}
