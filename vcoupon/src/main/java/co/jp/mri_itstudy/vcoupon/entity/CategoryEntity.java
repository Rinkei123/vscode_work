package co.jp.mri_itstudy.vcoupon.entity;

import lombok.Data;

@Data
public class CategoryEntity {
    int categoryId;
    String categoryName;
    String categoryDescription;
    String categoryCtime;
    int categoryStatus;
    String categoryImg;
}
