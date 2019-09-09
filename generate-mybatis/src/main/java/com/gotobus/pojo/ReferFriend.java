package com.gotobus.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ivy_refer_friend_info")
public class ReferFriend {
    @Id
    private Integer id;

    @Column(name = "invite_user_id")
    private Integer inviteUserId;

    @Column(name = "be_invite_user_id")
    private Integer beInviteUserId;

    @Column(name = "create_date")
    private Date createDate;

    private Double amount;

    private Integer status;

    @Column(name = "order_id")
    private Integer orderId;

    private Integer website;

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
     * @return invite_user_id
     */
    public Integer getInviteUserId() {
        return inviteUserId;
    }

    /**
     * @param inviteUserId
     */
    public void setInviteUserId(Integer inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    /**
     * @return be_invite_user_id
     */
    public Integer getBeInviteUserId() {
        return beInviteUserId;
    }

    /**
     * @param beInviteUserId
     */
    public void setBeInviteUserId(Integer beInviteUserId) {
        this.beInviteUserId = beInviteUserId;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return website
     */
    public Integer getWebsite() {
        return website;
    }

    /**
     * @param website
     */
    public void setWebsite(Integer website) {
        this.website = website;
    }
}