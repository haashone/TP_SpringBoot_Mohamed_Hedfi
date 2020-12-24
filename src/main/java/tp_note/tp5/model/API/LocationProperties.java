package tp_note.tp5.model.API;

import java.util.List;

public class LocationProperties {

	private String type;
	private String version;
	private List<Feature> features = null;
	private String attribution;
	private String licence;
	private String query;
	private Integer limit;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public String getAttribution() {
		return attribution;
	}

	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "LocationProperties [type=" + type + ", version=" + version + ", features=" + features + ", attribution="
				+ attribution + ", licence=" + licence + ", query=" + query + ", limit=" + limit + "]";
	}
	
}
