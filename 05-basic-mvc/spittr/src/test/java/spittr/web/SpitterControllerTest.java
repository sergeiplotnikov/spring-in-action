package spittr.web;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.springframework.web.servlet.view.InternalResourceView;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.web.HomeController;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import spittr.Spittle;
import spittr.Spitter;
import spittr.data.SpittleRepository;
import spittr.data.SpitterRepository;

public class SpitterControllerTest {
	
	@Test
	public void shouldShowRegistration() throws Exception {
		SpitterController controller = new SpitterController(null);
		MockMvc mockMvc = standaloneSetup(controller).build();

		mockMvc.perform(get("/spitter/register"))
		.andExpect(view().name("registerForm"));
	}

	@Test
	public void shouldProcessRegistration() throws Exception {
		SpitterRepository mockRepo = mock(SpitterRepository.class);
		Spitter unsaved = new Spitter("jbauer","24hours","Jack","Bauer");
		Spitter saved  = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");
		when(mockRepo.save(unsaved)).thenReturn(saved);

		SpitterController controller = new SpitterController(mockRepo);
		MockMvc mockMvc = standaloneSetup(controller).build();

		mockMvc.perform(post("/spitter/register")
		.param("firstName", "Jack")
		.param("lastName", "Bauer")
		.param("username", "jbauer")
		.param("password", "24hours"))
		.andExpect(redirectedUrl("/spitter/jbauer"));
		
		verify(mockRepo, atLeastOnce()).save(unsaved);
	}
}
