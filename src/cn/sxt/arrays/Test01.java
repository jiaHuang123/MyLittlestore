package cn.sxt.arrays;

public class Test01 {

	public static void main (String[] args) {
		int[] arr01=new int[10];
		String arr02[]=new String[5];
	
		
		arr01[0]=13;
		arr01[1]=15;
		arr01[2]=17;
		
	//通过循环初始化数组
		for(int i=1;i<arr01.length;i++) {
			arr01[i]=i*2+1;
			System.out.println(arr01[i]);
		}
		User[] arr03=new User[3];
		arr03[0]=new User(1001,"黄佳");
		arr03[1]=new User(1001,"黄小佳");
		arr03[2]=new User(1001,"黄大佳");
		
		for(int i=0;i<arr03.length;i++) {
			System.out.println(arr03[i].getName());
		}
		
		
	}

}
class User{
	private int id;
	private String name;
	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}