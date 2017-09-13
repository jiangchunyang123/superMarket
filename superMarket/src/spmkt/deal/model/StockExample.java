package src.spmkt.deal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filePath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filePath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filePath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filePath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filePath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filePath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filePath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filePath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filePath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filePath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filePath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filePath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filePath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filePath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSellstateIsNull() {
            addCriterion("sellState is null");
            return (Criteria) this;
        }

        public Criteria andSellstateIsNotNull() {
            addCriterion("sellState is not null");
            return (Criteria) this;
        }

        public Criteria andSellstateEqualTo(String value) {
            addCriterion("sellState =", value, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateNotEqualTo(String value) {
            addCriterion("sellState <>", value, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateGreaterThan(String value) {
            addCriterion("sellState >", value, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateGreaterThanOrEqualTo(String value) {
            addCriterion("sellState >=", value, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateLessThan(String value) {
            addCriterion("sellState <", value, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateLessThanOrEqualTo(String value) {
            addCriterion("sellState <=", value, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateLike(String value) {
            addCriterion("sellState like", value, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateNotLike(String value) {
            addCriterion("sellState not like", value, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateIn(List<String> values) {
            addCriterion("sellState in", values, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateNotIn(List<String> values) {
            addCriterion("sellState not in", values, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateBetween(String value1, String value2) {
            addCriterion("sellState between", value1, value2, "sellstate");
            return (Criteria) this;
        }

        public Criteria andSellstateNotBetween(String value1, String value2) {
            addCriterion("sellState not between", value1, value2, "sellstate");
            return (Criteria) this;
        }

        public Criteria andCname1IsNull() {
            addCriterion("cName1 is null");
            return (Criteria) this;
        }

        public Criteria andCname1IsNotNull() {
            addCriterion("cName1 is not null");
            return (Criteria) this;
        }

        public Criteria andCname1EqualTo(String value) {
            addCriterion("cName1 =", value, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1NotEqualTo(String value) {
            addCriterion("cName1 <>", value, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1GreaterThan(String value) {
            addCriterion("cName1 >", value, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1GreaterThanOrEqualTo(String value) {
            addCriterion("cName1 >=", value, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1LessThan(String value) {
            addCriterion("cName1 <", value, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1LessThanOrEqualTo(String value) {
            addCriterion("cName1 <=", value, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1Like(String value) {
            addCriterion("cName1 like", value, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1NotLike(String value) {
            addCriterion("cName1 not like", value, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1In(List<String> values) {
            addCriterion("cName1 in", values, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1NotIn(List<String> values) {
            addCriterion("cName1 not in", values, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1Between(String value1, String value2) {
            addCriterion("cName1 between", value1, value2, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname1NotBetween(String value1, String value2) {
            addCriterion("cName1 not between", value1, value2, "cname1");
            return (Criteria) this;
        }

        public Criteria andCname2IsNull() {
            addCriterion("cName2 is null");
            return (Criteria) this;
        }

        public Criteria andCname2IsNotNull() {
            addCriterion("cName2 is not null");
            return (Criteria) this;
        }

        public Criteria andCname2EqualTo(String value) {
            addCriterion("cName2 =", value, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2NotEqualTo(String value) {
            addCriterion("cName2 <>", value, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2GreaterThan(String value) {
            addCriterion("cName2 >", value, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2GreaterThanOrEqualTo(String value) {
            addCriterion("cName2 >=", value, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2LessThan(String value) {
            addCriterion("cName2 <", value, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2LessThanOrEqualTo(String value) {
            addCriterion("cName2 <=", value, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2Like(String value) {
            addCriterion("cName2 like", value, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2NotLike(String value) {
            addCriterion("cName2 not like", value, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2In(List<String> values) {
            addCriterion("cName2 in", values, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2NotIn(List<String> values) {
            addCriterion("cName2 not in", values, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2Between(String value1, String value2) {
            addCriterion("cName2 between", value1, value2, "cname2");
            return (Criteria) this;
        }

        public Criteria andCname2NotBetween(String value1, String value2) {
            addCriterion("cName2 not between", value1, value2, "cname2");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNull() {
            addCriterion("inPrice is null");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNotNull() {
            addCriterion("inPrice is not null");
            return (Criteria) this;
        }

        public Criteria andInpriceEqualTo(Long value) {
            addCriterion("inPrice =", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotEqualTo(Long value) {
            addCriterion("inPrice <>", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThan(Long value) {
            addCriterion("inPrice >", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("inPrice >=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThan(Long value) {
            addCriterion("inPrice <", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThanOrEqualTo(Long value) {
            addCriterion("inPrice <=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceIn(List<Long> values) {
            addCriterion("inPrice in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotIn(List<Long> values) {
            addCriterion("inPrice not in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceBetween(Long value1, Long value2) {
            addCriterion("inPrice between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotBetween(Long value1, Long value2) {
            addCriterion("inPrice not between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andIndateIsNull() {
            addCriterion("inDate is null");
            return (Criteria) this;
        }

        public Criteria andIndateIsNotNull() {
            addCriterion("inDate is not null");
            return (Criteria) this;
        }

        public Criteria andIndateEqualTo(Date value) {
            addCriterionForJDBCDate("inDate =", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("inDate <>", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThan(Date value) {
            addCriterionForJDBCDate("inDate >", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inDate >=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThan(Date value) {
            addCriterionForJDBCDate("inDate <", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inDate <=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateIn(List<Date> values) {
            addCriterionForJDBCDate("inDate in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("inDate not in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inDate between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inDate not between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNull() {
            addCriterion("sellingPrice is null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNotNull() {
            addCriterion("sellingPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceEqualTo(Long value) {
            addCriterion("sellingPrice =", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotEqualTo(Long value) {
            addCriterion("sellingPrice <>", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThan(Long value) {
            addCriterion("sellingPrice >", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("sellingPrice >=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThan(Long value) {
            addCriterion("sellingPrice <", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThanOrEqualTo(Long value) {
            addCriterion("sellingPrice <=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIn(List<Long> values) {
            addCriterion("sellingPrice in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotIn(List<Long> values) {
            addCriterion("sellingPrice not in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceBetween(Long value1, Long value2) {
            addCriterion("sellingPrice between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotBetween(Long value1, Long value2) {
            addCriterion("sellingPrice not between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceIsNull() {
            addCriterion("outPrice is null");
            return (Criteria) this;
        }

        public Criteria andOutpriceIsNotNull() {
            addCriterion("outPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOutpriceEqualTo(Long value) {
            addCriterion("outPrice =", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceNotEqualTo(Long value) {
            addCriterion("outPrice <>", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceGreaterThan(Long value) {
            addCriterion("outPrice >", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("outPrice >=", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceLessThan(Long value) {
            addCriterion("outPrice <", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceLessThanOrEqualTo(Long value) {
            addCriterion("outPrice <=", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceIn(List<Long> values) {
            addCriterion("outPrice in", values, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceNotIn(List<Long> values) {
            addCriterion("outPrice not in", values, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceBetween(Long value1, Long value2) {
            addCriterion("outPrice between", value1, value2, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceNotBetween(Long value1, Long value2) {
            addCriterion("outPrice not between", value1, value2, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutdateIsNull() {
            addCriterion("outDate is null");
            return (Criteria) this;
        }

        public Criteria andOutdateIsNotNull() {
            addCriterion("outDate is not null");
            return (Criteria) this;
        }

        public Criteria andOutdateEqualTo(Date value) {
            addCriterionForJDBCDate("outDate =", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("outDate <>", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThan(Date value) {
            addCriterionForJDBCDate("outDate >", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outDate >=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThan(Date value) {
            addCriterionForJDBCDate("outDate <", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outDate <=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateIn(List<Date> values) {
            addCriterionForJDBCDate("outDate in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("outDate not in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outDate between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outDate not between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNull() {
            addCriterion("factory is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("factory is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("factory =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("factory <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("factory >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("factory >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("factory <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("factory <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("factory like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("factory not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("factory in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("factory not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("factory between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("factory not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}