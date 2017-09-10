package spittr.data;

import spittr.Spittle;
import java.util.*;
import java.util.Date;

public class SpittleRepositoryImpl implements SpittleRepository {

	public List<Spittle> findSpittles(long max, int count){
		List<Spittle> spittleList = new ArrayList<Spittle>();
		spittleList.add(new Spittle("aaa",new Date(2017,01,01),null,null));
		spittleList.add(new Spittle("bbb",new Date(2017,02,02),null,null));
		spittleList.add(new Spittle("ccc",new Date(2017,03,03),null,null));
		spittleList.add(new Spittle("ddd",new Date(2017,04,04),null,null));
		return spittleList;
	}

	public Spittle findOne(long spittleId){
		return new Spittle("EEE",new Date(2017,05,05),null,null);
	}
}
