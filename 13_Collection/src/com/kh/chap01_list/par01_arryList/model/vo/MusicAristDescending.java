package com.kh.chap01_list.par01_arryList.model.vo;

import java.util.Comparator;

import com.kh.chap01_list.arrayList.model.vo.Music;

public class MusicAristDescending implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		// 1. 오름차순
		// o1 비교메서드 o2
		
		// 2. 내림차순
		// o2 비교메서드 o1
		return o2.getArtist().compareTo(o1.getArtist());
		
	}

}
