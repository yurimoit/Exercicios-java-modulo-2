public class Eletronico {
    private Long numeroSerie;
    private String descricaoProduto;

    private String fabricante;

    private String modelo;

    private int ano;

    @Override
    public String toString() {
        return "Eletronico{" +"numeroSerie=" + numeroSerie + ", descricaoProduto='" + descricaoProduto + '\'' + ", fabricante='" + fabricante + '\'' + ", modelo='" + modelo + '\'' + ", ano=" + ano + '}';
    }

    public Eletronico(Long numeroSerie, String descricaoProduto, String fabricante, String modelo, int ano) {
        this.numeroSerie = numeroSerie;
        this.descricaoProduto=descricaoProduto;
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.ano=ano;
    }

    public Eletronico() {
    }

    public void dadosEletronico(){
        System.out.printf("Numero serie: %d \n",this.numeroSerie);
        System.out.printf("Descrição do produto: %s \n",this.descricaoProduto);
        System.out.printf("Fabriacnte %s \n",this.fabricante);
        System.out.printf("Modelo: %s \n",this.modelo);
        System.out.printf("Ano de fabricaçaõ:  %d \n",this.ano);
    }

    public Long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
