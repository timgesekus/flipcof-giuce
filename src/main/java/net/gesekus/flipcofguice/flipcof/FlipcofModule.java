package net.gesekus.flipcofguice.flipcof;

import net.gesekus.flipcofguice.fpmh.DefaultFpmh;
import net.gesekus.flipcofguice.fpmh.Fpmh;
import net.gesekus.flipcofguice.fpmh.FpmhFactory;
import net.gesekus.flipcofguice.router.DefaultRouter;
import net.gesekus.flipcofguice.router.Router;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class FlipcofModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Router.class).to(DefaultRouter.class).in(Singleton.class);
		install(new FactoryModuleBuilder()
	    .implement(Fpmh.class, DefaultFpmh.class) 
		.build(FpmhFactory.class));
	}

}
