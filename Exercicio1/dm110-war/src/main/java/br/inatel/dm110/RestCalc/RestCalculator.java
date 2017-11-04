package br.inatel.dm110.RestCalc;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.dm110.CalcServImpl.CalcServiceImpl;

@ApplicationPath("/rest")
public class RestCalculator extends Application {
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes = new HashSet<>();
		classes.add(CalcServiceImpl.class);
		return classes;
	}
	
	
}
