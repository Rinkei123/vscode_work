package co.jp.mri_itstudy.vcoupon.service.Imp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jp.mri_itstudy.vcoupon.dao.CouponDao;
import co.jp.mri_itstudy.vcoupon.entity.CouponEntity;
import co.jp.mri_itstudy.vcoupon.entity.CouponShopEntity;
import co.jp.mri_itstudy.vcoupon.service.CouponService;

@Service
public class CouponServiceImp implements CouponService {

    @Autowired
    CouponDao couponDao;

    @Override
    public ArrayList<CouponEntity> getCouponRecommendList(CouponEntity couponEntity,String sortKey,String sort,int startIndex,int count) {
        ArrayList<CouponEntity> list = couponDao.getCouponRecommendList(couponEntity,sortKey,sort,startIndex,count);
        return list;
    }

    @Override
    public ArrayList<CouponShopEntity> getCouponShop(CouponEntity couponEntity,String sortKey,String sort,int startIndex,int count) {
        ArrayList<CouponShopEntity> list = couponDao.getCouponShop(couponEntity,sortKey,sort,startIndex,count);
        //不同优惠卷有不同的计算方式
        //1折扣，2满减，3off比例
        for(int i = 0 ; i < list.size();i++){
            if(list.get(i).getCouponType() == 1){
                list.get(i).setDiscountPriceInfo("立即-"+list.get(i).getCouponDiscountAmount());
            }else if(list.get(i).getCouponType() == 2){
                list.get(i).setDiscountPriceInfo("满"+list.get(i).getCouponDiscountAmount()+"立减1000");
            }else if(list.get(i).getCouponType() == 3){
                list.get(i).setDiscountPriceInfo(list.get(i).getCouponDiscountAmount()+"% OFF");
            }
        }
            
        
        return list;
    }
    @Override
    public ArrayList<CouponShopEntity> getCouponShopList(int startIndex, int count) {
        ArrayList<CouponShopEntity> list = couponDao.getCouponShopList(startIndex, count);
        for (CouponShopEntity obj : list) {
            if(obj.getCouponType()==1){
                obj.setDiscountPriceInfo("-"+obj.getCouponDiscountAmount());
            }else if(obj.getCouponType()==2){
                obj.setDiscountPriceInfo("购满金额之后立减"+obj.getCouponDiscountAmount());
            }else{
                obj.setDiscountPriceInfo(obj.getCouponDiscountAmount()+"% OFF");
            }
        }
        return list;
    }

    @Override
    public CouponShopEntity getCoupon(int id) {
        CouponShopEntity coupon= couponDao.getCoupon(id);
        if(coupon.getCouponType()==1){
            coupon.setDiscountPriceInfo("-"+coupon.getCouponDiscountAmount());
        }else if(coupon.getCouponType()==2){
            coupon.setDiscountPriceInfo("购满金额之后立减"+coupon.getCouponDiscountAmount());
        }else{
            coupon.setDiscountPriceInfo(coupon.getCouponDiscountAmount()+"% OFF");
        }
        return coupon;
    }
    public Integer count(){
        return couponDao.count();
    }

}
