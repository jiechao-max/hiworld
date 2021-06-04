

import java.util.List;

import com.alibaba.fastjson.JSONArray;

public class FanHuiInfo {

	private int total;
	private List<PhoneNum> phonelist;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<PhoneNum> getPhonelist() {
		return phonelist;
	}
	public void setPhonelist(List<PhoneNum> phonelist) {
		this.phonelist = phonelist;
	}
	@Override
	public String toString() {
		return "FanHuiInfo [total=" + total + ", phonelist=" + phonelist + "]";
	}
	public FanHuiInfo(int total, List<PhoneNum> phonelist) {
		super();
		this.total = total;
		this.phonelist = phonelist;
	}
	public FanHuiInfo() {
		super();
	}
	
	
	
}
