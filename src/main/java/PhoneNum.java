
public class PhoneNum {
	private String metada;
	private String lxdh;
	private String zjhm;
	private String _create;
	private String cjsj;
	private String sjly;
	private String zy_rksj;
	private String ywly;
	private String xm;
	private String yid;
	private String gxsj;
	private String _update;
	private String id;
	public String getMetada() {
		return metada;
	}
	public void setMetada(String metada) {
		this.metada = metada;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getZjhm() {
		return zjhm;
	}
	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}
	public String get_create() {
		return _create;
	}
	public void set_create(String _create) {
		this._create = _create;
	}
	public String getCjsj() {
		return cjsj;
	}
	public void setCjsj(String cjsj) {
		this.cjsj = cjsj;
	}
	public String getSjly() {
		return sjly;
	}
	public void setSjly(String sjly) {
		this.sjly = sjly;
	}
	public String getZy_rksj() {
		return zy_rksj;
	}
	public void setZy_rksj(String zy_rksj) {
		this.zy_rksj = zy_rksj;
	}
	public String getYwly() {
		return ywly;
	}
	public void setYwly(String ywly) {
		this.ywly = ywly;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getYid() {
		return yid;
	}
	public void setYid(String yid) {
		this.yid = yid;
	}
	public String getGxsj() {
		return gxsj;
	}
	public void setGxsj(String gxsj) {
		this.gxsj = gxsj;
	}
	public String get_update() {
		return _update;
	}
	public void set_update(String _update) {
		this._update = _update;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PhoneNum [metada=" + metada + ", lxdh=" + lxdh + ", zjhm=" + zjhm + ", _create=" + _create + ", cjsj="
				+ cjsj + ", sjly=" + sjly + ", zy_rksj=" + zy_rksj + ", ywly=" + ywly + ", xm=" + xm + ", yid=" + yid
				+ ", gxsj=" + gxsj + ", _update=" + _update + ", id=" + id + "]";
	}
	public PhoneNum(String metada, String lxdh, String zjhm, String _create, String cjsj, String sjly, String zy_rksj,
			String ywly, String xm, String yid, String gxsj, String _update, String id) {
		super();
		this.metada = metada;
		this.lxdh = lxdh;
		this.zjhm = zjhm;
		this._create = _create;
		this.cjsj = cjsj;
		this.sjly = sjly;
		this.zy_rksj = zy_rksj;
		this.ywly = ywly;
		this.xm = xm;
		this.yid = yid;
		this.gxsj = gxsj;
		this._update = _update;
		this.id = id;
	}
	public PhoneNum() {
		super();
	}
	
	
}
