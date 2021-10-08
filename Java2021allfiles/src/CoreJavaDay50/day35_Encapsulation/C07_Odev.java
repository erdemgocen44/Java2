package CoreJavaDay50.day35_Encapsulation;

public class C07_Odev {
		
		/* Soru
	    Burada iki adet class vardir. Biri Main digeri ise rentApartments
	    rentApartments'in icinde;
	    Bu variable'lari private olarak olusturun;
	    String name
	    int roomCount
	    boolean balconyOrNo

	   Butun variable'lar icin getter ve setter olusturunuz.

	    4 farkli Apartment(apartman dairesi) vardir. 0, 1, 2, 3 rooms(odali)
	    -----------------------------------------------------------------
	    Bir method olusturun;
	    Eger room sayisi 0 ise,
	    rent(kira) 1400
	    Eger oda sayisi 1 ise,
	    rent  1700
	    Eger oda sayisi 2 ise,
	    rent 2200
	    Eger oda sayisi 3 ise,
	    rent 2700
	    rent'i return'leyin.
	    ----------------------------------------------------------------
	    Bir method olusturun.
	    Eger balconyOrNo  true ise,
	    rent'e 200 dollar ekleyin.

	    Main class'in icinde;
	    userName rent is amountOfRent
	     */	
		int rent =0;
		private String name;
	    private int roomCount;
	    private boolean balconyOrNo= true;
	    
	    //---------getter ve stter olusturulan alan----------
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRoomCount() {
			return roomCount;
		}
		public void setRoomCount(int roomCount) {
			this.roomCount = roomCount;
			
		}
		public boolean isBalconyOrNo() {
			return balconyOrNo;
		}
		public void setBalconyOrNo(boolean balconyOrNo) {
			this.balconyOrNo = balconyOrNo;
			
		}
		
		//-----------------soru cozumu-----------------------
	    public  int daireFiyati(int roomCount) {
	    	
	    	if (roomCount==0) {
				this.rent=1400;
			}else if (roomCount==1) {
				this.rent=1700;
			}else if (roomCount==2) {
				this.rent=2200;
			}else if (roomCount==3) {
				this.rent=2700;
			}else {
	    		System.out.println("Hatali veri girdiniz");
			}
	    	return rent;
	    }
	    
	    	public void balconyOrNo() {
		    	if(balconyOrNo==true) {
		    		this.rent+=200;
		    	}
		    	
		    	
			}
	    }
	
