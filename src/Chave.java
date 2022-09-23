import java.util.Arrays;

public class Chave
{
    private int [] numeros = new int[5];
    private int [] estrelas = new int[2];


    //constructores

    //vazio
    public Chave() {
        int [] numeros = new int[5];
        int [] estrelas = new int[2];
    }

    //completo
    public Chave(int[] numeros, int[] estrelas) {
        this.numeros = numeros;
        this.estrelas = estrelas;
    }


    //escrita das chaves

    @Override
    public String toString() {
        return "Chave: Números - " + Arrays.toString(numeros) + " // Estrelas - " + Arrays.toString(estrelas) ;
    }
    //System.out.println("Chave: Números- "+Arrays.toString(sorteionum)+ " // Estrelas- "+Arrays.toString(sorteioest));

    //encapsulamento

    public int[] getNumeros(int i) {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getEstrelas(int i) {
        return estrelas;
    }

    public void setEstrelas(int[] estrelas) {
        this.estrelas = estrelas;
    }

}
