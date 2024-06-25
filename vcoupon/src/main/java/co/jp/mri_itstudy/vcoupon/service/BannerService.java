package co.jp.mri_itstudy.vcoupon.service;

import co.jp.mri_itstudy.vcoupon.entity.BannerEntity;
import java.util.List;

public interface BannerService {
    List<BannerEntity> getLatestBanners();
}
