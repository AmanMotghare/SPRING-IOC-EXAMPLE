package firstSpring;

public class Address {
	
	String area,city;
	int plotNo;
	
	//Performing injection using setters.
	
	public Address() {
		
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	@Override
	public String toString() {
		return "Address wala tostring [area=" + area + ", city=" + city + ", plotNo=" + plotNo + "]";
	}
	
	
	
}
