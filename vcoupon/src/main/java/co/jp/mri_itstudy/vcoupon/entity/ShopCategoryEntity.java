package co.jp.mri_itstudy.vcoupon.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ShopCategoryEntity {
    private Integer categoryId;
    private String categoryName;
    private String categoryDescription;
    private Timestamp categoryCtime;
    private Integer categoryStatus;
    private String categoryImg;
}