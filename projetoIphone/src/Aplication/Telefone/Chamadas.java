package Aplication.Telefone;

public class Chamadas implements Telefone{

	@Override
	public void ligar() {
		System.out.println("Efetuando chamada! ");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada! ");
	}

	@Override
	public void msgDeVoz() {
		System.out.println("Gravando mensagem de voz! ");
	}

}
