package model;

public class MagicSquare {

	private int[][] magicSquare;


	int row=0;
	int column=0;
	int previousRow=0;
	int previousColumn=0;
	int number=0;


	public MagicSquare(int n,String side, String address) {

		magicSquare=new int[n][n];
		chooiceStartSide(side, n);
		choiceStartPoint(n,address);
		showArray();

	}
	//-----------LLenar Matriz--------------
		public void generate() {
		for(int i=0;i<magicSquare.length;i++) {
		for(int j=0 ; j<magicSquare[0].length ; j++) {
	
				magicSquare[i][j] = 0;
	
			}
	
		}
	}
	//---------------Escoger punto inicial-------------------

	public void chooiceStartSide(String side,int n) {
		if(side.equalsIgnoreCase("Up")) {
			row = 0;
			column = (n-1)/2;
		}else if(side.equalsIgnoreCase("Left")) {
			row = (n-1)/2;
			column = n-1;
		}else if(side.equalsIgnoreCase("Down")) {
			row = n-1;
			column = (n-1)/2;
		}else if(side.equalsIgnoreCase("Right")) {
			row = (n-1)/2;
			column = 0;
		}

		magicSquare[row][column] = number;

	}
	//-------------------Escoger lado inicial--------------------
	public void choiceStartPoint(int n, String address) {

		if(address.equalsIgnoreCase("NE")) {
        
          
		int startPoint=n/2;
		column=startPoint;
		if(address.equalsIgnoreCase("NE")) {
			for(int i=1;i<((n*n)+1);i++) {

				if(magicSquare[row][column]==0) {
					magicSquare[row][column]=number;
				}else {
					row=previousRow+1;
					column=previousColumn;
					//if(i<=(n*n)){
					magicSquare[row][column]=number;
				//}
					}

				previousRow=row;
				previousColumn=column;

				number++;
				column++;
				row--;

				if(row<0 && column==n) {
					row=n-1;
					column=0;
				}else if(row<0) {
					row=row+n;
				}else if(column==n) {
					column=0;
				}
			}


		}
		if(address.equalsIgnoreCase("NO")) {

			magicSquare[row][column]=number;
			row=previousRow;
			column=previousColumn;

			for(int i=1;i<((n*n)+1);i++) {
				previousRow--;
				previousColumn--;
				number++;

				if(row<0) {
					previousRow=magicSquare.length-1;
				}
				if(previousColumn<0) {
					previousColumn=magicSquare.length-1;
				}
				if(magicSquare[previousRow][previousColumn]==0) {
					magicSquare[previousRow][previousColumn]=number;			
				}else {
					previousColumn=column+1;
					previousRow=row;
					magicSquare[previousRow][previousColumn]=number;
				}

				row=previousRow;
				column=previousColumn;
			}



		}


		if(address.equalsIgnoreCase("SO")) { 
			previousRow = row;
			previousColumn = column;

			for (int i = 2; i <= n*n; i++) {
				row++;
				column--;
				if(row>(n-1)){
					row = 0;
				}

				if(column<0){
					column = n-1;
				}

				if (magicSquare[row][column] == 0) {
					magicSquare[row][column] =i;
				}else {
					row = previousRow-1;
					column = previousColumn;
					magicSquare[row][column] =i;
				}
				previousRow = row;
				previousColumn = column;
			}	


		}

		if(address.equalsIgnoreCase("SE")) {

			for (int i = 2; i <= n*n; i++) {
				if (magicSquare[(row + 1) % n][(column + 1) % n] == 0) {
					row = (row + 1) % n;
					column = (column + 1) % n;
				}
				else {
					row = (row - 1 + n) % n;
				}
				magicSquare[row][column] = i;
			}	

		}
	}

	//-------Hallar constante magica--------
		public int magicConstant(int n) {	
			int sum= n*(n*n+ 1)/2;
			return sum;
		}
	//}
	//------------Mostrar Matriz------------
	public String showArray(){
		String a = "";
		for(int i=0;i<magicSquare.length;i++) {
			for(int j=0 ; j<magicSquare[0].length ; j++) {
				a+= ""+magicSquare[i][j]+"\t";
			}
			a+= "\n";
		}
		return a;


	}
	
	//-----Comprobar numero par-------
	public boolean oddNumber(int n){
		boolean odd=false;	
		if(n>1) {
		if(n % 2 == 0)
			odd=false;
		else
			odd = true;
			}
		return odd;
	}
	
}
