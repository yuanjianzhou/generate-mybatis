package com.gotobus.pojo;

import javax.persistence.*;

@Table(name = "ivy_issue_category_en")
public class IssueCategoryEn {
    @Id
    private Integer id;

    private String name;

    @Column(name = "url_name")
    private String urlName;

    private String description;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}