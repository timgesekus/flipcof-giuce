package net.gesekus.flipcofguice.router;

import net.gesekus.flipcofguice.fpmh.Fpmh;

public class DefaultRouter implements Router {

	@Override
	public void register(Fpmh fpmh) {
		System.out.println("Fpmh connected:" + fpmh.getName());
	}

}
