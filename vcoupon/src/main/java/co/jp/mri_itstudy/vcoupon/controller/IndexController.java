package co.jp.mri_itstudy.vcoupon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.jp.mri_itstudy.vcoupon.entity.BannerEntity;
import co.jp.mri_itstudy.vcoupon.entity.CouponEntity;
import co.jp.mri_itstudy.vcoupon.entity.CouponShopEntity;
import co.jp.mri_itstudy.vcoupon.entity.ShopCategoryEntity;
import co.jp.mri_itstudy.vcoupon.entity.ShopEntity;
import co.jp.mri_itstudy.vcoupon.service.BannerService;
import co.jp.mri_itstudy.vcoupon.service.CouponService;
import co.jp.mri_itstudy.vcoupon.service.ShopCategoryService;
import co.jp.mri_itstudy.vcoupon.service.ShopService;


@Controller
public class IndexController {

    @Autowired
    CouponService couponService;
    @Autowired
    ShopCategoryService shopCategoryService;
    @Autowired
    ShopService shopService;
    @Autowired
    BannerService bannerService;

    @RequestMapping("/")
    public String index(Model model) {
        // 1. 获取最新的4条banner，按banner_id倒序
        List<BannerEntity> bannerList = bannerService.getLatestBanners();
        model.addAttribute("bannerList", bannerList);
        //1coupon 分类 list 最新的iddesc 10
        ArrayList<ShopCategoryEntity> shopCategoryList = shopCategoryService.getShopCategories();
        model.addAttribute("categoryList", shopCategoryList);
        //2最新的coupon 6条coupon_recommend  推荐 id
        CouponEntity couponObj = new CouponEntity();
        couponObj.setCouponRecommend(1);
        ArrayList<CouponShopEntity> couponList = couponService.getCouponShop(couponObj,"coupon_id", "desc", 0, 6);
        //1最新商家shop 24 id desc
        ArrayList<ShopEntity> shopList = shopService.getShops(0, 24, "shop_id", "asc");
        
        model.addAttribute("shopList", shopList);
        //1最新new 
        
        model.addAttribute("couponList", couponList);
        return "index";
    }
    
}
