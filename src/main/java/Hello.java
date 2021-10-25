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
			System.out.println("parseInt2大");
		}else {
			System.out.println("parseInt大");
		}
		System.out.println("parseInt="+parseInt);
		System.out.println("===============1121");
		 String s = "{\"total\":3,\"customer\":[ {\"lxdh\":\"123\",\"xm\":\"张三\",\"zjhm\":\"1234\",\"_updates\":\"1\"},{\"lxdh\":\"123\",\"xm\":\"张三\",\"zjhm\":\"1234\",\"_updates\":\"2\"}]}";
		    //将json字符串转为map对象
		    JSONObject jsonObject = JSONObject.parseObject(s);
		   Map<String,Object> map = (Map<String, Object>)jsonObject;
		    //将Map中符合数组结构的字符串转为list对象，list对象中是Map
		    System.out.println("list="+map);
		    String s2 = map.get("customer").toString();
		    System.out.println(s2);
		    List<Map> list = JSONObject.parseArray(s2, Map.class);//这里的第二个参数也可以用对应的自定义javaBean.class
		    //遍历其中的map，取出每个属性值
		    for (Map item : list) {
		       System.out.println(item.get("_updates"));
		    	//System.out.println("get_update"+item.get_update());
		    }
		    System.out.println("=================");
		    
		    Map map2 = new HashMap();
	        map2.put("success", "true");
	       // map.put("phoneList", list);
	        map2.put("currentUser", "zhang");

	        //net.sf.json.JSONObject 将Map转换为JSON方法
	        //JSONObject json = JSONObject.fromObject(map);

	        //org.json.JSONObject 将Map转换为JSON方法
	        JSONObject json =new JSONObject(map2);
	        System.out.println("json="+json);
	    
	        System.out.println("=================");
	        
	        List<PhoneNum> list2 = new ArrayList<>();
	        list2.add(new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","1"));
	        HashMap<String, Object> hashMap = new HashMap<String,Object>();
	        hashMap.put("2018",list2);
	        hashMap.put("2019",new String("asd"));
	        
	        for(Map.Entry vap: hashMap.entrySet()) {
	        	System.out.println(vap.getValue());
	        }
	        System.out.println("=================list对象变成json");
	        List<PhoneNum> personList = new ArrayList<>();
	        personList.add(new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","1"));
	        personList.add(new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","1"));
	        personList.add(new PhoneNum("1","123","1234","1","2","1","2","1","张三","1","1","1","1"));
	        int size = personList.size();
	        String s3="total 3";
	        Object obj2 = JSONArray.toJSON(personList);
	        String json2 = obj2.toString();
	        String jsonString = JSON.toJSONString(s3);
	        String string = new String(jsonString+json2);
	        System.out.println(string);
	        System.out.println("将List<Person>转成json:" + json2);
	        
	      
	        
	      
	}
}
