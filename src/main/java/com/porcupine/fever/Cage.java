package com.porcupine.fever;

public class Cage {
	private int sick;
	private int healthy;
	private int all;

	public Cage(int sick, int healthy, int all) {
		this.sick = sick;
		this.healthy = healthy;
		this.all = all;
	}

	public int getSick() {
		return sick;
	}

	public void setSick(int sick) {
		this.sick = sick;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}

	@Override
	public String toString() {
		return "Cage [sick=" + sick + ", healthy=" + healthy + ", all=" + all + "]";
	}
}
