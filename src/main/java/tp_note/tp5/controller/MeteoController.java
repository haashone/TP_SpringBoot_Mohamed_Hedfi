package tp_note.tp5.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import tp_note.tp5.model.Address;
import tp_note.tp5.model.AddressRepository;
import tp_note.tp5.model.API.LocationProperties;
import tp_note.tp5.model.API.weather.WeatherProperties;

@Controller
public class MeteoController {
	@Autowired
	AddressRepository addressRepository;

	@GetMapping("/meteo")
	public String AfficherFormulaireMeteo(Model model) {

		model.addAttribute("FormulaireMeteo", new Address());
		model.addAttribute("allAdresses", addressRepository.findAll());
		return "meteo";
	}

	@PostMapping("/meteo")
	public String AfficherResultat(@ModelAttribute("FormulaireMeteo") Address address, Model model) {

		String key = "6fdf523d5de805d526f192bbe8d428ce";

		RestTemplate restTemplateProperties = new RestTemplate();
		RestTemplate restTemplateWeather = new RestTemplate();
		String linkDataGouv = "https://api-adresse.data.gouv.fr/search/?q=" + address.getContent() + "&limit=1";

		LocationProperties result = restTemplateProperties.getForObject(linkDataGouv, LocationProperties.class);

		double lon = result.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		double lat = result.getFeatures().get(0).getGeometry().getCoordinates().get(1);

		String linkWeather = "http://api.openweathermap.org/data/2.5/weather?" + "lat=" + String.valueOf(lat) + "&lon="
				+ String.valueOf(lon) + "&appid=" + key + "&units=metric";

		WeatherProperties weatherResult = restTemplateWeather.getForObject(linkWeather, WeatherProperties.class);
		
	
		
		model.addAttribute("content", address.getContent());
		model.addAttribute("temp", weatherResult.getMain().getTemp());
		model.addAttribute("pressure", weatherResult.getMain().getPressure());
		model.addAttribute("humidity", weatherResult.getMain().getHumidity());
		model.addAttribute("timeZone", weatherResult.getTimezone());

		return "resultat";
	}

}