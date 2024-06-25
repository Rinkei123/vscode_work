package co.jp.mri_itstudy.vcoupon.service.Imp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jp.mri_itstudy.vcoupon.dao.CategoryDao;
import co.jp.mri_itstudy.vcoupon.entity.CategoryEntity;
import co.jp.mri_itstudy.vcoupon.service.CategoryService;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    CategoryDao categoryDao;

    @Override
    public ArrayList<CategoryEntity> getCategoryList() {
        ArrayList<CategoryEntity> categoryList = categoryDao.getCategoryList();
        return categoryList;
    }

}
