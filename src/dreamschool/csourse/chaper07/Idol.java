package dreamschool.csourse.chaper07;

public class Idol {
	String group;
	String name;
	
	
	public Idol(String group, String name) {
		this.group = group;
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public String getName() {
		return name;
	}
	void changeIdolInfo(String newName, int newGroup) {
		name = newName;
		group = newGroup;
	}
	void printIdolInfo() {
		System.out.println(group + name);
	}
	
	
}