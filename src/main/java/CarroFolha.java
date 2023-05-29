public class CarroFolha implements ComponenteCarro {
    private String nome;

    public CarroFolha(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do carro: " + nome);
    }
}
