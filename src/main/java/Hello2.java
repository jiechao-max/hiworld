import net.sf.json.JSONObject;

public class Hello2 {//��java����ת��Ϊjson����

	 public Hello2() {
		 System.out.println("�þ�û�ô�����Ŷ");
		  } 
	 public String Object2Json(Object obj){ 
		    JSONObject json = JSONObject.fromObject(obj);//��java����ת��Ϊjson���� 
		    String str = json.toString();//��json����ת��Ϊ�ַ��� 
		      
		    return str; 
		  } 
}
