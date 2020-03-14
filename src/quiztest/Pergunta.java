/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiztest;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jteruya
 */
class Pergunta {
    private String pergunta;
    private ArrayList<Alternativa> alternativas = new ArrayList<>();
    private Alternativa correta = null;

    public Pergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void registrarAlternativa(Alternativa alternativa, boolean respostaCorreta) {
        alternativas.add(alternativa);
        if(respostaCorreta) {
            this.correta = alternativa;
        }
    }

    public void registrarAlternativa(Alternativa alternativa) {
        registrarAlternativa(alternativa, false);
    }
    
    public String getPergunta(){
        return this.pergunta;
    }

    public ArrayList<Alternativa> getListaAlternativas() {
        ArrayList<Alternativa> lista = new ArrayList<>(alternativas);
        Collections.shuffle(lista);

        return lista;
    }

    public boolean respostaCorreta(Alternativa alternativa) {
        if(alternativa == null) throw new IllegalArgumentException();

        return alternativa.equals(correta);
    }
    
   
}
