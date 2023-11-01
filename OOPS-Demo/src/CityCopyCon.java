
public class CityCopyCon {
	
	int cityId;//wrapper classes
	String cityName;
	
	public CityCopyCon(String cityName) {
		this.cityName = cityName;
	}
	
	public CityCopyCon(int cityId, String cityName) {
		this.cityId = cityId;
		this.cityName = cityName;
	}
	
	public CityCopyCon(CityCopyCon cityCopyCon) {
		System.out.println("cityCopyCon" +cityCopyCon);
	}
	
	
	public static void main(String[] args) {
		CityCopyCon cons =  new CityCopyCon(101, "Bang");
		CityCopyCon copyCon = new CityCopyCon(cons);
	}

}
