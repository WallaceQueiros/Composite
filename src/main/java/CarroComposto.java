import java.util.ArrayList;
import java.util.List;

class CarroComposto implements ComponenteCarro {
    private String nome;
    private List<ComponenteCarro> componentes = new ArrayList<>();

    public CarroComposto(String nome) {
        this.nome = nome;
    }

    public void adicionarComponente(ComponenteCarro componente) {
        componentes.add(componente);
    }

    public void removerComponente(ComponenteCarro componente) {
        componentes.remove(componente);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do carro: " + nome);
        System.out.println("Componentes:");

        for (ComponenteCarro componente : componentes) {
            componente.exibirInformacoes();
        }
    }
}