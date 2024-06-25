package co.jp.mri_itstudy.vcoupon.service;

import co.jp.mri_itstudy.vcoupon.entity.ShopCategoryEntity;

import java.util.ArrayList;


public interface ShopCategoryService {
    ArrayList<ShopCategoryEntity> getShopCategories();
}