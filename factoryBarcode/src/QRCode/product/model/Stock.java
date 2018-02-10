package QRCode.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Stock implements Serializable {
    private Integer id;

    private String name;

    private String barcode;

    private String name2;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private Date updateUser;

    private BigDecimal inPrice;

    private BigDecimal salePrice;

    private String remark;

    private Integer company;

    private Date produceDate;

    private Integer effdays;

    private Integer type1;

    private Integer type2;

    private Long remainshare;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Date updateUser) {
        this.updateUser = updateUser;
    }

    public BigDecimal getInPrice() {
        return inPrice;
    }

    public void setInPrice(BigDecimal inPrice) {
        this.inPrice = inPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Integer getEffdays() {
        return effdays;
    }

    public void setEffdays(Integer effdays) {
        this.effdays = effdays;
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
    }

    public Long getRemainshare() {
        return remainshare;
    }

    public void setRemainshare(Long remainshare) {
        this.remainshare = remainshare;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Stock other = (Stock) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getName2() == null ? other.getName2() == null : this.getName2().equals(other.getName2()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getInPrice() == null ? other.getInPrice() == null : this.getInPrice().equals(other.getInPrice()))
            && (this.getSalePrice() == null ? other.getSalePrice() == null : this.getSalePrice().equals(other.getSalePrice()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getProduceDate() == null ? other.getProduceDate() == null : this.getProduceDate().equals(other.getProduceDate()))
            && (this.getEffdays() == null ? other.getEffdays() == null : this.getEffdays().equals(other.getEffdays()))
            && (this.getType1() == null ? other.getType1() == null : this.getType1().equals(other.getType1()))
            && (this.getType2() == null ? other.getType2() == null : this.getType2().equals(other.getType2()))
            && (this.getRemainshare() == null ? other.getRemainshare() == null : this.getRemainshare().equals(other.getRemainshare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getName2() == null) ? 0 : getName2().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getInPrice() == null) ? 0 : getInPrice().hashCode());
        result = prime * result + ((getSalePrice() == null) ? 0 : getSalePrice().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getProduceDate() == null) ? 0 : getProduceDate().hashCode());
        result = prime * result + ((getEffdays() == null) ? 0 : getEffdays().hashCode());
        result = prime * result + ((getType1() == null) ? 0 : getType1().hashCode());
        result = prime * result + ((getType2() == null) ? 0 : getType2().hashCode());
        result = prime * result + ((getRemainshare() == null) ? 0 : getRemainshare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", barcode=").append(barcode);
        sb.append(", name2=").append(name2);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", inPrice=").append(inPrice);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", remark=").append(remark);
        sb.append(", company=").append(company);
        sb.append(", produceDate=").append(produceDate);
        sb.append(", effdays=").append(effdays);
        sb.append(", type1=").append(type1);
        sb.append(", type2=").append(type2);
        sb.append(", remainshare=").append(remainshare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}