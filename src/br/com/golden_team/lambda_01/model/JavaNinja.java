package br.com.golden_team.lambda_01.model;

public class JavaNinja {
	
	String nome;
	String sexo;
	Integer mesAniversario;
	Integer diaAniversario;
	boolean futuroMonstroSagradoDoJava;
	
	private JavaNinja(String nome, String sexo, Integer mesAniversario, 
			Integer diaAniversario, boolean futuroMonstroSagradoDoJava) {
		this.nome = nome;
		this.sexo = sexo;
		this.mesAniversario = mesAniversario;
		this.diaAniversario = diaAniversario;
		this.futuroMonstroSagradoDoJava = futuroMonstroSagradoDoJava;
	}
	
	public static JavaNinja criarNovoMonstroFofoDaProgramacao(String nome, String sexo, Integer mesAniversario, 
			Integer diaAniversario, boolean futuroMonstroSagradoDoJava) {
		return new JavaNinja(nome, sexo, mesAniversario, diaAniversario, futuroMonstroSagradoDoJava);
	}
	
	public static JavaNinja criarNovaMonstraFofaDaProgramacao(String nome, String sexo, Integer mesAniversario, 
			Integer diaAniversario, boolean futuroMonstroSagradoDoJava) {
		return criarNovoMonstroFofoDaProgramacao(nome, sexo, mesAniversario, diaAniversario, futuroMonstroSagradoDoJava);
	}
	
	@Override
	public String toString() {
		return "Nome do Ninja = " + nome + " ";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getMesAniversario() {
		return mesAniversario;
	}
	public void setMesAniversario(Integer mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	public Integer getDiaAniversario() {
		return diaAniversario;
	}
	public void setDiaAniversario(Integer diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	public boolean isFuturoMonstroSagradoDoJava() {
		return futuroMonstroSagradoDoJava;
	}
	public void setFuturoMonstroSagradoDoJava(boolean futuroMonstroSagradoDoJava) {
		this.futuroMonstroSagradoDoJava = futuroMonstroSagradoDoJava;
	}

	
}
