package com.my.core.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @Description: 运单记录实体类
 * @Company: tq
 * @create Author: 黄新强
 * @create Date: 2015-3-17 下午02:31:06
 * @version 1.0
 */
@Entity
@Table(name="t_waybll")
public class WayBill {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="pk_id")
    private int id;
    /**
     * 业务员
     */
    @ManyToOne
    @JoinColumn(name="fk_user_id")
    private User user;
    /**
     * 价格
     */
    @ManyToOne
    @JoinColumn(name="fk_handling_cost_id")
    private HandlingCost handlingcost;
    /**
     * 运单号
     */
    @Column(name="awb",length = 20,nullable = false)
    private String awb;
    /**
     * 重量
     */
    @Column(name="weight",nullable = false)
    private double weight;
    /**
     * 地址
     */
    @Column(name="address",length = 600,nullable = false)
    private String address;
    /**
     * 订单时间
     */
    @Column(name="create_time",nullable = false)
    private long createTime;
    /**
     * 操作费
     */
    @Column(name="handling_cost")
    private double handlingCost;
    /**
     * 续重费
     */
    @Column(name="added_weight")
    private double addedWeigh;
    /**
     * 中转费
     */
    @Column(name="total")
    private double total;

    public WayBill() {
        super();
    }

    public WayBill(int id, User user, HandlingCost handlingcost, String awb,
                   double weight, String address, long createTime,
                   double handlingCost2, double addedWeigh, double total) {
        super();
        this.id = id;
        this.user = user;
        this.handlingcost = handlingcost;
        this.awb = awb;
        this.weight = weight;
        this.address = address;
        this.createTime = createTime;
        handlingCost = handlingCost2;
        this.addedWeigh = addedWeigh;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public HandlingCost getHandlingcost() {
        return handlingcost;
    }

    public void setHandlingcost(HandlingCost handlingcost) {
        this.handlingcost = handlingcost;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public double getHandlingCost() {
        return handlingCost;
    }

    public void setHandlingCost(double handlingCost) {
        this.handlingCost = handlingCost;
    }

    public double getAddedWeigh() {
        return addedWeigh;
    }

    public void setAddedWeigh(double addedWeigh) {
        this.addedWeigh = addedWeigh;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}