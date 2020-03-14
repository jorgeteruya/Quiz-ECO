/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiztest;

/**
 *
 * @author jteruya
 */
public class Alternativa {
    private String mensagem;
    private String justificativa;

    public Alternativa(String mensagem, String justificativa) {
        this.mensagem = mensagem;
        this.justificativa = justificativa;
    }

    Alternativa(String imagem_1, String string, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getMensagem(){
        return this.mensagem;
    }
    
    public String getJustificativa(){
        return this.justificativa;
    }
}
