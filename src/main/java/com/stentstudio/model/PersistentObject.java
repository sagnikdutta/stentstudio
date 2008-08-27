package com.stentstudio.model;

import org.appfuse.model.BaseObject;

public abstract class PersistentObject extends BaseObject {

	private boolean isNew;
	
	@Override
	abstract public boolean equals(Object o);

	@Override
	abstract public int hashCode();

	@Override
	abstract public String toString();
	
}
