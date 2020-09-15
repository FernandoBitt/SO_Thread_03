package controlller;

public class ThreadMatriz extends Thread{

	private int matriz[][];
	private int l;
	
	public ThreadMatriz(int matriz[][], int l) {
		this.matriz=matriz;
		this.l=l;
	}
	
	@Override
	public void run() {
		calcLinha();
	}

	private void calcLinha() {
		int soma=0;
			for(int c=0;c<5;c++) {
				soma=matriz[l][c]+soma;
			}
			System.out.println("linha nº: "+(l+1)+" soma = "+soma);
		}
	}


