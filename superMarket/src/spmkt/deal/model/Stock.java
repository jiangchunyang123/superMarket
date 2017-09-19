package spmkt.deal.model;

import java.math.BigDecimal;
import java.util.Date;

public class Stock {

    private String filepath;
    private Long id;
    private String sellstate;
    private String cname1;
    private String cname2;
    private BigDecimal inprice;
    private Date indate;
    private BigDecimal sellingprice;
    private BigDecimal outprice;
    private Date outdate;
    private String factory;
    private String barcode;
    private String name;
private String type1;

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public BigDecimal getInprice() {
        return inprice;
    }

    public void setInprice(BigDecimal inprice) {
        this.inprice = inprice;
    }

    public BigDecimal getOutprice() {
        return outprice;
    }

    public void setOutprice(BigDecimal outprice) {
        this.outprice = outprice;
    }

    public BigDecimal getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(BigDecimal sellingprice) {
        this.sellingprice = sellingprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSellstate() {
        return sellstate;
    }

    public void setSellstate(String sellstate) {
        this.sellstate = sellstate == null ? null : sellstate.trim();
    }

    public String getCname1() {
        return cname1;
    }

    public void setCname1(String cname1) {
        this.cname1 = cname1 == null ? null : cname1.trim();
    }

    public String getCname2() {
        return cname2;
    }

    public void setCname2(String cname2) {
        this.cname2 = cname2 == null ? null : cname2.trim();
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }
}