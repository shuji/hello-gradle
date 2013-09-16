package jp.classmethod;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloGradleTest {

	@Test
	public void sayHello() {
		HelloGradle sut = new HelloGradle();
		assertThat(sut.sayHello(), is("Hello, Gradle"));
	}

}
