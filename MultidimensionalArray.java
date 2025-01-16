class MultidimensionalArray {
	public static void main(String args[]){
		
		/************************************ ZADANIE 1 **********************************/		
		int[][] array = new int[3][3];
		
		// ustawinie wartości pierwszego wiersza i pierwszej kolumny
		array[0][0] = 1;
		array[0][1] = array[1][0] = 2;
		array[0][2] = array[2][0] = 3;
		
		// obliczenie drugiego wiersza 
		array[1][1] = array[0][1] * array[1][0];
		array[1][2] = array[0][2] * array[1][0];
		
		// obliczenie trzeciego wiersza 
		array[2][1] = array[0][1] * array[2][0];
		array[2][2] = array[0][2] * array[2][0];	

		// wyświetlenie tabliczki
		System.out.println("--------");
		
		System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
		System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);
		System.out.println(array[2][0] + " " + array[2][1] + " " + array[2][2]);
		
		System.out.println("--------");	
		
		
		System.out.println("ZADANIE 2");
		/************************************ ZADANIE 2 **********************************/	
		char[][] produckt = new char [3][];
		produckt[0] = new char[4];
		produckt[1] = new char[2];
		produckt[2] = new char[5];
		
		// wpisz buty
		produckt[0][0] = 'b';
		produckt[0][1] = 'u';
		produckt[0][2] = 't';
		produckt[0][3] = 'y';
		
		// wpisz rozmiar
		produckt[1][0] = 52;
		produckt[1][1] = 50;
		
		// wpisz cenę
		produckt[2][0] = '2';
		produckt[2][1] = '3';
		produckt[2][2] = '.';
		produckt[2][3] = '4';
		produckt[2][4] = '2';
		
		// wyświetlenie produktu
		System.out.println("---------");
		System.out.println(produckt[0][0] + "" + produckt[0][1] + "" + produckt[0][2] + "" + produckt[0][3]);
		System.out.println(produckt[1][0] + "" + produckt[1][1]);
		System.out.println(produckt[2][0]+""+produckt[2][1]+""+produckt[2][2]+""+produckt[2][3]+""+produckt[2][4]);
		System.out.println("---------");
	}
}