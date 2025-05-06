public class Veiculo {
    String marca;
    String modelo;
    int ano;
    double velocidade;

    public double acelerar(){
        return velocidade + 10;
    }

    public double frear(){
        return velocidade - 10;
    }

    public void exibir_info(){
        System.out.println("Marca do veiculo: " + marca);
        System.out.println("Modelo do veiculo: " + modelo);
        System.out.println("Ano do veiculo: " + ano);
    }

    public class Carro extends Veiculo{
        int num_portas;
    }

    public class Caminhao extends Veiculo{
        double capacidade_carga;
    }
}
