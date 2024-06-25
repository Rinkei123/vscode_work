package co.jp.mri_itstudy.vcoupon.service.Imp;

import co.jp.mri_itstudy.vcoupon.dao.ShopDao;
import co.jp.mri_itstudy.vcoupon.entity.ShopEntity;
import co.jp.mri_itstudy.vcoupon.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServiceImp implements ShopService {

    @Autowired
    ShopDao shopDao;

    @Override
    public ArrayList<ShopEntity> getShopList() {
        return shopDao.getShopList();
    }

  

    @Override
    public ShopEntity getShop(int shopId) {
        throw new UnsupportedOperationException("Unimplemented method 'getShop'");
    }

    @Override
    public ArrayList<ShopEntity> getShops(int startIndex, int count, String sortKey, String sort) {
        return shopDao.getShops(startIndex, count, sortKey, sort);
    }
}
