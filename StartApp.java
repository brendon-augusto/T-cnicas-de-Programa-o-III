package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.view.Moto;
import br.edu.univas.vo.Competidor;
import br.edu.univas.view.Carro;

public class StartApp {
	
		Arraylist<Competidor> competidores = new Arraylist<> ();
	
	public static Scanner scanner = new Scanner(System.in);
	
public static void main(String[] args) {
	
	for(int i = 0; i < 5; i++) {
		
	System.out.println("Seja Bem Vindo ao Menu ");
	System.out.println("Digite sua opção");
	System.out.println("1- Carro");
	System.out.println("2- Moto");
	
	int choice = 0; 
	choice = scanner.nextInt();
	
	if(choice == 1) {
		 
		Competidor competidor = new Competidor();
		Carro carro = new Carro(); 
		competidor.setVeiculo(carro);
		
		}
	
	else if(choice == 2){
		
		Competidor competidor2 = new Competidor(); 
		Moto moto = new Moto (); 
		competidor2.setVeiculo(moto);
		}
			
	}
	
	
	
}
}
