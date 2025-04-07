public class Eletronico extends Produto {
    private String marca;
    private int garantia;

    public Eletronico(String nome, String codigo, double preco, String marca, int garantia) {
        super(nome, codigo, preco);
        this.marca = marca;
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Marca: " + marca);
        System.out.println("Garantia: " + garantia + " meses");
        System.out.println("-----------------------");
    }
}
