package module3;

import io.jitpack.Module1util;
import io.jitpack2.Module2utiljava;

public class Main {
	public static void main(String[] args) {
		Module1util module = new Module1util();
		String result = module.testMethod();
		System.out.println(result);
		
		Module2utiljava module1 = new Module2utiljava();
		module1.testMethod();
	}

}
