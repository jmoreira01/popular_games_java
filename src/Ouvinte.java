public class Ouvinte implements Comparable<Ouvinte>{
    private String nome;
    private String localidade;
    private int estimativa;
    private int ranking;

    private int jogos;


    //constructores


    public Ouvinte(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
        this.estimativa = 200;
        this.ranking =0;
        this.jogos =0;
    }




    public Ouvinte() {
    }


    //encapsulamento

    public String getNome() {
        return nome;
    }

    public void setNome(String novonome) {
        this.nome = nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String novolocal) {
        this.localidade = localidade;
    }

    public int getEstimativa() {
        return estimativa;
    }

    public void setEstimativa(int estimativa) {
        this.estimativa = estimativa;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getJogos() {
        return jogos;
    }

    public void setJogos(int jogos) {
        this.jogos= ranking;
    }


    @Override
    public String toString() {
        return "A pessoa "+nome+" é de "+localidade;
    }

    @Override
    public int compareTo(Ouvinte ouvinte) {
        return this.estimativa - ouvinte.estimativa;
    }
}
