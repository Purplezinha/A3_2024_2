package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CadastroBaseFisica extends BasePage {
    
    @FindBy(id = "Adicionar")
    private WebElement btnAdicionar;
    @FindBy(id = "Editar")
    private WebElement btnEditar;
    @FindBy(id = "Exibir")
    private WebElement btnExibir;
    @FindBy(id = "Excluir")
    private WebElement btnExcluir;
    @FindBy(id = "idBase")
    private WebElement txIdBase;
    @FindBy(id = "ExcluirBase")
    private WebElement btnExcluirBase;


    public CadastroBaseFisica clicarAdicionar() {
        btnAdicionar.click();
        return this;
    }
    public CadastroBaseFisica clicarEditar() {
        btnEditar.click();
        return this;
    }
    public CadastroBaseFisica clicarExibir() {
        btnExibir.click();
        return this;
    }
    public CadastroBaseFisica clicarExcluir() {
        btnExcluir.click();
        return this;
    }

    public CadastroBaseFisica informarIdBase (String idBase){
        txIdBase.sendKeys(idBase);
        return this;
    }

    public CadastroBaseFisica clicarExcluirBase() {
        btnExcluirBase.click();
        return this;
    }


public CadastroBaseFisica(WebDriver driver){
        super(driver);
    }
}
