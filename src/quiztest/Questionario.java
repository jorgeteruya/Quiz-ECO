package quiztest;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class  Questionario {
    private ArrayList<Pergunta> perguntas = new ArrayList<>();

    protected String categoria;


    public void registrarPergunta(Pergunta pergunta) {
        perguntas.add(pergunta);
    }

     public void newQuest(String pergunta, Alternativa[] alt){
            Pergunta p = new Pergunta(pergunta);
            p.registrarAlternativa(alt[0], true); //sempre primeira é a correta
            for(int i = 1; i < alt.length; i ++){
                p.registrarAlternativa(alt[i]);
            }
        this.registrarPergunta(p);        
    }
     
     public ArrayList<Pergunta> getListPergunta(){
         return this.perguntas;
     }
     
     public String getCategoria(){
         return this.categoria;
     }


}
