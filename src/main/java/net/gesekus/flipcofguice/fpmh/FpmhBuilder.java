package net.gesekus.flipcofguice.fpmh;

import com.google.inject.Inject;

public class FpmhBuilder {
	private FpmhFactory fpmhFactory;

	@Inject
	public FpmhBuilder(FpmhFactory fpmhFactory) {
		this.fpmhFactory = fpmhFactory;
	}
	
	public void build () {
		Fpmh f1 = fpmhFactory.create("Tim");
		Fpmh f2 = fpmhFactory.create("Tom");
		
	}
}
