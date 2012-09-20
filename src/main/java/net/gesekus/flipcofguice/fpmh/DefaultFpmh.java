package net.gesekus.flipcofguice.fpmh;

import javax.inject.Inject;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

import net.gesekus.flipcofguice.router.Router;

public class DefaultFpmh implements Fpmh {
	private String name;

	@AssistedInject
	public DefaultFpmh(
			Router router,
			@Assisted  String fpmhName) {
		this.name = fpmhName;
		router.register(this);
	}

	@Override
	public String getName() {
		return name;
	}
}
