import java.util.ArrayList;
import java.util.List;

//import com.alibaba.fastjson.JSONArray;

public class JAVAtoJSON {
public static void main(String[] args) {
	 List<PhoneNum> personList = new ArrayList<>();
	  //将一个java对象转换为Json字符串 
//	PhoneNum phoneNum1 = new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","1");
//	PhoneNum phoneNum2 = new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","2");
//	PhoneNum phoneNum3 = new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","3");
//	 Hello2 cj = new Hello2(); 
	//String str1 = cj.Object2Json(phoneNum1);
	// System.out.println(str1); 输出json字符串
	 
	 personList.add(new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","1"));
     personList.add(new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","1"));
     personList.add(new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","1"));
     int size = personList.size();
	
     
   
    
   FanHuiInfo fanHuiInfo = new FanHuiInfo();
   fanHuiInfo.setTotal(size);
   fanHuiInfo.setPhonelist(personList);
 
   Hello2 cj = new Hello2(); 
   String str1 = cj.Object2Json(fanHuiInfo);
   System.out.println("str1="+str1);
}
}
