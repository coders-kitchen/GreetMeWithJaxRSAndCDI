package com.coderskitchen.thegreeter.greetings;

import javax.ejb.Stateless;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

@Stateless
public class GreetingService {
	public String greetSomeone(String name) {
		StringBuilder builder = new StringBuilder();
		builder = builder.append("Hi, ");
		builder = builder.append(name);
		builder = builder.append("\n");
		builder = builder.append("Today it's the ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd'/'MM'/'YYYY");
		builder = builder.append(sdf.format(new Date()));
		return builder.toString();
	}
}
