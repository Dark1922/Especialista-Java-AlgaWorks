package algaworks.OrientacaoObjeto.Aula03;

public class Carro {

    private String fabricante;
    private String modelo;
    private String cor;
    private int anoFabricacao;

    Proprietario proprietario;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Carro{" +
            "fabricante='" + fabricante + '\'' +
            ", modelo='" + modelo + '\'' +
            ", cor='" + cor + '\'' +
            ", anoFabricacao=" + anoFabricacao +
            '}';
    }
}
