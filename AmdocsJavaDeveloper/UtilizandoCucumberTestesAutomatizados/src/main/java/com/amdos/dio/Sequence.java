package com.amdos.dio;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
	private Render render;
	public Sequence(Render render){
		this.render = render;
	}

	public List<String> generate(int length){
		List<String> list = new ArrayList<String>(length);
		for(int i = 1; i <= length; i++) {
			list.add(render.render(i));
		}
		return list;
	}
}