package co.jp.mri_itstudy.vcoupon.dao;

import java.util.ArrayList;

import co.jp.mri_itstudy.vcoupon.entity.CouponEntity;
import co.jp.mri_itstudy.vcoupon.entity.CouponShopEntity;

public interface CouponDao {
        public ArrayList<CouponEntity> getCouponRecommendList(CouponEntity couponEntity,String sortKey,String sort,int startIndex,int count);
        
        public ArrayList<CouponShopEntity> getCouponShop(CouponEntity couponEntity,String sortKey,String sort,int startIndex,int count);
       
        public ArrayList<CouponShopEntity> getCouponShopList(int startIndex,int count);
    
        public CouponShopEntity getCoupon(int id);

        public Integer count();

}
