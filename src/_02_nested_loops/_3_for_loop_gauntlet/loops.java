package _02_nested_loops._3_for_loop_gauntlet;

public class loops {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		
		for(int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		
		for(int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 0; i < 100; i++) {
			if (!(i % 2 == 0)) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			}
			else {
				System.out.println(i + " is odd");
			}
		}
		
		for(int i = 1; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 2008; i < 2023; i++) {
				System.out.println("In the year " + i + " I was " + (i - 2008) + " years old.");
		}
		
		for(int i = 0; i < 3; i++) {
			for(int g = 0; g < 3; g++)
				System.out.println(i + " " + g);
		}
		
		for(int f = 0; f < 9; f+=3) {
			for(int i = 1; i < 2; i++) {
				for(int g = i + 1; g < i + 2; g++)	{
					for(int h = g + 1; h < g + 2; h++) {
						System.out.println((i+f) + " " + (g+f) + " " + (h+f));
					}
				}	
			}
		}
	}
}
