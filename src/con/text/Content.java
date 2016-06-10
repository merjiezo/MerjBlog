package con.text;

public class Content {
	
	private String Name;
	
	private String title;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void printContent() {
		System.out.println("姓名是： 标题是：");
	}

}
