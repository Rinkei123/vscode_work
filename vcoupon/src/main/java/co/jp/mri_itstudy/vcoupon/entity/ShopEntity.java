package co.jp.mri_itstudy.vcoupon.entity;

import lombok.Data;

@Data
public class ShopEntity {
    private int shopId;
    private String shopName;
    private String shopImg;
    private String shopCtime;
    private int shopStatus;
    private String shopDescription;
    private int categoryId; 
    private Integer shopCouponCount; 
    private String shopMark;
}
