package co.jp.mri_itstudy.vcoupon.service;

import co.jp.mri_itstudy.vcoupon.entity.ShopEntity;

import java.util.ArrayList;
import java.util.List;

public interface ShopService {
    ArrayList<ShopEntity> getShopList();

    ArrayList<ShopEntity> getShops(int startIndex, int count, String sortKey, String sort);

    ShopEntity getShop(int shopId);

}
