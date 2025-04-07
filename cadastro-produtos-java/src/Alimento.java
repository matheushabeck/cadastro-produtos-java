public class Alimento extends Produto {
    private String dataValidade;
    private String categoria;

    public Alimento(String nome, String codigo, double preco, String dataValidade, String categoria) {
        super(nome, codigo, preco);
        this.dataValidade = dataValidade;
        this.categoria = categoria;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Data de validade: " + dataValidade);
        System.out.println("Categoria: " + categoria);
        System.out.println("-----------------------");
    }
}
