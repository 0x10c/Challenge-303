package challenge024;

public class Main {
	public static void main(String[] args) {
		int elements[] = {10, 15, 20, 25, 30, 45};
		
		// if first and second elements equals 10 = true
		// if first or last elment isn't equals to 10 = false
		System.out.println(elements[0] == 10 && elements[elements.length - 1] == 10);
		
		// one of them - first or last elements must be equals to 10 = true
		// if first and last elements are not eqials to 10 = false
		System.out.println(elements[0] == 10 || elements[elements.length - 1] == 10);
	}
}
