package acr.hello;

import acr.util.*;

public class Hello {

	public static String Greet() {
		PropertiesFile greetings_file = new PropertiesFile("/resource/hello.properties");
		String mygreeting = greetings_file.GetPropertiesMap("phrase");
		greetings_file=null;
		return mygreeting + "\n";
	}
}
