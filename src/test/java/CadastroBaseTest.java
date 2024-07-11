import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CadastroBaseFisica;

public class CadastroBaseTest extends BaseTest {
    @Test
    public void validarCadastro() {
        CadastroBaseTest page = new CadastroBaseTest(getDriver());

        String resultadoFinal = page.clicarExcluir()
                .informarIdBase("01")
                .clicarExcluirBase();
        try{
            getDriver().wait();
            Assert.assertTrue(resultadoFinal.contains("Base excluída com sucesso!"));
        }
        catch (Exception e){
            System.out.println(e.toString());
        }


    }

}
