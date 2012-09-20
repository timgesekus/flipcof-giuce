package net.gesekus.flipcofguice.flipcof;

import net.gesekus.flipcofguice.fpmh.FpmhBuilder;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Flipcof {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new FlipcofModule());
		FpmhBuilder builder = injector.getInstance(FpmhBuilder.class);
		builder.build();
	}

}
