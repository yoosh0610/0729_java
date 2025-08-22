package list_Music.com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		super();
	}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title, singer);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music music = (Music) obj;
		return Objects.equals(title, music.title)
				&& Objects.equals(singer, music.singer);
	}	
}
