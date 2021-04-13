package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Motor;

public class Veiculo {
	
	public static Scanner scanner = new Scanner(System.in);
	 
	private static String cor;
	 private static int anoFabricacao;
	 private static int anoModelo;
	 private static Motor motor;
	 private static int velocidadeAtual;

	
		 public static String getCor() {
		return cor;
	}
	public static void setCor(String cor) {
		Veiculo.cor = cor;
	}
	public static int getAnoFabricacao() {
		return anoFabricacao;
	}
	public static void setAnoFabricacao(int anoFabricacao) {
		Veiculo.anoFabricacao = anoFabricacao;
	}
	public static int getAnoModelo() {
		return anoModelo;
	}
	public static void setAnoModelo(int anoModelo) {
		Veiculo.anoModelo = anoModelo;
	}
	public static Motor getMotor() {
		return motor;
	}
	public static void setMotor(Motor motor) {
		Veiculo.motor = motor;
	}
	public static int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public static void setVelocidadeAtual(int velocidadeAtual) {
		Veiculo.velocidadeAtual = velocidadeAtual;
	}
		
	public static int acelerar (int valor) {
		
		return 0 ; 
	}	 
	
	public static int frear(int valor2) {
		
		return 0;
	}
	
		 
		 
		 
		 
		 
		 
	
}
