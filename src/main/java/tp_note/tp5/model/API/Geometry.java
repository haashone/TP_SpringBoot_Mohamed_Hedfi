package tp_note.tp5.model.API;

import java.util.List;

public class Geometry {

	private String type;
	private List<Double> coordinates = null;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Double> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}


	@Override
	public String toString() {
		return "Geometry [type=" + type + ", coordinates=" + coordinates + "]";
	}
}
