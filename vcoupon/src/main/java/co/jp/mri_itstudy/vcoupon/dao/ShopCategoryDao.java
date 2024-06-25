package co.jp.mri_itstudy.vcoupon.dao;

import java.util.ArrayList;
import java.util.List;

import co.jp.mri_itstudy.vcoupon.entity.ShopCategoryEntity;

public interface ShopCategoryDao {
    public ArrayList<ShopCategoryEntity> getShopCategories();
}
