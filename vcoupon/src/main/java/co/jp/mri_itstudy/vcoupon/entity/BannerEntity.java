package co.jp.mri_itstudy.vcoupon.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BannerEntity {
    private int bannerId;
    private String title;
    private String imageUrl;
    private String targetUrl;
    private Timestamp startDate;
    private Timestamp endDate;
    private int isActive;
    private Timestamp createdAt;
}
