package CoreJavaDay50.day35_Encapsulation;

public class C08_Encapsulation08 {
	
	
	private String okulIsmi="Yildiz Koleji";
	private int okulNo=12345;
	private boolean okulAcikMi=true;
	
	public String getOkulIsmi() {
		return okulIsmi;
	}
	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi = okulIsmi;
	}
	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}
	public boolean isOkulAcikMi() {
		return okulAcikMi;
	}
	public void setOkulAcikMi(boolean okulAcikMi) {
		this.okulAcikMi = okulAcikMi;
	}
}
