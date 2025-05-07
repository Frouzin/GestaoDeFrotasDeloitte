import java.util.ArrayList;

public class Frota {
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    ArrayList<Motorista> motoristas = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void adicionarMotorista(Motorista motorista){
        motoristas.add(motorista);
    }

    public void listarFrota(){
        System.out.println("Veiculos");

        for (Veiculo v : veiculos){
            v.exibirInfo();
        }
        System.out.println("Motoristas");

        for (Motorista m: motoristas){
            m.dirigir();
        }
    }
}
