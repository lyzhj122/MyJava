import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
class demo{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个数\n");
		int a = scan.nextInt();
		System.out.printf("%d 的平方是: %d",a,a*a);
		scan.close();

int result = 0;

for (int i=1;i<10;i++){
	result +=i;
}
System.out.println("\nresult="+result);
int[] b=new int[]{3,4,5};
/*System.out.print(b[2]);*/
for (int j=0;j<b.length;j++){
System.out.printf("b=%d\n",b[j]);
}
int[] ages=new int[]{11,22,33,44,55};
for(int mm : ages){
	System.out.println(mm);
}
	}
}