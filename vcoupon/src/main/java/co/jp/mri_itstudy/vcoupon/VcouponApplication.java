package co.jp.mri_itstudy.vcoupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages= {"co.jp.mri_itstudy.vcoupon.dao"})
@ComponentScan("co")
public class VcouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(VcouponApplication.class, args);
	}

}
