package co.jp.mri_itstudy.vcoupon.service.Imp;

import co.jp.mri_itstudy.vcoupon.dao.ShopCategoryDao;
import co.jp.mri_itstudy.vcoupon.entity.ShopCategoryEntity;
import co.jp.mri_itstudy.vcoupon.service.ShopCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {

    @Autowired
    ShopCategoryDao shopCategoryDao;

    @Override
    public ArrayList<ShopCategoryEntity> getShopCategories() {
        return shopCategoryDao.getShopCategories();
    }
}