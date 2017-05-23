package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
//@ContextConfiguration(locations="classpath:META-INF/spring/config.xml")
//use xml to set up autoscanning
public class CDPlayerTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private MediaPlayer player;
	
    @Autowired
    //unspecified bean, will work only if there is a single option, 2+ CompactDisk components in com.mycompany.app will crash test
    private CompactDisc cd;

	@Test
	public void play() {
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", log.getLog());
	}
    /* @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
        System.out.println("\n\n");
        cd.play();
        System.out.println("\n\n");
    } */
}
