package co.jp.mri_itstudy.vcoupon.entity;

import lombok.Data;

@Data
public class CouponShopEntity extends CouponEntity {
    String shopName;
    String discountPriceInfo;
}
