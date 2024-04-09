package controle;

import entidade.Viagem;
import interfaces.JanelaCadastroViagens;

public class ControladorCadastroViagens {
    public ControladorCadastroViagens() {
        new JanelaCadastroViagens(this).setVisible(true);
    }

    public String inserirViagem(Viagem viagem) {
        if (!Viagem.existeViagemMesmosAtributos(viagem)) {
            return Viagem.inserirViagem(viagem);
        } else {
            return "Já existe uma viagem com os mesmos atributos";
        }
    }
   

    public String alterarViagem(Viagem viagem) {
        Viagem viagem1 = Viagem.buscarViagem(viagem.getSequencial());
        if (viagem1 != null) {
            return Viagem.alterarViagem(viagem);
        } else {
            return "Viagem não encontrada";
        }
    }
    public String removerViagem(int sequencial) {
        Viagem viagem1 = Viagem.buscarViagem(sequencial);
        if (viagem1 != null) {
            return Viagem.removerViagem(viagem1);
        } else {
            return "Viagem não cadastrada";
        }
    }
}
