package quiztest;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class QuizTest {

    public static void main(String[] args) {
        int pontostot =         0;
        int perguntatot =       0;
        boolean playing =       true;
        boolean respValida =    false;
        String[] elementos = {"Terra", "Agua", "Fogo", "Ar", "Sair"}; //valores dos botoes
        String finalDoJogo;

        //insert nome 
        Pessoa jogador =new Pessoa();
        jogador.setNome(JOptionPane.showInputDialog("Insira Seu nome: "));

        //escolhe categoria        
        while (playing) {
            int op = JOptionPane.showOptionDialog(null, "Escolha seu Elemento para Jogar", "Quiz",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, elementos, elementos[0]);
            int pontos =    0; //reset por categoria
            int pergunta =  0;
            Questionario q = new Questionario();
            switch (op) {
                case 0:
                    //pergunta - TERRA
                    q = new QuestTerra();
                    break;
                case 1:
                    //pergunta - AGUA
                    q = new QuestAgua();
                    break;
                case 2:
                    //pergunta - FOGO
                    q = new QuestFogo();
                    break;
                case 3:
                    //pergunta - AR
                    q = new QuestAr();
                    break;
                default:
                    playing = false;    //para sair do jogo
                    break;
            }
            if (playing) {
                ArrayList<Pergunta> perguntas = q.getListPergunta();    //arraylist com as perguntas da categoria escolhida
                Random rnd = new Random();
                for (int i = 0; i < perguntas.size(); i++) { //para cada pergunta
                    pergunta++;
                    ArrayList<Alternativa> alternativas = perguntas.get(i).getListaAlternativas();  //pega todas as alternativas
                    String showAlternativas = "";   //string com as alternativas a ser montada
                    String showResposta = "";       //string com as respsotas a ser montada
                    ArrayList<Alternativa> listaAlt = new ArrayList<>();    //mando as alternativas na ordem em que são mostradas
                    int totalsize = alternativas.size();    //total de alternativas
                    for (int j = 0 ; j < totalsize ; j++) {      //para cada alternativa
                        int rand = rnd.nextInt(alternativas.size());    
                        Alternativa a = alternativas.get(rand);     //pega um elemento qualquer
                        listaAlt.add(a);    //adiciona a lista com as alternativas em ordem mostrada
                        showAlternativas += "\n" + ((char) (j + 97)) + ") " + a.getMensagem();  //monta a string com o valor da alternativa 
                        //transforma valor ASCII em char 97 = a, 98 = b , ...
                        showResposta += ((char) (j + 97)) + ") " + a.getJustificativa() + "\n"; //monta a string com o valor da justificativa/resposta
                        alternativas.remove(a);     //remove do vetor original para não ser escolhida de novo
                    }
                    while (!respValida) {   //se não receber resposta válida, pergunta novamente
                        String resp = JOptionPane.showInputDialog(null, perguntas.get(i).getPergunta() + showAlternativas); //mostra alternativas
                        try {       //pega problema com valores fora das alternativas
                            int userResp = (int) resp.charAt(0) - 97;   //recebe resposta e passa para int que representa a posição no arraylist com as alternativas em ordem mostrada
                            boolean acertou = perguntas.get(i).respostaCorreta(listaAlt.get(userResp)); //procura valor no vetor
                            respValida = true;  //só aceita se for válido
                            if (acertou) {
                                pontos++;   //conta ponto se acertar
                            }
                        } catch (Exception e) { //valor fora das alternativas, informa resposta inválida e pergunta novamente
                            JOptionPane.showMessageDialog(null, "Resposta inválida");
                        }
                    }
                    JOptionPane.showMessageDialog(null, showResposta);      //mostra respostas
                    respValida = false;     //seta para próxima pergunta, para verificar a validade da resposta
                }
                //mensagem de score de categoria
                finalDoJogo = "Parabéns " + jogador.getNome() + "! Você acertou " + pontos + " de " + pergunta + " perguntas da categoria " + q.getCategoria() + "!";
                JOptionPane.showMessageDialog(null, finalDoJogo);
                perguntatot += pergunta;    //soma ao score total
                pontostot += pontos;        
            }
        }
        //mensagem de score total
        finalDoJogo = "Parabéns " + jogador.getNome() + "! Você acertou " + pontostot + " de " + perguntatot + " perguntas!";
        JOptionPane.showMessageDialog(null, finalDoJogo);
    }
}
