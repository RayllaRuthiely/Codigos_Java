package aula5b;

public class ControleRemoto implements Controlador{
	// atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	//Métodos especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	private int getVolume() {
		return volume;
	}
	
	private boolean getLigado() {
		return ligado;
	}
	
	private boolean getTocando() {
		return tocando;
	}
	
	private void setVolume(int v) {
		this.volume = v;
	}
	
	private void setLigado(boolean l) {
		this.ligado = l;
	}
	
	private void setTocando(boolean t) {
		this.tocando = t;
	}

	
	//Métodos Abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("--- MENU ---");
		System.out.println("ESTAR LIGADO?: " + this.getLigado());
		System.out.println("ESTA TOCANDO?: " + this.getTocando());
		System.out.print("VOLUME: " + this.getVolume());
		for(int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("FECHANDO MENU...");
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 1);
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}
	
}
