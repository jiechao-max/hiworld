import net.sf.json.JSONObject;

public class Hello2 {
	 public Hello2() { 

		  } 
	 public String Object2Json(Object obj){ 
		    JSONObject json = JSONObject.fromObject(obj);//��java����ת��Ϊjson���� 
		    String str = json.toString();//��json����ת��Ϊ�ַ��� 
		      
		    return str; 
		  } 
}
