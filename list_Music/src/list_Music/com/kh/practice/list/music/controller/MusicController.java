package list_Music.com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import list_Music.com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	// ArrayList 객체 생성 
	private List<Music> lists = new ArrayList();
	
	public int addList(Music music) { 
	// 마지막 리스트에 객체 저장, 1 리턴 
	} 
	public int addAtZero(Music music) { 
	// 첫 번째 리스트에 객체 저장, 1 리턴 
	} 
	public List<Music> printAll() { 
	// List 반환 
		return lists;
	} 
	public Music searchMusic(String title) { 
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴 
	} 
	public Music removeMusic(String title) { 
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴 
	} 
	public Music setMusic(String title, Music music) { 
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴 
	} 
	public int ascTitle() { 
	// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴 
	} 
	public int descSinger() { 
	// 리스트 가수 명 내림차순 정렬, 1 리턴 
	} 
	
}
