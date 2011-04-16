package acr.util;

import java.util.*;
import java.io.*;

public class PropertiesFile {

	private Map<String,String> map;

	/**
	 * Takes a "properties" filename to read.
	 * @param filename
	 */

	public PropertiesFile(String filename) {
		map = ReadPropertiesFileAsMapDelim(filename, "=");
	}

	public String GetPropertiesMap(String key){
		return map.get(key);
	}

	/**
	 * Reads a "properties" file, and returns it as a Map 
	 * (a collection of key/value pairs).
	 * 
	 * @param filename  The properties filename to read.
	 * @param delimiter The string (or character) that separates the key 
	 *                  from the value in the properties file.
	 * @return The Map that contains the key/value pairs.
	 * @throws Exception
	 */
	public Map<String, String> ReadPropertiesFileAsMapDelim(String filename, String delimiter) {
		Map<String, String> map = new HashMap<String, String>();
		BufferedReader reader = null;
		reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(filename)));
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				if (line.trim().length()==0) continue;
				if (line.charAt(0)=='#') continue;
				int delimPosition = line.indexOf(delimiter);
				String key = line.substring(0, delimPosition).trim();
				String value = line.substring(delimPosition+1).trim();
				map.put(key, value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				reader=null;
				// ignore
			}	
		}
		return map;
	}


}
