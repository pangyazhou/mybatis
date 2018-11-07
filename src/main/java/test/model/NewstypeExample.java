package test.model;

import java.util.ArrayList;
import java.util.List;

public class NewstypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table newstype
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table newstype
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table newstype
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public NewstypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newstype
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table newstype
     *
     * @mbg.generated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typename is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typename is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typename =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typename <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typename >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typename >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typename <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typename <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typename like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typename not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typename in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typename not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typename between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typename not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andFoldernameIsNull() {
            addCriterion("foldername is null");
            return (Criteria) this;
        }

        public Criteria andFoldernameIsNotNull() {
            addCriterion("foldername is not null");
            return (Criteria) this;
        }

        public Criteria andFoldernameEqualTo(String value) {
            addCriterion("foldername =", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameNotEqualTo(String value) {
            addCriterion("foldername <>", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameGreaterThan(String value) {
            addCriterion("foldername >", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameGreaterThanOrEqualTo(String value) {
            addCriterion("foldername >=", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameLessThan(String value) {
            addCriterion("foldername <", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameLessThanOrEqualTo(String value) {
            addCriterion("foldername <=", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameLike(String value) {
            addCriterion("foldername like", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameNotLike(String value) {
            addCriterion("foldername not like", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameIn(List<String> values) {
            addCriterion("foldername in", values, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameNotIn(List<String> values) {
            addCriterion("foldername not in", values, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameBetween(String value1, String value2) {
            addCriterion("foldername between", value1, value2, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameNotBetween(String value1, String value2) {
            addCriterion("foldername not between", value1, value2, "foldername");
            return (Criteria) this;
        }

        public Criteria andTypetempIsNull() {
            addCriterion("typetemp is null");
            return (Criteria) this;
        }

        public Criteria andTypetempIsNotNull() {
            addCriterion("typetemp is not null");
            return (Criteria) this;
        }

        public Criteria andTypetempEqualTo(String value) {
            addCriterion("typetemp =", value, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempNotEqualTo(String value) {
            addCriterion("typetemp <>", value, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempGreaterThan(String value) {
            addCriterion("typetemp >", value, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempGreaterThanOrEqualTo(String value) {
            addCriterion("typetemp >=", value, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempLessThan(String value) {
            addCriterion("typetemp <", value, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempLessThanOrEqualTo(String value) {
            addCriterion("typetemp <=", value, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempLike(String value) {
            addCriterion("typetemp like", value, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempNotLike(String value) {
            addCriterion("typetemp not like", value, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempIn(List<String> values) {
            addCriterion("typetemp in", values, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempNotIn(List<String> values) {
            addCriterion("typetemp not in", values, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempBetween(String value1, String value2) {
            addCriterion("typetemp between", value1, value2, "typetemp");
            return (Criteria) this;
        }

        public Criteria andTypetempNotBetween(String value1, String value2) {
            addCriterion("typetemp not between", value1, value2, "typetemp");
            return (Criteria) this;
        }

        public Criteria andContenttempIsNull() {
            addCriterion("contenttemp is null");
            return (Criteria) this;
        }

        public Criteria andContenttempIsNotNull() {
            addCriterion("contenttemp is not null");
            return (Criteria) this;
        }

        public Criteria andContenttempEqualTo(String value) {
            addCriterion("contenttemp =", value, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempNotEqualTo(String value) {
            addCriterion("contenttemp <>", value, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempGreaterThan(String value) {
            addCriterion("contenttemp >", value, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempGreaterThanOrEqualTo(String value) {
            addCriterion("contenttemp >=", value, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempLessThan(String value) {
            addCriterion("contenttemp <", value, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempLessThanOrEqualTo(String value) {
            addCriterion("contenttemp <=", value, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempLike(String value) {
            addCriterion("contenttemp like", value, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempNotLike(String value) {
            addCriterion("contenttemp not like", value, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempIn(List<String> values) {
            addCriterion("contenttemp in", values, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempNotIn(List<String> values) {
            addCriterion("contenttemp not in", values, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempBetween(String value1, String value2) {
            addCriterion("contenttemp between", value1, value2, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andContenttempNotBetween(String value1, String value2) {
            addCriterion("contenttemp not between", value1, value2, "contenttemp");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNull() {
            addCriterion("classtype is null");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNotNull() {
            addCriterion("classtype is not null");
            return (Criteria) this;
        }

        public Criteria andClasstypeEqualTo(Byte value) {
            addCriterion("classtype =", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotEqualTo(Byte value) {
            addCriterion("classtype <>", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThan(Byte value) {
            addCriterion("classtype >", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("classtype >=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThan(Byte value) {
            addCriterion("classtype <", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThanOrEqualTo(Byte value) {
            addCriterion("classtype <=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeIn(List<Byte> values) {
            addCriterion("classtype in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotIn(List<Byte> values) {
            addCriterion("classtype not in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeBetween(Byte value1, Byte value2) {
            addCriterion("classtype between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotBetween(Byte value1, Byte value2) {
            addCriterion("classtype not between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeycontentIsNull() {
            addCriterion("keycontent is null");
            return (Criteria) this;
        }

        public Criteria andKeycontentIsNotNull() {
            addCriterion("keycontent is not null");
            return (Criteria) this;
        }

        public Criteria andKeycontentEqualTo(String value) {
            addCriterion("keycontent =", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentNotEqualTo(String value) {
            addCriterion("keycontent <>", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentGreaterThan(String value) {
            addCriterion("keycontent >", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentGreaterThanOrEqualTo(String value) {
            addCriterion("keycontent >=", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentLessThan(String value) {
            addCriterion("keycontent <", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentLessThanOrEqualTo(String value) {
            addCriterion("keycontent <=", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentLike(String value) {
            addCriterion("keycontent like", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentNotLike(String value) {
            addCriterion("keycontent not like", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentIn(List<String> values) {
            addCriterion("keycontent in", values, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentNotIn(List<String> values) {
            addCriterion("keycontent not in", values, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentBetween(String value1, String value2) {
            addCriterion("keycontent between", value1, value2, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentNotBetween(String value1, String value2) {
            addCriterion("keycontent not between", value1, value2, "keycontent");
            return (Criteria) this;
        }

        public Criteria andPaixuIsNull() {
            addCriterion("paixu is null");
            return (Criteria) this;
        }

        public Criteria andPaixuIsNotNull() {
            addCriterion("paixu is not null");
            return (Criteria) this;
        }

        public Criteria andPaixuEqualTo(Integer value) {
            addCriterion("paixu =", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotEqualTo(Integer value) {
            addCriterion("paixu <>", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuGreaterThan(Integer value) {
            addCriterion("paixu >", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuGreaterThanOrEqualTo(Integer value) {
            addCriterion("paixu >=", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuLessThan(Integer value) {
            addCriterion("paixu <", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuLessThanOrEqualTo(Integer value) {
            addCriterion("paixu <=", value, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuIn(List<Integer> values) {
            addCriterion("paixu in", values, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotIn(List<Integer> values) {
            addCriterion("paixu not in", values, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuBetween(Integer value1, Integer value2) {
            addCriterion("paixu between", value1, value2, "paixu");
            return (Criteria) this;
        }

        public Criteria andPaixuNotBetween(Integer value1, Integer value2) {
            addCriterion("paixu not between", value1, value2, "paixu");
            return (Criteria) this;
        }

        public Criteria andPicsifIsNull() {
            addCriterion("picsif is null");
            return (Criteria) this;
        }

        public Criteria andPicsifIsNotNull() {
            addCriterion("picsif is not null");
            return (Criteria) this;
        }

        public Criteria andPicsifEqualTo(Boolean value) {
            addCriterion("picsif =", value, "picsif");
            return (Criteria) this;
        }

        public Criteria andPicsifNotEqualTo(Boolean value) {
            addCriterion("picsif <>", value, "picsif");
            return (Criteria) this;
        }

        public Criteria andPicsifGreaterThan(Boolean value) {
            addCriterion("picsif >", value, "picsif");
            return (Criteria) this;
        }

        public Criteria andPicsifGreaterThanOrEqualTo(Boolean value) {
            addCriterion("picsif >=", value, "picsif");
            return (Criteria) this;
        }

        public Criteria andPicsifLessThan(Boolean value) {
            addCriterion("picsif <", value, "picsif");
            return (Criteria) this;
        }

        public Criteria andPicsifLessThanOrEqualTo(Boolean value) {
            addCriterion("picsif <=", value, "picsif");
            return (Criteria) this;
        }

        public Criteria andPicsifIn(List<Boolean> values) {
            addCriterion("picsif in", values, "picsif");
            return (Criteria) this;
        }

        public Criteria andPicsifNotIn(List<Boolean> values) {
            addCriterion("picsif not in", values, "picsif");
            return (Criteria) this;
        }

        public Criteria andPicsifBetween(Boolean value1, Boolean value2) {
            addCriterion("picsif between", value1, value2, "picsif");
            return (Criteria) this;
        }

        public Criteria andPicsifNotBetween(Boolean value1, Boolean value2) {
            addCriterion("picsif not between", value1, value2, "picsif");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andJibieIsNull() {
            addCriterion("jibie is null");
            return (Criteria) this;
        }

        public Criteria andJibieIsNotNull() {
            addCriterion("jibie is not null");
            return (Criteria) this;
        }

        public Criteria andJibieEqualTo(Byte value) {
            addCriterion("jibie =", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieNotEqualTo(Byte value) {
            addCriterion("jibie <>", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieGreaterThan(Byte value) {
            addCriterion("jibie >", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieGreaterThanOrEqualTo(Byte value) {
            addCriterion("jibie >=", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieLessThan(Byte value) {
            addCriterion("jibie <", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieLessThanOrEqualTo(Byte value) {
            addCriterion("jibie <=", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieIn(List<Byte> values) {
            addCriterion("jibie in", values, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieNotIn(List<Byte> values) {
            addCriterion("jibie not in", values, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieBetween(Byte value1, Byte value2) {
            addCriterion("jibie between", value1, value2, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieNotBetween(Byte value1, Byte value2) {
            addCriterion("jibie not between", value1, value2, "jibie");
            return (Criteria) this;
        }

        public Criteria andLinkaddrIsNull() {
            addCriterion("linkaddr is null");
            return (Criteria) this;
        }

        public Criteria andLinkaddrIsNotNull() {
            addCriterion("linkaddr is not null");
            return (Criteria) this;
        }

        public Criteria andLinkaddrEqualTo(Boolean value) {
            addCriterion("linkaddr =", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrNotEqualTo(Boolean value) {
            addCriterion("linkaddr <>", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrGreaterThan(Boolean value) {
            addCriterion("linkaddr >", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrGreaterThanOrEqualTo(Boolean value) {
            addCriterion("linkaddr >=", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrLessThan(Boolean value) {
            addCriterion("linkaddr <", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrLessThanOrEqualTo(Boolean value) {
            addCriterion("linkaddr <=", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrIn(List<Boolean> values) {
            addCriterion("linkaddr in", values, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrNotIn(List<Boolean> values) {
            addCriterion("linkaddr not in", values, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrBetween(Boolean value1, Boolean value2) {
            addCriterion("linkaddr between", value1, value2, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrNotBetween(Boolean value1, Boolean value2) {
            addCriterion("linkaddr not between", value1, value2, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andTypelinkIsNull() {
            addCriterion("typelink is null");
            return (Criteria) this;
        }

        public Criteria andTypelinkIsNotNull() {
            addCriterion("typelink is not null");
            return (Criteria) this;
        }

        public Criteria andTypelinkEqualTo(String value) {
            addCriterion("typelink =", value, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkNotEqualTo(String value) {
            addCriterion("typelink <>", value, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkGreaterThan(String value) {
            addCriterion("typelink >", value, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkGreaterThanOrEqualTo(String value) {
            addCriterion("typelink >=", value, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkLessThan(String value) {
            addCriterion("typelink <", value, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkLessThanOrEqualTo(String value) {
            addCriterion("typelink <=", value, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkLike(String value) {
            addCriterion("typelink like", value, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkNotLike(String value) {
            addCriterion("typelink not like", value, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkIn(List<String> values) {
            addCriterion("typelink in", values, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkNotIn(List<String> values) {
            addCriterion("typelink not in", values, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkBetween(String value1, String value2) {
            addCriterion("typelink between", value1, value2, "typelink");
            return (Criteria) this;
        }

        public Criteria andTypelinkNotBetween(String value1, String value2) {
            addCriterion("typelink not between", value1, value2, "typelink");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table newstype
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table newstype
     *
     * @mbg.generated
     */
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