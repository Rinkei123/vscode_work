package co.jp.mri_itstudy.vcoupon.dao;

 import java.util.ArrayList;
import java.util.List;

import co.jp.mri_itstudy.vcoupon.entity.ShopEntity;

public interface ShopDao {
    public ArrayList<ShopEntity> getShopList();

    public ArrayList<ShopEntity> getShops(int startIndex, int count, String sortKey, String sort);

}
