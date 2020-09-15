package view;

import java.util.Random;

import controlller.ThreadMatriz;

public class Main {
	public static void main(String[] args) {
	
	int matriz[][]=new int [3][5];
	Random gerador = new Random();
	
	for(int l =0;l<3;l++) {
		for(int c=0;c<5;c++) {
			matriz[l][c]=gerador.nextInt(100);
		}
	}

	
		
		for(int i =0; i<3;i++) {
			ThreadMatriz threadM =  new ThreadMatriz(matriz, i);
			threadM.start();
		}
	}

}