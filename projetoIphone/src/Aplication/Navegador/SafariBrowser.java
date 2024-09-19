package Aplication.Navegador;

public class SafariBrowser implements Navegador{

	@Override
	public void acessarWeb(){
		System.out.println("Abrindo Web page Safari. ");
	}
	
	@Override
	public void atualizarPagina(){
		System.out.println("Atualizando Web page Safari. ");
	}

	@Override
	public void novaAba(){
		System.out.println("Abrindo nova guia Safari. ");
	}

}
