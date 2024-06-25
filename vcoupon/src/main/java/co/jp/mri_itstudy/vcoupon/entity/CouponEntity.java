package co.jp.mri_itstudy.vcoupon.entity;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CouponEntity {
    int couponId;
    String couponName;
    int couponType;
    BigDecimal couponDiscountAmount;
    BigDecimal couponMinimumPurchaseAmount;
    String couponCtime;
    String couponStartDate;
    String couponEndDate;
    int couponStatus;
    int couponQuantity;
    String couponDescription;
    String couponImg1;
    String couponImg2;
    String couponImg3;
    int couponRecommend;
    int shopId;

}
