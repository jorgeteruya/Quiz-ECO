/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiztest;

/**
 *
 * @author jorge
 */
public class QuestFogo extends Questionario{
    
    //private Questionario fogo;
    private String p1, p2, p3;
    private Alternativa a1[], a2[], a3[];
    
    public QuestFogo() {

       this.categoria = "fogo";
       
        //fogo = new QuestFogo();
        getPerguntas();
        newQuest(p1, a1);
        newQuest(p2, a2);
        newQuest(p3, a3);  
    }
    
        public void getPerguntas(){        
        //Pergunta 1 Fogo
        p1 = ("Além do desmatamento, qual é outro dano massivo causado pelas queimadas?");
        Alternativa a = new Alternativa("Aumento do efeito estufa","CERTO - Durante a queima da vegetação uma grande quantidade de Dióxido"
                                                        + "\n de Carbono (CO2) é liberado na atmosfera");
        
         Alternativa a1[] = {new Alternativa("Aumento do efeito estufa","CERTO - Durante a queima da vegetação uma grande quantidade de Dióxido"
                                                        + "\n de Carbono (CO2) é liberado na atmosfera"),
                            new Alternativa("Poluição dos rios ","ERRADO - As queimadas não estão diretamente relacionadas com"
                                                        + "\n a poluição dos rios propriamente dita."),
                            new Alternativa("Diminuição da área útil para plantio","ERRADO - A técnica da queimada é justamente utilizada para limpar grandes"
                                                        + "\n terrenos visando a formação de plantações e criação de gado.")};
         this.a1 = a1;
        //Pergunta 2 Fogo
        p2 = ("Mesmo sendo uma técnica considerada polêmica entre muitos, por que a queimada"
                            + "\n continua sendo utilizada? ");
        Alternativa[] a2 = {new Alternativa("É uma técnica rápida e barata ","CERTO"), 
                            new Alternativa("É a melhor opção para a “limpeza” de grandes terrenos florestais",
                                                    "ERRADO - Existem muitas outras técnicas para a"
                                                        + "\n derrubada de grandes vegetações, "
                                                        + "\n porém são muito mais demoradas e com"
                                                        + "\n um custo maior.”"),
                            new Alternativa("É a causa menos agressiva possível","ERRADO - Muito pelo contrário, na verdade as queimadas são a "
                                                        + "\n técnica mais agressiva e prejudicial existente.")};  
        this.a2 = a2;
        //Pergunta 3 Fogo
        p3 = "Nós sabemos que o foco principal das"
                        + "\n queimadas é a retirada de grandes vegetações, qual outro"
                        + "\n objetivo proveniente dessa técnica?";
        
        Alternativa[] a3 = { new Alternativa("","CERTO - O carvão vegetal é"
                                                        + "\n obtido a partir da queima ou carbonização da madeira, as queimadas são"
                                                        + "\n um jeito rápido de conseguir essa substância."), 
                            new Alternativa("","ERRADO - Apesar de as cinzas das"
                                                        + "\n árvores fertilizarem o solo, o dano causado ao solo por essa técnica é muito"
                                                        + "\n mais significativo.”"),
                            new Alternativa("","ERRADO - O contrário acontece, na verdade as queimadas diminuem a"
                                                        + "\n fauna e a flora, e ainda destrói o habitat natural de muitas espécies.")};
        this.a3 = a3;
    }

      
    
}
