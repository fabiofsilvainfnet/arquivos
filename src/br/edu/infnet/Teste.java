package br.edu.infnet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
		
		File diretorio = new File("c:\\infnet");
		
		if (!diretorio.exists())
			diretorio.mkdir();

//		try {
//			FileInputStream inputStream = new FileInputStream(arquivo.getAbsolutePath());
//			byte[] texto = new byte[inputStream.available()];
//			inputStream.read(texto);
//			inputStream.close();
//			System.out.println(new String(texto));			
//		} catch (FileNotFoundException e) {
//			System.out.println("Arquivo não encontrado");
//		} catch (IOException e) {
//			System.out.println("Erro ao tentar fechar o stream");
//		}
		
		try {
			FileReader reader = new FileReader(arquivo);
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			bufferedReader.lines().forEach(linha -> System.out.println(linha));
			
			reader.close();
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao tentar fechar o stream");
		}
		
		
		
		
//		try {
//			FileOutputStream outputStream = new FileOutputStream(arquivo.getAbsolutePath());
//			
//				
//			
//			
//			outputStream.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("Arquivo não encontrado");
//		} catch (IOException e) {
//			System.out.println("Erro ao tentar fechar o stream");
//		}

		
		
	}

}
