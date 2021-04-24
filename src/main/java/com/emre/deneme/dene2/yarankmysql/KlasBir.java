package com.emre.deneme.dene2.yarankmysql;

public abstract class KlasBir {

	private int id;
	private String name;

	public abstract void sikesike();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
