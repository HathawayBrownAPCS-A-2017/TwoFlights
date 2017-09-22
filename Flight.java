
public class Flight {
		
		private String airline1;
		private String flightNum;
		private Time depTime;
		private Time arrTime;
		private String depCity;
		private String arrCity;
		
		public Flight(String a, String num, Time depT, Time arrT, String depC, String arrC) {
			airline1 = a;
			flightNum = num;
			depTime = depT;
			arrTime = arrT;
			depCity = depC;
			arrCity = arrC;
		}
		
		public String toString(){
			return airline1 + "flight " + flightNum + 
			   "\n Depart " + depCity + depTime.toString() + 
			   "\n Arrive " + arrCity + arrTime.toString();
		}
		
		public Time getDepTime() {
			return depTime;
		}
		
		public Time getArrTime() {
			return arrTime;
		}
		
	}