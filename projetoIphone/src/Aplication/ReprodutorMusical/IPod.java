package Aplication.ReprodutorMusical;
public class IPod implements ReprodutorMusical{

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo midia! ");
	}

	@Override
	public void pausar() {
		System.out.println("Midia pausada! ");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Abrir lista de reprodução! ");
		
	}

}
