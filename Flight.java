
public class Flight {
		
		String airline1;
		String flightNum;
		Time depTime;
		Time arrTime;
		String depCity;
		String arrCity;
		
		public Flight(String a, String num, Time depT, Time arrT, String depC, String arrC) {
			airline1 = a;
			flightNum = num;
			depTime = depT;
			arrTime = arrT;
			depCity = depC;
			arrCity = arrC;
		}
		
		public String toString(){
			return airline1 + "flight " + flightNum + "\n Dep"
			+ depCity + depTime.toString() + arrCity + arrTime.toString();
		}
		
		public String getDepTime() {
			return depTime.toString();
		}
		
		public String getArrTime() {
			return arrTime.toString();
		}
		
	}
