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
public final class QuestTerra extends Questionario{
    
    private String p1, p2, p3;
    private Alternativa[] a1, a2, a3;
    
    public QuestTerra() {

       this.categoria = "terra";
             
        getPerguntas();
        newQuest(p1, a1);
        newQuest(p2, a2);
        newQuest(p3, a3);  
    }
    
    public void getPerguntas(){      //TERRA
        
        //Pergunta 1 Terra
        p1 = ("Qual dos materiais abaixo demora mais para decompor-se?");
        Alternativa[] a1 = {new Alternativa("Garrafa de vidro",     "CERTO - Segundo a UNICEF aproximadamente 4 mil anos"), 
                            new Alternativa("Sacola plástica",      "ERRRADO - Até 450 anos"),
                            new Alternativa("Latinha de alumínio",  "ERRRADO - Aproximadamente 200 anos")};
        this.a1 = a1;
        //Pergunta 2 Terra
        p2 = ("Qual o pais que mais reciclam?");
        Alternativa[] a2 = {new Alternativa("Alemanha", "CERTO - Alemanha atualmente considerado o país que mais recicla no mundo"),
                            new Alternativa("Suíça",    "ERRADO - Suíça o recicla cerca de 51% dos resíduos gerados"),
                            new Alternativa("Suécia",   "ERRADO -Suécia tem uma das maiores taxas do bloco: 11% entre 2001 e 2010. E chegou a 49%. "
                                                                 + "\n Em 2018 com praticamente todo o lixo reciclado, chegou a ponto de precisa importar "
                                                                 + "\n lixo para que a produção de energia a partir dele para que não ficasse paralisada.")};        
        this.a2 = a2;
        //Pergunta 3 Terra
        p3 = ("Complete a frase “Brasil é o ...”?");
        Alternativa[] a3 = {new Alternativa("Quarto país que mais gera lixo","CERTO - Em 2019 segundo a WWF (World Wide Fund for Nature) "
                                                                                        + "  \n o Brasil é o quarto país que mais polui ficando atrás "
                                                                                        + "  \n apenas de (1º)Estados Unidos, (2º) China, (3º)Índia. "),
                            new Alternativa("Décimo país que mais recicla",  "ERRRADO"),
                            new Alternativa("País que mais polui",           "ERRRADO")};
        this.a3 = a3;
    }
    
}
