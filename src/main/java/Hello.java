import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Hello {
	
	public static void main(String[] args) {
		String id="123411";
		String id2="3";
		int parseInt = Integer.parseInt(id);
		int parseInt2 = Integer.parseInt(id2);
		if(parseInt<parseInt2) {
			System.out.println("parseInt2��");
		}else {
			System.out.println("parseInt��");
		}
		System.out.println("parseInt="+parseInt);
		System.out.println("===============");
		 String s = "{\"total\":3,\"customer\":[ {\"lxdh\":\"123\",\"xm\":\"����\",\"zjhm\":\"1234\",\"_updates\":\"1\"},{\"lxdh\":\"123\",\"xm\":\"����\",\"zjhm\":\"1234\",\"_updates\":\"2\"}]}";
		    //��json�ַ���תΪmap����
		    JSONObject jsonObject = JSONObject.parseObject(s);
		   Map<String,Object> map = (Map<String, Object>)jsonObject;
		    //��Map�з�������ṹ���ַ���תΪlist����list��������Map
		    System.out.println("list="+map);
		    String s2 = map.get("customer").toString();
		    System.out.println(s2);
		    List<Map> list = JSONObject.parseArray(s2, Map.class);//����ĵڶ�������Ҳ�����ö�Ӧ���Զ���javaBean.class
		    //�������е�map��ȡ��ÿ������ֵ
		    for (Map item : list) {
		       System.out.println(item.get("_updates"));
		    	//System.out.println("get_update"+item.get_update());
		    }
		    System.out.println("=================");
		    
		    Map map2 = new HashMap();
	        map2.put("success", "true");
	       // map.put("phoneList", list);
	        map2.put("currentUser", "zhang");

	        //net.sf.json.JSONObject ��Mapת��ΪJSON����
	        //JSONObject json = JSONObject.fromObject(map);

	        //org.json.JSONObject ��Mapת��ΪJSON����
	        JSONObject json =new JSONObject(map2);
	        System.out.println("json="+json);
	    
	        System.out.println("=================");
	        
	        List<PhoneNum> list2 = new ArrayList<>();
	        list2.add(new PhoneNum("1","123","1234","1","2","1","2","1","����","1","1","1","1"));
	        HashMap<String, Object> hashMap = new HashMap<String,Object>();
	        hashMap.put("2018",list2);
	        hashMap.put("2019",new String("asd"));
	        
	        for(Map.Entry vap: hashMap.entrySet()) {
	        	System.out.println(vap.getValue());
	        }
	        System.out.println("=================list������json");
	        List<PhoneNum> personList = new ArrayList<>();
	        personList.add(new PhoneNum("1","123","1234","1","2","1","2","1","����","1","1","1","1"));
	        personList.add(new PhoneNum("1","123","1234","1","2","1","2","1","����","1","1","1","1"));
	        personList.add(new PhoneNum("1","123","1234","1","2","1","2","1","����","1","1","1","1"));
	        int size = personList.size();
	        String s3="total 3";
	        Object obj2 = JSONArray.toJSON(personList);
	        String json2 = obj2.toString();
	        String jsonString = JSON.toJSONString(s3);
	        String string = new String(jsonString+json2);
	        System.out.println(string);
	        System.out.println("��List<Person>ת��json:" + json2);
	        
	      
	        
	      
	}
}
