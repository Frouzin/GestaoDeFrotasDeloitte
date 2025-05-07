//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Veiculo veiculo = new Veiculo("VW","Gol", 2010);
        Motorista motorista = new Motorista("Matheus","10");

        frota.adicionarVeiculo(veiculo);
        frota.adicionarMotorista(motorista);

        motorista.atribuir_veiculo(veiculo);


        frota.listarFrota();
    }
}