package br.utfpr.architecture.Entity;

//seguem o modelo de implementação das entidades para a implementação do orm jpa, que depois utilizará as entidades para o mapeamento no banco de dados
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AulasDoPlanoSubstituicao implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idAulaPlanoSubstituicao;
    private String dataDaAulaSubstituida;
    private String quantidadeDeAulas;

       @ManyToOne    
    private Professor professorSubstituto;


    @ManyToOne
    private Turma turma;
    
    @ManyToOne
    private SolicitacaoPlanoDeSubstituicao idPlanoDeAula;

    public AulasDoPlanoSubstituicao(String homesecundaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
}
