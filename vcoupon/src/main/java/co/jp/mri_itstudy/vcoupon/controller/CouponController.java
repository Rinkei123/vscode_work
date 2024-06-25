package co.jp.mri_itstudy.vcoupon.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.jp.mri_itstudy.vcoupon.entity.CategoryEntity;
import co.jp.mri_itstudy.vcoupon.entity.CouponShopEntity;
import co.jp.mri_itstudy.vcoupon.service.CategoryService;
import co.jp.mri_itstudy.vcoupon.service.CouponService;

@Controller
public class CouponController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    CouponService couponService;

    @RequestMapping("/coupons")
    public String coupon(String page,Model model){
        ArrayList<CategoryEntity> categoryList = categoryService.getCategoryList();
        //System.out.println(categoryList);
        int id =(page ==null)?1:Integer.parseInt(page);
        ArrayList<CouponShopEntity> couponShopList = couponService.getCouponShopList((id-1)*10, 10);
        //System.out.println(couponShopList);
        Integer count=couponService.count();
        Integer totolpage = (int)(Math.ceil(count*1.0/10));
        //System.out.println(count);
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("couponShopList", couponShopList);
        model.addAttribute("totolpage", totolpage);
        model.addAttribute("page", id);
        return "coupons";
    } 


    @RequestMapping("/couponreviews")
    public String couponId(String couponId,Model model) {
        int id =(couponId ==null)?1:Integer.parseInt(couponId);
        //System.out.println(id);
        CouponShopEntity coupon = couponService.getCoupon(id);
        System.out.println(coupon);
        model.addAttribute("coupon", coupon);
        return "couponreviews";
       
    }



}
