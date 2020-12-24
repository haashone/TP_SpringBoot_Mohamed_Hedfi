package tp_note.tp5.model.API;

public class Properties {



	private String label;
	private Double score;
	private String id;
	private String name;
	private String postcode;
	private String citycode;
	private Double x;
	private Double y;
	private String city;
	private String context;
	private String type;
	private Double importance;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getImportance() {
		return importance;
	}

	public void setImportance(Double importance) {
		this.importance = importance;
	}
	
	
	@Override
	public String toString() {
		return "Properties [label=" + label + ", score=" + score + ", id=" + id + ", name=" + name + ", postcode="
				+ postcode + ", citycode=" + citycode + ", x=" + x + ", y=" + y + ", city=" + city + ", context="
				+ context + ", type=" + type + ", importance=" + importance + "]";
	}
}
