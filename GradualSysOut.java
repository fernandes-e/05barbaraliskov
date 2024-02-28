
public class GradualSysOut {

	private String stringIn = "";
	private int speed = 0;
	private String setColor = "\u001B[0m";
	private int x;
	public String[][] ansiColors = {
			{"blue", "\u001B[34m"},
			{"cyan", "\u001B[36m"},
			{"red", "\u001B[31m"},
			{"green", "\u001B[32m"},
			{"white", "\u001B[37m"},
			{"yellow", "\u001B[33m"},
			{"black", "\u001B[30m"},
			{"magenta", "\u001B[35m"},
			{"reset", "\u001B[0m"},
	};
	public char[][] ansiColorPrintout = {
			{'\\', 'u', '0', '0', '1', 'B', '[', '3', '4', 'm'},
			{'\\', 'u', '0', '0', '1', 'B', '[', '3', '6', 'm'},
			{'\\', 'u', '0', '0', '1', 'B', '[', '3', '1', 'm'},
			{'\\', 'u', '0', '0', '1', 'B', '[', '3', '2', 'm'},
			{'\\', 'u', '0', '0', '1', 'B', '[', '3', '7', 'm'},
			{'\\', 'u', '0', '0', '1', 'B', '[', '3', '3', 'm'},
			{'\\', 'u', '0', '0', '1', 'B', '[', '3', '0', 'm'},
			{'\\', 'u', '0', '0', '1', 'B', '[', '3', '5', 'm'},
			{'\\', 'u', '0', '0', '1', 'B', '[', '0', 'm'},
	};
	
	// HOW DO I GET THEM TO PRINT THE CODES THEMSELVES AS CHARACTERS
	
	public GradualSysOut(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setStringIn(String stringIn) {
		this.stringIn = stringIn;
	}
	
	public void printAnsiColors() {
		this.overlapArrays(ansiColors, ansiColorPrintout);
	}
	
	public void overlapArrays(String[][] arrIn1, char[][] arrIn2) {
		for (int i = 0; i < arrIn1.length; i++) {
			for (int j = 0; j < arrIn1[i].length; j++) {
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(setColor + arrIn1[i][j] + " ");
			}
			this.printSimpleArray(arrIn2[i]);
			System.out.println();
		}
	}
	

	public String getStringIn() {
		return stringIn;
	}
	
	public void setColor(String setColor) {
		if(ansiExists(setColor)) {
			this.setColor = setColor;
		}
	}
	
	private boolean colorExists(String colorString) {
		for (int i = 0; i < ansiColors.length; i++) {
				if (ansiColors[i][0] != null && ansiColors[i][0].equals(colorString)) {
					this.x = i;
					return true;
				}
		}
		return false;
	}
	
	private boolean ansiExists(String colorString) {
		for (int i = 0; i < ansiColors[1].length; i++) {
				if (ansiColors[1][i] != null && ansiColors[1][i].equals(colorString)) {
					return true;
				}
		}
		return false;
	}
	
	public void colorString(String colorString) {
		if(colorExists(colorString)) {
			this.setColor = ansiColors[x][1];
		}
	}
	
	public void printArray(char[][] stringIn) {
		for (int i = 0; i < stringIn.length; i++) {
			for (int j = 0; j < stringIn[i].length; j++) {
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(setColor + stringIn[i][j]);
			}
			System.out.println();
		}
	}
	
	public void printSimpleArray(char[] stringIn) {
		for (int i = 0; i < stringIn.length; i++) {
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(setColor + stringIn[i]);
		}
	}
	
	public void print(String stringIn) {
//		for(int i = 0; i < stringIn.length(); i++) {
//			System.out.print(stringIn.charAt(i));
//		}
		this.stringIn = stringIn;
		for(int i = 0; i < stringIn.length(); i++) {
			try {
	            Thread.sleep(speed);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			System.out.print(setColor + stringIn.charAt(i));
		}

	}
	
	public void printWide(String stringIn) {
//		for(int i = 0; i < stringIn.length(); i++) {
//			System.out.print(stringIn.charAt(i));
//		}
		this.stringIn = stringIn;

		for(int i = 0; i < stringIn.length(); i++) {
			try {
	            Thread.sleep(speed);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			System.out.print(setColor + stringIn.charAt(i) + " ");
		}

	}
	
}
