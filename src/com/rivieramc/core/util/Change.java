package com.rivieramc.core.util;

import java.util.Collection;

public class Change {
	public ChangeType type;
    public Object newObject;
    public Object oldObject;
	public Collection<? extends Object> containingCollection;
	public String changeID;
	public Object sender;
	
	public Change setNewObject(Object par0) {
		newObject = par0;
		return this;
	}
	
	public Change setOldObject(Object par0) {
		oldObject = par0;
		return this;
	}
	
	public Change setContainingCollection(Collection<? extends Object> par0) {
		containingCollection = par0;
		return this;
	}
	
	public Change setType(ChangeType par0) {
		type = par0;
		return this;
	}
	
	public Change setChangeID(String id) {
		changeID = id;
		return this;
	}
	
	public Change setSender(Object sender) {
		this.sender = sender;
		return this;
	}
}