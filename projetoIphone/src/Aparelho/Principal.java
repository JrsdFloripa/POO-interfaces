package Aparelho;

import Aplication.Navegador.SafariBrowser;
import Aplication.SistemaOperacional.SistemaOperacional;

public class Principal {
	public static void main(String[] args) {
		
		SafariBrowser sfrb = new SafariBrowser();
		sfrb.acessarWeb();
		sfrb.atualizarPagina();
		sfrb.novaAba();
		
		SistemaOperacional IOS = new SistemaOperacional();
		IOS.acessarWeb();
		IOS.novaAba();
		IOS.atender();
		IOS.ligar();
		IOS.reproduzir();
		IOS.pausar();
	}

}
