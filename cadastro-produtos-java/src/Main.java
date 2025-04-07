import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Produto> listaProduto = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            menu();
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    adicionar();
                    break;

                case 2:
                    editar();
                    break;

                case 3:
                    excluir();
                    break;

                case 4:
                    listar();
                    break;

                default:
                    System.out.println("Saindo ...");
                    break;
            }
        } while ( opcao != 5);
    }

    public static void menu(){
        System.out.println("*** Cadastro de Produtos ***");
        System.out.println("1- Adicionar");
        System.out.println("2- Editar");
        System.out.println("3- Excluir");
        System.out.println("4- Listar");
        System.out.println("5- Sair");
        System.out.println(("\nEscolha a opção: "));
    }

    public static void adicionar() {
        System.out.println("1- Eletronico");
        System.out.println("2- Roupa");
        System.out.println("3- Alimento");
        System.out.println("Qual produto deseja adicionar: ");
        int escolha = sc.nextInt();

        sc.nextLine();

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Código: ");
        String codigo = sc.nextLine();
        System.out.println("Preço: ");
        Double preco = sc.nextDouble();

        sc.nextLine();

        switch (escolha) {
            case 1:
                System.out.println("Marca: ");
                String marca = sc.nextLine();
                System.out.println("Garantia: ");
                int garantia = sc.nextInt();

                Eletronico e1 = new Eletronico(nome, codigo, preco, marca, garantia);
                listaProduto.add(e1);
                System.out.println("Eletronico adicionado.");
                break;

            case 2:
                System.out.println("Tamanho: ");
                String tamanho = sc.nextLine();
                System.out.println("Material: ");
                String material = sc.nextLine();

                Roupa r1 = new Roupa(nome, codigo, preco, tamanho , material);
                listaProduto.add(r1);
                System.out.println("Roupa adicionada.");
                break;

            case 3:
                System.out.println("Data de validade: ");
                String datavalid = sc.nextLine();
                System.out.println("Categoria: ");
                String categoria = sc.nextLine();

                Alimento a1 = new Alimento(nome, codigo, preco, datavalid, categoria);
                listaProduto.add(a1);
                System.out.println("Alimento adicionado.");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    public static void editar() {
        System.out.println("1- Eletronico");
        System.out.println("2- Roupa");
        System.out.println("3- Alimento");
        System.out.println("Qual produto deseja editar: ");
        int escolha = sc.nextInt();

        sc.nextLine();

        System.out.println("Informe o código do produto que deseje editar: ");
        String codigo = sc.nextLine();

        boolean produtoEncontrado = false;

        for ( Produto p : listaProduto)
            if(p.getCodigo().equals(codigo)) {
                produtoEncontrado = true;

                switch (escolha) {
                    case 1:
                        if (p instanceof Eletronico e1) {
                            System.out.println("Novo nome: ");
                            String novoNome = sc.nextLine();
                            System.out.println("Novo preço: ");
                            Double novoPreco = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Nova marca: ");
                            String novaMarca = sc.nextLine();
                            System.out.println("Nova garantia: ");
                            int novaGarantia = sc.nextInt();

                            e1.setNome(novoNome);
                            e1.setPreco(novoPreco);
                            e1.setMarca(novaMarca);
                            e1.setGarantia(novaGarantia);

                            System.out.println("Produto alterado.");
                        }
                        break;

                    case 2:
                        if (p instanceof Roupa r1) {
                            System.out.println("Novo nome: ");
                            String novoNome = sc.nextLine();
                            System.out.println("Novo preço: ");
                            Double novoPreco = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Novo tamanho: ");
                            String novoTamanho = sc.nextLine();
                            System.out.println("Novo material: ");
                            String novoMaterial = sc.nextLine();

                            r1.setNome(novoNome);
                            r1.setPreco(novoPreco);
                            r1.setTamanho(novoTamanho);
                            r1.setMaterial(novoMaterial);

                            System.out.println("Produto alterado.");

                        }
                        break;

                    case 3:
                        if (p instanceof Alimento a1) {
                            System.out.println("Novo nome: ");
                            String novoNome = sc.nextLine();
                            System.out.println("Novo preço: ");
                            Double novoPreco = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Nova data de validade: ");
                            String novaDatavalid = sc.nextLine();
                            System.out.println("Nova categoria: ");
                            String novaCategoria = sc.nextLine();

                            a1.setNome(novoNome);
                            a1.setPreco(novoPreco);
                            a1.setDataValidade(novaDatavalid);
                            a1.setCategoria(novaCategoria);

                            System.out.println("Produto alterado.");
                        }
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                break;
        }
        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado");
        }
    }

    public static void excluir () {
        String codigo = sc.nextLine();
        System.out.println("Informe o código do produto que deseje excluir: ");
        codigo = sc.nextLine();

        boolean produtoEncontrado = false;

        for (Produto p : listaProduto) {
            if (p.getCodigo().equals(codigo)) {
                listaProduto.remove(p);
                produtoEncontrado = true;
                System.out.println("Produto excluído.");
                break;
            }
        }
        if (!produtoEncontrado) {
            System.out.println("Código não encontrado");
        }
    }

    public static void listar () {
        if (listaProduto.isEmpty()) {
            System.out.println("Nenhuma produto adicionado.");
        } else {
            for (Produto produto : listaProduto) {
                produto.exibirInformacoes();
            }
        }
    }
}