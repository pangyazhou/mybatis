package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ads
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Ads {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.typeid
     *
     * @mbg.generated
     */
    private Integer typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.pic
     *
     * @mbg.generated
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.paixu
     *
     * @mbg.generated
     */
    private Integer paixu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.ifshow
     *
     * @mbg.generated
     */
    private Boolean ifshow;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.id
     *
     * @return the value of ads.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.id
     *
     * @param id the value for ads.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.title
     *
     * @return the value of ads.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.title
     *
     * @param title the value for ads.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.typeid
     *
     * @return the value of ads.typeid
     *
     * @mbg.generated
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.typeid
     *
     * @param typeid the value for ads.typeid
     *
     * @mbg.generated
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.pic
     *
     * @return the value of ads.pic
     *
     * @mbg.generated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.pic
     *
     * @param pic the value for ads.pic
     *
     * @mbg.generated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.paixu
     *
     * @return the value of ads.paixu
     *
     * @mbg.generated
     */
    public Integer getPaixu() {
        return paixu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.paixu
     *
     * @param paixu the value for ads.paixu
     *
     * @mbg.generated
     */
    public void setPaixu(Integer paixu) {
        this.paixu = paixu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.url
     *
     * @return the value of ads.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.url
     *
     * @param url the value for ads.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.ifshow
     *
     * @return the value of ads.ifshow
     *
     * @mbg.generated
     */
    public Boolean getIfshow() {
        return ifshow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.ifshow
     *
     * @param ifshow the value for ads.ifshow
     *
     * @mbg.generated
     */
    public void setIfshow(Boolean ifshow) {
        this.ifshow = ifshow;
    }
}