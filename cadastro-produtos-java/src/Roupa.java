public class Roupa extends Produto {
    private String tamanho;
    private String material;

    public Roupa(String nome, String codigo, double preco, String tamanho, String material) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Material: " + material);
        System.out.println("-----------------------");
    }
}
