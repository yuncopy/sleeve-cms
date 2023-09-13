package io.github.talelin.latticy.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.talelin.latticy.mapper.my.BannerMapper;
import io.github.talelin.latticy.mapper.my.IBannerMapper;
import io.github.talelin.latticy.model.my.BannerDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService extends ServiceImpl<IBannerMapper, BannerDo> {

   // @Autowired
   // private BannerMapper bannerMapper;

   // public List<Banner> getBanners(){
   //     return bannerMapper.findBanners();
   // }
}
