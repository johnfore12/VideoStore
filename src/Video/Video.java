package Video;

public class Video {

	private String title;
	private int id;
	
	public Video(String title, int id) {
		title = this.title;
		id = this.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "[" + getTitle() + ", " + getId() + "]";
	}
}
