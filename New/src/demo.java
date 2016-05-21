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
//Calendar shengri=Calendar.getInstance();
//GregorianCalendar shengri=new GregorianCalendar();
Calendar shengri=new GregorianCalendar();
birthday=shengri.getTime();
//birthday.getMonth();
//birthday=shengri.getTime();
//System.out.println(birthday.getTime());
System.out.println(birthday);
int month=shengri.get(GregorianCalendar.MONTH);
int day=shengri.get(GregorianCalendar.DAY_OF_WEEK);
//int day=shenri.get(Calendar.DAY_OF_MONTH);
System.out.println(month);
System.out.println(day);
System.out.println("MONTH:"+shengri.get(Calendar.MONTH));

Student jess=new Student();
jess.name="Jess";
jess.name="Jay";
jess.sayHello();

//测试日期时间 ------------>
// get the supported ids for GMT-08:00 (Pacific Standard Time)
String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
// if no ids were returned, something is wrong. get out.
if (ids.length == 0)
    System.exit(0);

 // begin output
System.out.println("Current Time");

// create a Pacific Standard Time time zone
SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);

// set up rules for Daylight Saving Time
pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);

// create a GregorianCalendar with the Pacific Daylight time zone
// and the current date and time
Calendar calendar = new GregorianCalendar(pdt);
Date trialTime = new Date();
calendar.setTime(trialTime);

// print out a bunch of interesting things
System.out.println("ERA: " + calendar.get(Calendar.ERA));
System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
System.out.println("DATE: " + calendar.get(Calendar.DATE));
System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
System.out.println("DAY_OF_WEEK_IN_MONTH: "
                   + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
System.out.println("ZONE_OFFSET: "
                   + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
System.out.println("DST_OFFSET: "
                   + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));

System.out.println("Current Time, with hour reset to 3");
calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
calendar.set(Calendar.HOUR, 3);
System.out.println("ERA: " + calendar.get(Calendar.ERA));
System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
System.out.println("DATE: " + calendar.get(Calendar.DATE));
System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
System.out.println("DAY_OF_WEEK_IN_MONTH: "
                   + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
System.out.println("ZONE_OFFSET: "
       + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // in hours
System.out.println("DST_OFFSET: "
       + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000))); // in hours
	}
//<------ 测试日期时间

}