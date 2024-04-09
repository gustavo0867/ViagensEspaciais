/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import entidade.Agendamento;
import interfaces.JanelaCadastroAgendamentos;

/**
 *
 * @author gusta
 */
public class ControladorCadastroAgendamentos {
    public ControladorCadastroAgendamentos(){
        new JanelaCadastroAgendamentos(this).setVisible(true);
    }
    public String inserirAgendamento (Agendamento agendamento) {
        if(!Agendamento.existeAgendamento(agendamento.getCliente().getCpf(), agendamento.getEmpresa().getCnpj(), agendamento.getViagem().getSequencial())){
            return Agendamento.inserirAgendamento(agendamento);
        }else return "Agendamento já cadastrado";     
    }
    
    public String alterarAgendamento (Agendamento agendamento_informado) {
        Agendamento agendamento_cadastrado = Agendamento.buscarAgendamento(agendamento_informado.getSequencial());
        if((agendamento_informado.getCliente().getCpf().equals(agendamento_cadastrado.getCliente().getCpf()))
            && (agendamento_informado.getEmpresa().getCnpj().equals( agendamento_cadastrado.getEmpresa().getCnpj()))
                && (agendamento_informado.getViagem().getSequencial() == agendamento_cadastrado.getViagem().getSequencial()) ){
        return Agendamento.alterarAgendamento(agendamento_informado);
        }else return "Alteração não permitida : chave do cliente e/ou serviço foram alteradas";  
    }
    
    public String removerAgendamento (int sequencial) {
        if(Agendamento.existeAgendamento(sequencial)) 
            return Agendamento.removerAgendamento(sequencial);
        else return "Agendamento já cadastradas";     
    }
}
