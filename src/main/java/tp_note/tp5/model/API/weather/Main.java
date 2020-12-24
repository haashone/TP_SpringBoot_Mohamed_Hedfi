package tp_note.tp5.model.API.weather;

public class Main {


	private Integer temp;
	private Double feelsLike;
	private Integer tempMin;
	private Integer tempMax;
	private Integer pressure;
	private Integer humidity;

	public Integer getTemp() {
		return temp;
	}

	public void setTemp(Integer temp) {
		this.temp = temp;
	}

	public Double getFeelsLike() {
		return feelsLike;
	}

	public void setFeelsLike(Double feelsLike) {
		this.feelsLike = feelsLike;
	}

	public Integer getTempMin() {
		return tempMin;
	}

	public void setTempMin(Integer tempMin) {
		this.tempMin = tempMin;
	}

	public Integer getTempMax() {
		return tempMax;
	}

	public void setTempMax(Integer tempMax) {
		this.tempMax = tempMax;
	}

	public Integer getPressure() {
		return pressure;
	}

	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	

	@Override
	public String toString() {
		return "Main [temp=" + temp + ", feelsLike=" + feelsLike + ", tempMin=" + tempMin + ", tempMax=" + tempMax
				+ ", pressure=" + pressure + ", humidity=" + humidity + "]";
	}
}
