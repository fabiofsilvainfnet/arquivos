package br.edu.infnet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Teste {

	public static void main(String[] args) {
		
		File arquivo = new File("c:\\Temp\\uf.csv");
		System.out.println(arquivo);
		
		System.out.println("Nome do arquivo: " + arquivo.getName());
		System.out.println("Path: " + arquivo.getAbsolutePath());
		System.out.println("Pode ser executado: " + arquivo.canExecute());
		System.out.println("Pode ser lido: " + arquivo.canRead());
		System.out.println("Pode ser escrito: " + arquivo.canWrite());
		System.out.println();
		
		try (
				FileReader reader = new FileReader(arquivo);
				BufferedReader bufferedReader = new BufferedReader(reader);
			) {
			
			bufferedReader.lines().forEach(linha -> imprimirEstado(linha));
		
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao tentar fechar o stream");
		}
		
	}

	private static Object imprimirEstado(String linha) {
		String linhaSemAspas = linha.replace("\"", "");
		String[] campos = linhaSemAspas.split(";");
		if (!campos[0].equals("UFCOD"))
			System.out.println("Sigla do Estado: " + campos[1] + " | Nome do Estado: " + campos[2]);
		
		return null;
	}

}
