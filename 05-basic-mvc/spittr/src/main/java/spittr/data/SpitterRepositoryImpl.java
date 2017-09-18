package spittr.data;

import spittr.*;

public class SpitterRepositoryImpl implements SpitterRepository {
	public Spitter save(Spitter spitter){
		return new Spitter(666L, "defaultSpitter", "defpass00", "Default", "Spitter");
	}
	public Spitter findByUsername(String username){
		return new Spitter(666L, "defaultSpitter", "defpass00", "Default", "Spitter");
	}
}
