import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;



public class StringToList {
public static void main(String[] args) {

	 String s = "{\"total\":3,\"customer\":[ {\"lxdh\":\"123\",\"xm\":\"����\",\"zjhm\":\"1234\",\"_updates\":\"1\"},{\"lxdh\":\"123\",\"xm\":\"����\",\"zjhm\":\"1234\",\"_updates\":\"2\"}]}";
	    //��json�ַ���תΪmap����
	    JSONObject jsonObject = JSONObject.parseObject(s);
	   Map<String,Object> map = (Map<String, Object>)jsonObject;
	    //��Map�з�������ṹ���ַ���תΪlist����list��������Map
	    System.out.println("list="+map);
	    String s2 = map.get("customer")+"";
	    System.out.println(s2);
	    List<Map> list = JSONObject.parseArray(s2, Map.class);//����ĵڶ�������Ҳ�����ö�Ӧ���Զ���javaBean.class
	    //�������е�map��ȡ��ÿ������ֵ
	    for (Map item : list) {
	       System.out.println(item.get("_updates"));
	    	//System.out.println("get_update"+item.get_update());
	    }
	    
	    
	    
}
}
