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
import spittr.data.SpittleRepository;

public class SpitterControllerTest {
	
	@Test
	public void shouldShowRegistration() throws Exception {
		SpitterController controller = new SpitterController();
		MockMvc mockMvc = standaloneSetup(controller).build();

		mockMvc.perform(get("/spitter/register"))
		.andExpect(view().name("registerForm"));
	}
}
