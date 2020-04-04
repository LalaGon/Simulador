package futebol;

public class Time {
	private String nome;
	private int qtdVitorias;
	private int qtdDerrotas;
	private int qtdEmpates;
	private int qtdPontos;
	
	void iniciar() {
		qtdVitorias = 0;
		qtdDerrotas = 0;
		qtdEmpates = 0;
		qtdPontos = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdVitorias() {
		return qtdVitorias;
	}

	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}

	public int getQtdDerrotas() {
		return qtdDerrotas;
	}

	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}

	public int getQtdEmpates() {
		return qtdEmpates;
	}

	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = qtdEmpates;
	}

	public int getQtdPontos() {
		return qtdPontos;
	}

	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}
	
	public void listar() {
		System.out.println("Vitorias: " +qtdVitorias);
		System.out.println("Derrotas: " +qtdDerrotas);
		System.out.println("Empates: " +qtdEmpates);
		System.out.println("Pontos: " +qtdPontos);
	}

}
