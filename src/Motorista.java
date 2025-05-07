public class Motorista {
    String nome;
    String cnh;
    Veiculo veiculoAtual;

    public Motorista(String nome, String cnh){
        this.nome = nome;
        this.cnh = cnh;
        this.veiculoAtual = null;
    }

    public void atribuir_veiculo(Veiculo veiculo){
        this.veiculoAtual = veiculo;
    }

    public void remover_veiculo(){
        this.veiculoAtual = null;
    }

    public void dirigir() {
        if (veiculoAtual != null) {
            System.out.println(nome + " está dirigindo o " + veiculoAtual.getModelo());
        } else {
            System.out.println(nome + "não está dirigindo nenhum veiculo");
        }
    }
}


