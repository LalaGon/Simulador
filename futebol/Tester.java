package futebol;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//objetos ( times )
				Time local = new Time();
				Time visitante = new Time();
				
				Partida P = new Partida();
				
				P.setTimeLocal(local);
				P.setTimeVisitante(visitante);
				
				P.start();
				
				
				Scanner input = new Scanner(System.in);
				System.out.println("Entre com o time local: ");
				String time1 = input.nextLine();
				
				local.setNome(time1);
				
				Scanner input2 = new Scanner(System.in);
				System.out.println("Entre com o time visitante: ");
				String time2 = input2.nextLine();
				
				visitante.setNome(time2);
				
				System.out.println("\n");
				local.listar();
				System.out.println("\n");
				visitante.listar();
				System.out.println("\n");
				
				Scanner input32 = new Scanner(System.in);
				System.out.println("Digite algo para iniciar: ");
				String ini = input32.nextLine();
				
				
				System.out.println("\n");
				System.out.println("<<< Primeira Partida >>>");
				P.iniciarPartida();
				P.mostrarResultado();
				P.finalizarPartida();
				
				System.out.println("\n");
				local.listar();
				System.out.println("\n");
				visitante.listar();
				System.out.println("\n");
				local.iniciar();
				visitante.iniciar();

				
				Scanner input1 = new Scanner(System.in);
				System.out.println("Entre com o time local: ");
				String time11 = input1.nextLine();
				
				local.setNome(time11);
				
				Scanner input21 = new Scanner(System.in);
				System.out.println("Entre com o time visitante: ");
				String time21 = input21.nextLine();
				
				visitante.setNome(time21);
				
				System.out.println("<<< Segunda Partida >>>");
				P.iniciarPartida();
				P.mostrarResultado();
				P.finalizarPartida();
				
				System.out.println("\n");
				local.listar();
				System.out.println("\n");
				visitante.listar();
				System.out.println("\n");
				local.iniciar();
				visitante.iniciar();

				
				Scanner input3 = new Scanner(System.in);
				System.out.println("Entre com o time local: ");
				String time3 = input3.nextLine();
				
				local.setNome(time3);
				
				Scanner input4 = new Scanner(System.in);
				System.out.println("Entre com o time visitante: ");
				String time4 = input4.nextLine();
				
				visitante.setNome(time4);
				
				System.out.println("<<< Terceira Partida >>>");
				P.iniciarPartida();
				P.mostrarResultado();
				P.finalizarPartida();
				
				System.out.println("\n");
				local.listar();
				System.out.println("\n");
				visitante.listar();
				System.out.println("\n");
				
				P.finish();
				
			}

}


