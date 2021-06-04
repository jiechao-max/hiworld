import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;



public class StringToList {
public static void main(String[] args) {

	 String s = "{\"total\":3,\"customer\":[ {\"lxdh\":\"123\",\"xm\":\"张三\",\"zjhm\":\"1234\",\"_updates\":\"1\"},{\"lxdh\":\"123\",\"xm\":\"张三\",\"zjhm\":\"1234\",\"_updates\":\"2\"}]}";
	    //将json字符串转为map对象
	    JSONObject jsonObject = JSONObject.parseObject(s);
	   Map<String,Object> map = (Map<String, Object>)jsonObject;
	    //将Map中符合数组结构的字符串转为list对象，list对象中是Map
	    System.out.println("list="+map);
	    String s2 = map.get("customer")+"";
	    System.out.println(s2);
	    List<Map> list = JSONObject.parseArray(s2, Map.class);//这里的第二个参数也可以用对应的自定义javaBean.class
	    //遍历其中的map，取出每个属性值
	    for (Map item : list) {
	       System.out.println(item.get("_updates"));
	    	//System.out.println("get_update"+item.get_update());
	    }
	    
	    
	    
}
}
