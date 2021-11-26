package com.ct.lightdecay.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ct.lightdecay.entity.Lightdecaydetail;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zym
 * @since 2021-11-25
 */
public interface LightdecaydetailService extends IService<Lightdecaydetail> {

    Page<Lightdecaydetail> getPage(String keyword, Integer page, Integer size);
}
