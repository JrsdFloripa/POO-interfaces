package Aplication.SistemaOperacional;

import Aplication.Navegador.Navegador;
import Aplication.ReprodutorMusical.ReprodutorMusical;
import Aplication.Telefone.Telefone;


public class SistemaOperacional implements Navegador, ReprodutorMusical, Telefone {

	@Override
	public void acessarWeb() {
		System.out.println("Exibindo web page!");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Web page! ");
	}

	@Override
	public void novaAba() {
		System.out.println("Abrindo nova guia! ");
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo breaking all the rules! ");
	}

	@Override
	public void pausar() {
		System.out.println("Midia pausada, reprodutor aguardando.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Abrir lista de reprodução. ");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando para fulano! ");
	}

	@Override
	public void atender() {
		System.out.println("Recebendo ligação de fulano. ");
	}

	@Override
	public void msgDeVoz() {
		System.out.println("Gravar mensagem de voz. ");
	}

}
