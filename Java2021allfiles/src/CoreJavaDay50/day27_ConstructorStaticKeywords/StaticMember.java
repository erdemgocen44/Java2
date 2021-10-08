package CoreJavaDay50.day27_ConstructorStaticKeywords;


		public class StaticMember {
			static int x ;
			int y;
			
			StaticMember(){
			x+=2;
			y++;

		 }
		    static int getSquare() {
			return x * x ;
		}
		@SuppressWarnings("static-access")
		public static void main(String[] args) {
			
			StaticMember sm1=new StaticMember();
			
			StaticMember sm2=new StaticMember();
			
			int z =sm1.getSquare();

			System.out.println("-x"+z+"-y"+sm2.y);
			
			
		   }

		}
	