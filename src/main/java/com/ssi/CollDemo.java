package com.ssi;

import java.util.HashMap;
import java.util.Map;

public class CollDemo {

	public static void main(String[] args) {
		
		Map<String,String> parents=new HashMap<>();
		parents.put("father", "xyz");
		parents.put("mother", "pqr");
		System.out.println(parents);
		
		/*
		 * 	<map>
		 * 		<entry key="father" value="xyz"/>
		 * 		<entry key="mother" value="pqr"/>
		 *  </map>
		 */
		
		
		
		//storing objects as value to map
		
		Address adr1=new Address(); adr1.setHno(555); adr1.setCity("Indore");
		Address adr2=new Address(); adr2.setHno(666); adr2.setCity("Bhopal");
		
		Map<String,Address> addresses=new HashMap<>();
		addresses.put("office", adr1);
		addresses.put("resident", adr2);
		System.out.println(addresses);
		
		/*
		 * 	<map>
		 * 		<entry key="office" value-ref="adr1"/>
	 * 			<entry key="resident" value-ref="adr2"/>
		 * 	</map>
		 */
		
		
		
	}

}
