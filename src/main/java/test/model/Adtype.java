package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table adtype
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Adtype {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column adtype.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column adtype.typename
     *
     * @mbg.generated
     */
    private String typename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column adtype.id
     *
     * @return the value of adtype.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column adtype.id
     *
     * @param id the value for adtype.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column adtype.typename
     *
     * @return the value of adtype.typename
     *
     * @mbg.generated
     */
    public String getTypename() {
        return typename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column adtype.typename
     *
     * @param typename the value for adtype.typename
     *
     * @mbg.generated
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}