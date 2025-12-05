import java.util.*;
class Main{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=UserMainCode.calculatesum(a,b,c);
		System.out.println(res);
	}
}
class UserMainCode{
	public static int calculatesum(int n1,int n2,int n3){
		if(n1==13){
			if(n2==13) n3=0;
			n1=0;
			n2=0;
		}
		if(n2==13){
			n2=0;
			n3=0;
		}
		if(n3==13){
			n3=0;
		}
		return n1+n2+n3;
		
	}
}