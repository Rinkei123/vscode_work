package co.jp.mri_itstudy.vcoupon.service.Imp;

import co.jp.mri_itstudy.vcoupon.dao.BannerDao;
import co.jp.mri_itstudy.vcoupon.entity.BannerEntity;
import co.jp.mri_itstudy.vcoupon.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    BannerDao bannerDao;

    @Override
    public List<BannerEntity> getLatestBanners() {
        return bannerDao.getLatestBanners();
    }
}
