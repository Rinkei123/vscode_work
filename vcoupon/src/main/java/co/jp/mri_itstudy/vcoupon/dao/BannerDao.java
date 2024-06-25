package co.jp.mri_itstudy.vcoupon.dao;

import co.jp.mri_itstudy.vcoupon.entity.BannerEntity;
import java.util.List;

public interface BannerDao {
    List<BannerEntity> getLatestBanners();
}
