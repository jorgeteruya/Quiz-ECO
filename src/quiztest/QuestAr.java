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
public class QuestAr extends Questionario{
    
    private String p1, p2, p3;
    private Alternativa[] a1, a2, a3;
    
    public QuestAr(){
    
        this.categoria = "ar";
        
        getPerguntas();
        newQuest(p1, a1);
        newQuest(p2, a2);
        newQuest(p3, a3);  
    }
    
    public void getPerguntas(){

        //Pergunta 1 Ar
        p1 = ("O efeito estufa é um fenômeno natural, mas é intensificado devido à crescente queima dos"
                + "\n combustíveis fósseis que representam a base da industrialização e de muitas atividades humanas." 
                + "\n As queimadas nas florestas para transformar suas áreas em plantação, criação de gado e"
                + "\n pastagens, também colaboram para o aumento do efeito estufa” segundo o texto explicativo da"
                + "\n professora Lana Magalhães, qual destes gases abaixo não intensificam o efeito estufa:");
        
        Alternativa[] a1 = { new Alternativa("Gases humanos","CERTO - Os gases humanos possuem o gás metano (CH4), que são mega prejudiciais para a nossa"
                + "\n atmosfera, porém a quantidade que exalamos é tão"
                + "\n pequena que não é considerada diretamente prejudicial."),
                            new Alternativa("Gases gerados por veículos","ERRADO - Um dos problemas mais comuns tanto em veículos grandes como pequenos é o"
                + "\n excesso de fumaça que sai do escapamento, fumaça essa que é rica em poluentes atmosféricos"
                + "\n como o Metano (CH4), Dióxido de Carbono (CO2) entre outros gases que são fortemente"
                + "\n prejudiciais a saúde humana. "),
                            new Alternativa("Indústrias ","ERRADO - Como os carros, as grandes indústrias por muitas vezes queimam combustíveis\n "
                + "fosseis, causando tanto dano quanto os carros, em certos lugares até mais, devida a quantidade\n "
                + "ser bem maior.")};
        this.a1 = a1;
        
        //Pergunta 2 Ar
        p2 = ("Qual destas sequências de veículos causa o menor impacto a nossa atmosfera?");
        
        Alternativa[] a2 = { new Alternativa("Bicicleta, metrô e patinete","CERTO - A bicicleta e o patinete são formas de locomoção que utiliza da mobilidade ativa"
                + "\n onde se usa apenas meios físicos para o deslocamento e o metrô utiliza de"
                + "\n energia elétrica para o seu funcionamento."),
                            new Alternativa("Bicicleta, Moto e patins","ERRADO - bicicleta e patins são formas de se locomover que utilizam da mobilidade ativa,"
                + "\n que é o ato de se locomover usando apenas meios físicos humanos, porém a moto utiliza"
                + "\n combustíveis fosseis."),
                            new Alternativa("Carro, Moto e Bicicleta","ERRADO - Veículos automotores atualmente, utilizam de combustíveis fosseis para"
                + "\n conseguirem força para o deslocamento e nesta lista carro e moto são veículos"
                + "\n automotores.")};        
        this.a2 = a2;
        
        //Pergunta 3 Ar
        p3 = ("A charge acima do artista Jean Galvão, exemplifica de uma forma bem dramática a"
                + "\n consequência de um dos efeitos mais comentados nos dias de hoje, efeito este que pode"
                + "\n acabar com muitas espécies polares.");
        
        Alternativa[] a3 = {new Alternativa("Efeito estufa ","CERTO - é um fenômeno natural de aquecimento térmico da Terra, essencial"
                + "\n para manter a temperatura do planeta em condições ideais para a sobrevivência dos"
                + "\n seres vivos. Sem o efeito estufa natural, a Terra seria muito fria, dificultando o"
                + "\n desenvolvimento das espécies. O problema."),
                            new Alternativa("Chuva ácida ","ERRADO - é um fenômeno provocado pela emissão de gases poluentes à"
                + "\n atmosfera que reagem com a água, tornando-a ácida."),
                            new Alternativa("Desertificação","ERRADO - é o fenômeno que corresponde ao empobrecimento e diminuição da"
                + "\n umidade em solos arenosos, localizados em regiões de clima subúmido, árido e"
                + "\n semiárido.")};
        this.a3 = a3;
    }
    
             
}
    

