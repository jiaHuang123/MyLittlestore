package cn.sxt.arrays;

public class Test03 {
	public static void main(String[] args) {
		int[] a=new int[4];
		for(int i=0;i<a.length;i++) {
			a[i]=100*i;
		}
		//��Ԫ��ֵ
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("############");
		//foreachѭ������ȡԪ��ֵ���������޸�
		for(int m:a) {
			System.out.println(m);
		}
		String[] ss= {"aa","bbb","cc","ddd"};
		for(String f:ss) {
			System.out.println(f);
		}
	}
	
	public Test03() {
		// TODO Auto-generated constructor stub
	}

}
