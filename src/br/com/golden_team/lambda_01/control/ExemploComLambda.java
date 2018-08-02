package br.com.golden_team.lambda_01.control;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.golden_team.lambda_01.model.JavaNinja;

public class ExemploComLambda {

	public static void main(String[] args) {

		List<JavaNinja> monstrosFofos = new ArrayList<JavaNinja>();

		// Starting monstros por ordem de chegada ;)
		JavaNinja JavaNinja_01 = JavaNinja.criarNovoMonstroFofoDaProgramacao("Carlos", "Masculino", 1, 22, true);
		JavaNinja JavaNinja_02 = JavaNinja.criarNovoMonstroFofoDaProgramacao("Gadelha", "Masculino", 12, 14, true);
		JavaNinja JavaNinja_03 = JavaNinja.criarNovoMonstroFofoDaProgramacao("Fabricio", "Masculino", 1, 26, true);
		JavaNinja JavaNinja_04 = JavaNinja.criarNovoMonstroFofoDaProgramacao("Pedro", "Masculino", 5, 7, true);
		JavaNinja JavaNinja_05 = JavaNinja.criarNovoMonstroFofoDaProgramacao("Caio", "Masculino", 7, 14, true);
		JavaNinja JavaNinja_06 = JavaNinja.criarNovaMonstraFofaDaProgramacao("Claudineia", "Feminino", 8, 10, true);
		JavaNinja JavaNinja_07 = JavaNinja.criarNovoMonstroFofoDaProgramacao("Ahmed", "Masculino", 10, 19, true);

		monstrosFofos.add(JavaNinja_01);
		monstrosFofos.add(JavaNinja_02);
		monstrosFofos.add(JavaNinja_03);
		monstrosFofos.add(JavaNinja_04);
		monstrosFofos.add(JavaNinja_05);
		monstrosFofos.add(JavaNinja_06);
		monstrosFofos.add(JavaNinja_07);

		printarGaleraComLambda(monstrosFofos, m -> m.getMesAniversario() <= 6); //Todos que fazem aniversário até Junho
		printarGaleraComLambda(monstrosFofos, m -> m.getMesAniversario() > 6); //Todos que fazem aniversário depois de Junho
		
		printarGaleraComLambda(monstrosFofos, m -> m.getSexo().startsWith("F")); //Todas as meninas (primeiro as damas!)
		printarGaleraComLambda(monstrosFofos, m -> m.getSexo().startsWith("M")); //Todas os meninos
		
		printarGaleraComLambda(monstrosFofos, m -> m.getDiaAniversario()%2 == 0); //Todos com aniversário em dia par
		printarGaleraComLambda(monstrosFofos, m -> m.getDiaAniversario()%2 != 0); //Todos com aniversário em dia ímpar

		printarGaleraComLambda(monstrosFofos, m -> m.getNome().length() <=6); //Todos com nomes até 6 caracteres
		printarGaleraComLambda(monstrosFofos, m -> m.getNome().length() >6); //Todos com nomes com mais de 6 caracteres
		
		printarGaleraComLambda(monstrosFofos, m -> m.isFuturoMonstroSagradoDoJava()); //Todos que serão monstros sagrados em Java

		
		System.out.println("\n====================================================\n");
		
		//Nova sessão -> Mesma coisa, mas com títulos!
		System.out.println("Mesma coisa, mas com títulos!");
///		print("Lista de animais que pulam: ", animals, a -> a.canHop());
		

		printarGaleraComLambdaComTitulo("Lista com todos que fazem aniversário até Junho", monstrosFofos, m -> m.getMesAniversario() <= 6);
		printarGaleraComLambdaComTitulo("Lista com todos que fazem aniversário depois de Junho", monstrosFofos, m -> m.getMesAniversario() > 6);

		printarGaleraComLambdaComTitulo("Lista com todas as meninas (primeiro as damas)", monstrosFofos, m -> m.getSexo().startsWith("F"));
		printarGaleraComLambdaComTitulo("Lista com todos os meninos", monstrosFofos, m -> m.getSexo().startsWith("M"));
		
		printarGaleraComLambdaComTitulo("Lista com todos que fazem aniversário em dia par", monstrosFofos, m -> m.getDiaAniversario() %2 == 0);
		printarGaleraComLambdaComTitulo("Lista com todos que fazem aniversário em dia ímpar", monstrosFofos, m -> m.getDiaAniversario() %2 != 0);
		
		printarGaleraComLambdaComTitulo("Lista de todos com nomes com até 6 caracteres", monstrosFofos, m -> m.getNome().length() <= 6);
		printarGaleraComLambdaComTitulo("Lista de todos com nomes com mais de 6 caracteres", monstrosFofos, m -> m.getNome().length() > 6);

		printarGaleraComLambdaComTitulo("Lista de todos os Monstros Sagrados em Desenvolvimento", monstrosFofos, m -> m.isFuturoMonstroSagradoDoJava());
		
	}

	private static void printarGaleraComLambda(List<JavaNinja> monstrosFofos, Predicate<JavaNinja> checker) {
		for (JavaNinja monstroFofo : monstrosFofos) {
			if (checker.test(monstroFofo)) {
				System.out.println(monstroFofo);
			}
		}
		System.out.println();
	}
	
	private static void printarGaleraComLambdaComTitulo(String tituloLista, List<JavaNinja> monstrosFofos, Predicate<JavaNinja> checker) {
		System.out.println("\n" + tituloLista + "\n");
		for (JavaNinja monstroFofo : monstrosFofos) {
			if (checker.test(monstroFofo)) {
				System.out.println(monstroFofo);
			}
		}
		System.out.println();		
	}
}
