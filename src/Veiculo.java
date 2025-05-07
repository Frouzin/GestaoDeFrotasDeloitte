public class Veiculo {
    String marca;
    String modelo;
    int ano;
    double velocidade;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0;
    }

    public void acelerar(){
        velocidade += 10;
    }

    public void frear(){
         velocidade = Math.max(0,velocidade - 10);
    }

    public void exibirInfo(){
        System.out.println("Marca do veiculo: " + marca);
        System.out.println("Modelo do veiculo: " + modelo);
        System.out.println("Ano do veiculo: " + ano);
    }

    public String getModelo() {
        return modelo;
    }

    class Carro extends Veiculo{
        int numPortas;

        public Carro(String marca, String modelo, int ano, int numPortas){
            super(marca,modelo,ano);
            this.numPortas = numPortas;
        }

        @Override
        public void exibirInfo(){
            super.exibirInfo();
            System.out.println("Numero de Portas " +numPortas);
        }
    }
    class Caminhao extends Veiculo{
        double capacidade_carga;

        public Caminhao(String marca, String modelo, int ano, double capacidade_carga){
            super(marca, modelo, ano);
            this.capacidade_carga = capacidade_carga;
        }

        @Override
        public void exibirInfo(){
            super.exibirInfo();
            System.out.println("capacidade de carga " + capacidade_carga);
        }
    }
}
