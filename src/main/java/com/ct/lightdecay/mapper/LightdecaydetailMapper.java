package com.ct.lightdecay.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ct.lightdecay.entity.Lightdecaydetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zym
 * @since 2021-11-25
 */
@Mapper
public interface LightdecaydetailMapper extends BaseMapper<Lightdecaydetail> {

    Page<Lightdecaydetail> getPage(@Param("page") Page<Lightdecaydetail> p, @Param("keyword") String keyword);
}
