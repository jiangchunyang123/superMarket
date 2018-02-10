package QRCode.product.model;

import java.util.Date;

public class Prod {
    private Integer id;

    private String prodname;

    private String prodcode;

    private Date createtime;

    private Integer factoryid;

    private String registercode;

    private String registername;

    private Integer pesticidetype;

    private Integer toxicity;

    private Integer liquidtype;

    private Short percent;

    private Date startdate;

    private Date enddate;

    private String remark;

    private Integer applicableobject;

    private Integer protectobject;

    private String dosagemessage;

    private Integer usemethod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname == null ? null : prodname.trim();
    }

    public String getProdcode() {
        return prodcode;
    }

    public void setProdcode(String prodcode) {
        this.prodcode = prodcode == null ? null : prodcode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(Integer factoryid) {
        this.factoryid = factoryid;
    }

    public String getRegistercode() {
        return registercode;
    }

    public void setRegistercode(String registercode) {
        this.registercode = registercode == null ? null : registercode.trim();
    }

    public String getRegistername() {
        return registername;
    }

    public void setRegistername(String registername) {
        this.registername = registername == null ? null : registername.trim();
    }

    public Integer getPesticidetype() {
        return pesticidetype;
    }

    public void setPesticidetype(Integer pesticidetype) {
        this.pesticidetype = pesticidetype;
    }

    public Integer getToxicity() {
        return toxicity;
    }

    public void setToxicity(Integer toxicity) {
        this.toxicity = toxicity;
    }

    public Integer getLiquidtype() {
        return liquidtype;
    }

    public void setLiquidtype(Integer liquidtype) {
        this.liquidtype = liquidtype;
    }

    public Short getPercent() {
        return percent;
    }

    public void setPercent(Short percent) {
        this.percent = percent;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getApplicableobject() {
        return applicableobject;
    }

    public void setApplicableobject(Integer applicableobject) {
        this.applicableobject = applicableobject;
    }

    public Integer getProtectobject() {
        return protectobject;
    }

    public void setProtectobject(Integer protectobject) {
        this.protectobject = protectobject;
    }

    public String getDosagemessage() {
        return dosagemessage;
    }

    public void setDosagemessage(String dosagemessage) {
        this.dosagemessage = dosagemessage == null ? null : dosagemessage.trim();
    }

    public Integer getUsemethod() {
        return usemethod;
    }

    public void setUsemethod(Integer usemethod) {
        this.usemethod = usemethod;
    }
}