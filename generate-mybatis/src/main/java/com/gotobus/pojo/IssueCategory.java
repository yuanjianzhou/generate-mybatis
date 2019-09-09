package com.gotobus.pojo;

import javax.persistence.*;

@Table(name = "ivy_issue_category")
public class IssueCategory {
    @Id
    private Integer id;

    @Column(name = "parent_id")
    private Integer parentId;

    private Byte website;

    private Integer rank;

    @Column(name = "icon_name")
    private String iconName;

    @Column(name = "url_name")
    private String urlName;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return website
     */
    public Byte getWebsite() {
        return website;
    }

    /**
     * @param website
     */
    public void setWebsite(Byte website) {
        this.website = website;
    }

    /**
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * @return icon_name
     */
    public String getIconName() {
        return iconName;
    }

    /**
     * @param iconName
     */
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    /**
     * @return url_name
     */
    public String getUrlName() {
        return urlName;
    }

    /**
     * @param urlName
     */
    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }
}