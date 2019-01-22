package Model;

public class calculator {

	
	
	public double dblNum (double num) {
		return num * 2;
	}
	
	public double triNum (double num) {
		return num * 3;
	}
	
	public double sqrNum (double num) {
		return num * num;
	}
	
	public boolean isEven (double num) {
		if(num % 2 == 0) {
			return true;
		}
		else 
			return false;
	}
	
	public String message(boolean exist) {
		String msg = null;
		if (exist) {
			msg = "EXIST";
			return msg;
		}
		else 
			return msg;
	}
	
}
