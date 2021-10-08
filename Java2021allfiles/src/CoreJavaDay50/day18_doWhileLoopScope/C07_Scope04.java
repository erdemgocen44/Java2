package CoreJavaDay50.day18_doWhileLoopScope;

public class C07_Scope04 {

	public static void main(String[] args) {
		// Soru 2 ) "m" harfinden baslayarak "c" harfine kadar tum harfleri yazdirin.

				char m = 'm';
				char c = 'c';

				while (c <= m) {
					System.out.print(m + " ");

					m--;
				}
			}

		}