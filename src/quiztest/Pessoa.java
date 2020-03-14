package quiztest;
public class Pessoa {

    private String nome;
    private int pontos = 120;
    
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
   
    public int getPontos() {
        return pontos;
    }
   
    public int menosPontos() {
        pontos -= 10;
        return pontos;
    }
   
   
    
}
