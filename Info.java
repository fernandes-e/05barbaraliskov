

import java.util.Scanner;

public class Info {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		GradualSysOut primpt = new GradualSysOut(20);
		primpt.printWide("Press 'enter' to proceed");
//		primpt.wait(scan.next());
		scan.nextLine();
		primpt.colorString("green");
		primpt.print("\nBarbara Liskov\n1939 - present\n");
		// because of the way this is formatted, to prevent unwanted indentations, add line break at the end of string1 rather than the start of string2
		scan.nextLine();
		primpt.setColor("\u001B[36m");
		primpt.printWide("BACKGROUND");
		primpt.print("\n>> Barbara Liskov is a Turing Award recipient [1]");
		scan.nextLine();
		primpt.print("\n>> She also worked as a professor at MIT [1]");
		scan.nextLine();
		primpt.print("\n>> Most significantly, she created CLU - cluster -\n the first programming language dealing with objects\n and organizing data via abstraction [2]");
		scan.nextLine();
		primpt.print("\n>> This is significant, because a large amount of \n modern programming languages are object-oriented! \n Some object-oriented languages include C (and \n later C++ and C#), Python, and even the language \n used to write this program - Java! [3]\n");
		scan.nextLine();
		primpt.colorString("yellow");
		primpt.printWide("IMPACTS ON COMPUTER SCIENCE");
		primpt.print("\n>> Object-oriented computer programming has many \n benefits and uses");
		scan.nextLine();
		primpt.print("\n>> Some of the biggest benefits, which can be seen\n in this code, are its organization (or \"modularity\")\n and reusability.");
		scan.nextLine();
		primpt.print("\n>> For example, I added color and movement to this\n text using a class method, which allows me to define an\n operation which can be reused multiple times.\n Could you imagine rewriting THIS for each new \n line of text??\n");
		primpt.colorString("cyan");
		primpt.print("\npublic void print(String stringIn) {\r"
				+  "		this.stringIn = stringIn;\r"
				+ "\r"
				+ "		for(int i = 0; i < stringIn.length(); i++) {\r"
				+ "			try {\r"
				+ "	            Thread.sleep(speed);\r"
				+ "	        } catch (InterruptedException e) {\r"
				+ "	            e.printStackTrace();\r"
				+ "	        }\r"
				+ "			System.out.print(setColor + stringIn.charAt(i));\r"
				+ "		}\r"
				+ "\r"
				+ "	}\n");
		primpt.colorString("yellow");
		primpt.print("\n>> But, because of the grouping that Liskov added\n to programming, I can just say \"print\" instead of typing\n out all of that text each time!");
		scan.nextLine();
		primpt.print("\n\n>> And that's just for the typewriter effect alone.\n But there's our example of reusability; the objects and\n modularity are a bit different.");
		scan.nextLine();
		primpt.print("\n>> The way that I programmed the colors to work is\n by making an array of objects (per object-oriented\n programming) to store color names and the ANSI codes\n that correspond with them.\n\n");
		primpt.colorString("cyan");
		primpt.printAnsiColors();
		scan.nextLine();
		primpt.colorString("yellow");
		primpt.print(">> Object-oriented programming also allows us to do\n things with user input!\n Go ahead and select a color (from the above array):\n");
		primpt.colorString(scan.nextLine());
		primpt.print("\n>> Look!! Pretty neat what the computer can do, right?\n");
		scan.nextLine();
		primpt.colorString("cyan");
		primpt.print(">> Thanks to Liskov, engineers were able to develop\n increasingly complex computer functions that would\n not just store data, but store operations that expanded\n functionality. Without these, it's doubtful that\n technology would be where it is today, especially with\n things like touchscreens and artificial intelligence!\n\n");
		primpt.colorString("white");
		scan.nextLine();
		primpt.printWide("SOURCES");
		primpt.print("\n[1] Massachusetts Institute of Technology. n.d. MIT. \n \"Barbara Liskov.\" https://pmg.csail.mit.edu/~liskov/\n");
		primpt.print("\n[2] D'Agostino, Susan. 2019. \"The Architect of Modern\n Algorithms.\" Quanta Magazine. November 20, 2019.\n https://www.quantamagazine.org/barbara-liskov-is-the-\n architect-of-modern-algorithms-20191120/\n");
		primpt.print("\n[3] Liskov, Barbara; Atkinson, Russ; Bloom, Toby; et al.\n “CLU Reference Manual.” Cambridge: Massachusetts\n Institute of Technology, October 1979. https://pmg.\n csail.mit.edu/ftp.lcs.mit.edu/pub/pclu/\n CLU/3.Documents/MIT-LCS-TR-225.pdf.\n");
		
		scan.close();
	}

}
