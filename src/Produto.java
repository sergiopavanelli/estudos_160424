class Produto {
    private int id;
    private String nome;
    private double preco;
    private static int ultimo_id = 0;

    // Construtor que recebe nome e preço do produto
    public Produto(String nome, double preco) {
        this.id = ++ultimo_id;
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor sem parâmetros
    public Produto() {
        this.id = ++ultimo_id;
        this.nome = "Nome não informado";
        this.preco = 0.0;
    }

    // Método para exibir as informações do produto
    public void exibe() {
        System.out.println("Produto:");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

    // Método para reajustar o preço do produto
    public void reajustaPreco(double percentual) {
        preco += preco * (percentual / 100);
    }

    // Método getter para o atributo id
    public int getId() {
        return id;
    }

    // Métodos getters e setters para os atributos nome e preço
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }
    }
}