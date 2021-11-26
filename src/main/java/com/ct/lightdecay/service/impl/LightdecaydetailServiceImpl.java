package com.ct.lightdecay.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ct.lightdecay.entity.Lightdecaydetail;
import com.ct.lightdecay.mapper.LightdecaydetailMapper;
import com.ct.lightdecay.service.LightdecaydetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zym
 * @since 2021-11-25
 */
@Service
public class LightdecaydetailServiceImpl extends ServiceImpl<LightdecaydetailMapper, Lightdecaydetail> implements LightdecaydetailService {
    @Resource
    private LightdecaydetailMapper lightdecayDetailMapper;

    @Override
    public Page<Lightdecaydetail> getPage(String keyword, Integer page, Integer size) {
        Page<Lightdecaydetail> p = new Page<>(page,size);
        /*LambdaQueryWrapper<Lightdecaydetail> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(keyword)){
            lambdaQueryWrapper.like(Lightdecaydetail::getEfbm,keyword).or().like(Lightdecaydetail::getEfxxdkbm,keyword);
        }
        return page(p, lambdaQueryWrapper);*/
        return lightdecayDetailMapper.getPage(p,keyword);
    }
}
