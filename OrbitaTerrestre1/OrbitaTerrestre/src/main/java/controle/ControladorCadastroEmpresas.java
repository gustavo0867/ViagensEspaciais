package controle;

import entidade.Empresa;
import interfaces.JanelaCadastroEmpresas;

public class ControladorCadastroEmpresas {

    public ControladorCadastroEmpresas() {
        new JanelaCadastroEmpresas(this).setVisible(true);
    }

    public String inserirEmpresa(Empresa empresa) {
        if (!Empresa.existeEmpresasMesmosAtributos(empresa)) {
            return Empresa.inserirEmpresa(empresa);
        } else {
            return "Já existe uma Empresa com os mesmos atributos";
        }
    }

    public String alterarEmpresa(Empresa empresa) {
        Empresa empresaExistente = Empresa.buscarEmpresa(empresa.getCnpj());
        if (empresaExistente != null) {
            return Empresa.alterarEmpresa(empresa);
        } else {
            return "CNPJ da Empresa não cadastrado";
        }
    }

    public String removerEmpresa(String cnpj) {
        Empresa empresaExistente = Empresa.buscarEmpresa(cnpj);
        if (empresaExistente != null) {
            return Empresa.removerEmpresa(cnpj);
        } else {
            return "CNPJ da Empresa não cadastrado";
        }
    }

   
}
