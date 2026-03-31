Automação de Testes Mobile: Chronos Academy 📱
Este projeto apresenta a implementação de testes automatizados para dispositivos Mobile, utilizando as melhores práticas de engenharia de software para garantir a qualidade de aplicativos em ambientes Android e iOS.

🛠️ Tecnologias Utilizadas
Java: Linguagem base para o desenvolvimento dos scripts.
Appium / Selenium: Framework para automação de interações em dispositivos móveis.
Page Factory: Utilizado para a inicialização dinâmica de elementos das telas.
JUnit: Para execução e validação dos resultados dos testes.
Maven: Gestão de dependências e build do projeto.

🏗️ Padrão de Projeto: Page Objects (Mobile)
A arquitetura do projeto foi desenhada para separar a localização dos elementos da lógica de interação, o que torna os testes muito mais fáceis de manter:
maps: Contém o mapeamento de elementos (IDs, XPaths, Accessibility IDs) específicos da interface mobile.
pages: Concentra os métodos que realizam as ações (ex: getTitulo2), encapsulando a complexidade do driver.

📋 Estrutura de Código
Camada de Mapeamento (PrincipalMap)
Focada em identificar componentes como títulos e botões de navegação dentro do fluxo do aplicativo.
Camada de Ações (CursoPage)
Utiliza o PageFactory para conectar o driver aos elementos mapeados, permitindo interações fluidas:

Java
public class CursoPage {
    private WebDriver driver;
    private CursoMap cursoMap;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver, cursoMap);
    }

    public String getTitulo2() {
       return cursoMap.h2Titulo.getText();
    }
}
🚀 Requisitos para Execução
Appium Server instalado e rodando.

Android Studio / Xcode (para emuladores ou simuladores).

Java JDK 11+.

Configuração das DesiredCapabilities no pacote core (ex: deviceName, platformName, appPackage).
