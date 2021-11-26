package com.ct.lightdecay.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ct.common.Resp;
import com.ct.lightdecay.entity.Lightdecaydetail;
import com.ct.lightdecay.service.LightdecaydetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zym
 * @since 2021-11-25
 */
@RestController
@RequestMapping("/lightdecay/lightdecaydetail")
public class LightdecaydetailController {
    @Resource
    private LightdecaydetailService lightdecayDetailService;

    @GetMapping("/page")
    public Resp page(String keyword, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20") Integer size){
        Page<Lightdecaydetail> p = lightdecayDetailService.getPage(keyword,page,size);
        return Resp.ok(p);
    }

}

