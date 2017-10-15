package pl.nn.service;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pl.nn.object.User;

@Component
public class UserService {

	public String getInfo() throws JsonGenerationException, JsonMappingException, IOException, ResourceAccessException {
		RestTemplate restTemplate = new RestTemplate();

		User user = restTemplate.getForObject("xxx.com.pl", User.class);
		ObjectMapper mapper = new ObjectMapper();
		String showUser = mapper.writeValueAsString(user);

		System.out.println(showUser);
		showUser = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
		return showUser;
	}
}
