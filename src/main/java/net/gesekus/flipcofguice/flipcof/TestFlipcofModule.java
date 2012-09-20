package net.gesekus.flipcofguice.flipcof;

import net.gesekus.flipcofguice.router.Router;
import net.gesekus.flipcofguice.router.TestRouter;

import com.google.inject.AbstractModule;

public class TestFlipcofModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Router.class).to(TestRouter.class);
	}

}
