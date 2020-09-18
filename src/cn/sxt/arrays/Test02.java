package cn.sxt.arrays;
/**
 * 测试数组的三种出书画方式
 * @author hj
 *
 */
public class Test02 {

	public static void main(String[] args) {
		//静态初始化
		int[] a= {2,3,4,5};
		User[] b= {
				new User(1001,"黄佳")
		};
		//默认初始化
		int[] c=new int[3];//默认给数组元素赋值，复试规则与成员变量赋值规则一致。
	//动态初始化
		int[] a2=new int[2];
		a2[0]=1;//给数组元素赋值；
		a2[1]=2;
	}

}
