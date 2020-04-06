package futebol;

import java.util.Date;
import java.util.Random;

public class Partida {
		//times ( acessando objetos )
		private Time timeVisitante;
		private Time timeLocal;
		
		private int scoreVisitante;
		private int scoreLocal;
		private Date dataPartida;
		
		public Time getTimeVisitante() {
			return timeVisitante;
		}
		public void setTimeVisitante(Time timeVisitante) {
			this.timeVisitante = timeVisitante;
		}
		public Time getTimeLocal() {
			return timeLocal;
		}
		public void setTimeLocal(Time timeLocal) {
			this.timeLocal = timeLocal;
		}
		public int getScoreVisitante() {
			return scoreVisitante;
		}
		public void setScoreVisitante(int scoreVisitante) {
			this.scoreVisitante = scoreVisitante;
		}
		public int getScoreLocal() {
			return scoreLocal;
		}
		public void setScoreLocal(int scoreLocal) {
			this.scoreLocal = scoreLocal;
		}
		public Date getDataPartida() {
			return dataPartida;
		}
		public void setDataPartida(Date dataPartida) {
			this.dataPartida = dataPartida;
		}
		
		Random random = new Random();
		
		public void iniciarPartida() {
			
			scoreLocal = random.nextInt(10);
			scoreVisitante = random.nextInt(10);
		}
		
		public void mostrarResultado() {
			
			System.out.println("\n" + timeLocal.getNome()+ " " + scoreLocal + " x " + scoreVisitante + " " + timeVisitante.getNome());
		}
		
		public void finalizarPartida() {
			
			 // Vitória do Time Local
			if(scoreLocal > scoreVisitante){
				
				timeLocal.setQtdPontos(timeLocal.getQtdPontos()+3);
				timeLocal.setQtdVitorias(timeLocal.getQtdVitorias()+1);
				timeVisitante.setQtdDerrotas(timeVisitante.getQtdDerrotas()+1);
			}
			
			//Vitória do Time Visitante
			else if(scoreVisitante > scoreLocal){ 
				
				timeVisitante.setQtdPontos(timeVisitante.getQtdPontos()+3);
				timeVisitante.setQtdVitorias(timeVisitante.getQtdVitorias()+1);
				timeLocal.setQtdDerrotas(timeLocal.getQtdDerrotas()+1);		
			}
			
			// Empate
			else if (scoreVisitante == scoreLocal) { 
				timeVisitante.setQtdPontos(timeVisitante.getQtdPontos()+1);
				timeVisitante.setQtdEmpates(timeVisitante.getQtdEmpates()+1);
				timeLocal.setQtdPontos(timeLocal.getQtdPontos()+1);
				timeLocal.setQtdEmpates(timeLocal.getQtdEmpates()+1);
		    }
			
		}
		 
		public void start() {
			System.out.println("\n");
			System.out.println("BEM VINDO AO CAMPEONATO MUNDIAL DE 2020!!!");
			System.out.println(" ");
			System.out.println(" _______________________________________________");
			System.out.println("|                        |                      |"); 
			System.out.println("|                        |                      |");
			System.out.println("|                        |                      |");
			System.out.println("|                        |                      |");
			System.out.println("|_____                   |                 _____|");
			System.out.println("|     |                  |                |     |");
			System.out.println("|     |                  |                |     |");
			System.out.println("|     |                  |                |     |");
			System.out.println("|     |                  |                |     |");
			System.out.println("|_____|                  |                |_____|");
			System.out.println("|                        |                      |");
			System.out.println("|                        |                      |");
			System.out.println("|                        |                      |");
			System.out.println("|                        |                      |");
			System.out.println("|________________________|______________________|");
			System.out.println("\n");
		}
		
		public void finish() {
			System.out.println("-----Integrantes-----");
			System.out.println("\n");			
			System.out.println("Lais Senna");
			System.out.println("Video YouTube: www.youtube.com/watch?v=GGx0kmhaRMU&feature=youtu.be");
		}
			    
}
	
	
	

