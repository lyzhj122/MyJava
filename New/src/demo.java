import java.util.Calendar;
import java.util.*;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import java.math.*;
import java.nio.file.Paths;
class demo{
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个数\n");
		int a = scan.nextInt();
		//int d=Math.sqrt(a).sqrt(a);
		System.out.printf("%d 的平方是: %d",a,a*a);
		scan.close();

int result = 0;
for (int i=1;i<10;i++){
	result +=i;
}
System.out.println("\nresult="+result);
int[] b=new int[]{3,4,5};
*/
/*System.out.print(b[2]);*/
/*
		for (int j=0;j<b.length;j++){
System.out.printf("b=%d\n",b[j]);
}
int[] ages=new int[]{11,22,33,44,55};
for(int mm : ages){
	System.out.println(mm);
}

System.out.printf("%tc",new Date());
//Scanner sc=new Scanner(Paths.get("C:\\new.txt"));
*/
for (int j=10;j>0;j--){
	System.out.println("Counting down..."+j);
}
System.out.println("Blastoff");
Date birthday=new Date();
Calendar shengri=Calendar.getInstance();
birthday=shengri.getTime();
//birthday.getMonth();
//birthday=shengri.getTime();
//System.out.println(birthday.getTime());
System.out.println(birthday);
System.out.println(birthday.toString());
int month=shengri.get(Calendar.MONTH);
int day=shengri.get(Calendar.DAY_OF_WEEK);
System.out.print(month);

Student jess=new Student();
jess.name="Jess";
jess.name="Jay";
jess.sayHello();
	}


}