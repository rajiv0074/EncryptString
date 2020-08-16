package com.test.oracleCodingProblem;

public class EncryptStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "the black cat jumped on the roof";
		  //expected tcuno hkmtf ecph baee ltdr ajoo
		//String inputString = "chill out";
		  //expected clu hlt io
		  //expected tcuno hkmtf ecph baee ltdr ajoo
		String inpAfterRemovingSpace = inputString.replace(" ", "");
		//System.out.println(inpAfterRemovingSpace);
		String Encryptedpass = encryptPassword(inpAfterRemovingSpace); 
		System.out.println(Encryptedpass);
		//System.out.println(Math.sqrt(25));
		
	}

	private static String encryptPassword(String inpAfterRemovingSpace) {
		// TODO Auto-generated method stub
		int lenOfString = inpAfterRemovingSpace.length();
		int preSquare = findThePreSquare(lenOfString);
		int postSquare = findThePosSquare(lenOfString);
		int row = 0;
		int col = 0;
		int min = postSquare;
		StringBuilder sb = new StringBuilder();
		
		//Setting row and col
		for(int i = preSquare;i<=postSquare;i++) {
			if((preSquare*i) >= lenOfString) {
				if(min >= i) {
					min = i;
					row = preSquare;
					col = i;
				}
			}
		}
		if(row == 0) {
			for(int i = postSquare; i >= preSquare;i-- ) {
				if((postSquare*i) >= lenOfString) {
					if(min >= i) {
						min = i;
						row = postSquare;
						col = i;
					}
				}
			}
		}

		//populate the matrix
		char[][] matrix = new char[row][col];
		int charCount = 0;
		for(int i= 0; i <= (row-1);i++) {
			for(int j = 0; j<= (col-1); j++) {
				if(charCount < inpAfterRemovingSpace.length()) {
					matrix[i][j] = inpAfterRemovingSpace.charAt(charCount);
					charCount++;
				}else {
					break;
				}
				
			}
		}
		
		//print the matrix
		for(int i= 0; i<=(col-1); i++) {
			for(int j= 0; j<=(row-1); j++) {
				//System.out.print(matrix[j][i]);
				sb.append(matrix[j][i]);
			}	
			sb.append(" ");
		}
		return sb.toString();
	}

	private static int findThePreSquare(int lenOfString) {
		// TODO Auto-generated method stub
		return (int) Math.floor(Math.sqrt(lenOfString));
	}

	private static int findThePosSquare(int lenOfString) {
		// TODO Auto-generated method stub
		//System.out.println(lenOfString);
		return (int) Math.ceil(Math.sqrt(lenOfString));
	}

}
