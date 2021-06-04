import net.sf.json.JSONObject;

public class Hello2 {//将java对象转换为json对象

	 public Hello2() {
		 System.out.println("好久没敲代码了哦");
		  } 
	 public String Object2Json(Object obj){ 
		    JSONObject json = JSONObject.fromObject(obj);//将java对象转换为json对象 
		    String str = json.toString();//将json对象转换为字符串 
		      
		    return str; 
		  } 
}
