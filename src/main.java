public class main {
	
	public static String which_prize(int points){
		String prize = "";
		if(points <= 50){
			prize = "A wooden rabbit";
		} // if
		else if(150 <= points && points <= 180){
			prize = "a wafer-thin min";
		} // elseif
		if(points>0){
			System.out.println("congratz");
			return ("congratz");
		}
		else {
			System.out.println("sorry");
			return ("Sorry");
		}
	} // which_prize
	
	public static void main(String args[]){
		which_prize(0);
	}
}