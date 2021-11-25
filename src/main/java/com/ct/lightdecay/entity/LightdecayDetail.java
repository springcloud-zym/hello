package com.ct.lightdecay.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zym
 * @since 2021-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LightdecayDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 本地网
     */
    private String bdw;

    /**
     * 区县	
     */
    private String qx;

    /**
     * 运营分局	
     */
    private String yyfj;

    /**
     * 运营包区	
     */
    private String yybq;

    /**
     * 营销中心	
     */
    private String yxzx;

    /**
     * 营销分局	
     */
    private String yxfj;

    /**
     * 营销网格	
     */
    private String yxwg;

    /**
     * 营销包区	
     */
    private String yxbq;

    /**
     * 营销单元	
     */
    private String yxdy;

    /**
     * 营销小区	
     */
    private String yxxq;

    /**
     * 综调分公司	
     */
    private String zdfgs;

    /**
     * 综调代理商	
     */
    private String zddls;

    /**
     * 综调班组	
     */
    private String zdbz;

    /**
     * 综调包区编码	
     */
    private String zdbqbm;

    /**
     * 综调包区	
     */
    private String zdbq;

    /**
     * 综调装维	
     */
    private String zdzw;

    /**
     * 综调装维电话	
     */
    private String zdzwdh;

    /**
     * 端到端IP	
     */
    private String dddip;

    /**
     * 智能网管IP	
     */
    private String znwgip;

    /**
     * OLT名称	
     */
    private String oltmc;

    /**
     * OLT编码	
     */
    private String oltbm;

    /**
     * OLT地址	
     */
    private String oltdz;

    /**
     * OLT下行端口编码	
     */
    private String oltxxdkbm;

    /**
     * OLT下行端口名称	
     */
    private String oltxxdkmc;

    /**
     * OLT下行端口网管标志	
     */
    private String oltxxdkwgbz;

    /**
     * OLT局向信息	
     */
    private String oltjxxx;

    /**
     * 一分编码	
     */
    private String yfbm;

    /**
     * 一分名称	
     */
    private String yfmc;

    /**
     * 一分网管标志	
     */
    private String yfwgbz;

    /**
     * 一分地址	
     */
    private String yfdz;

    /**
     * 一分上行端口编码	
     */
    private String yfsxdkbm;

    /**
     * 一分下行端口编码	
     */
    private String yfxxdkbm;

    /**
     * 一分下行端口名称	
     */
    private String yfxxdkmc;

    /**
     * 一分下行端口网管标志	
     */
    private String yfxxdkwgbz;

    /**
     * 一分光网类型	
     */
    private String yfgwlx;

    /**
     * 一分光网编码	
     */
    private String yfgwbm;

    /**
     * 一分光网名称	
     */
    private String yfgwmc;

    /**
     * 一分光网地址	
     */
    private String yfgwdz;

    /**
     * 二分编码	
     */
    private String efbm;

    /**
     * 二分名称	
     */
    private String efmc;

    /**
     * 二分网管标志	
     */
    private String efwgbz;

    /**
     * 二分地址	
     */
    private String efdz;

    /**
     * 二分上行端口编码	
     */
    private String efsxdkbm;

    /**
     * 二分下行端口编码		
     */
    private String efxxdkbm;

    /**
     * 二分下行端口名称		
     */
    private String efxxdkmc;

    /**
     * 二分下行端口网管标志	
     */
    private String efxxdkwgbz;

    /**
     * 二分光网类型	
     */
    private String efgwlx;

    /**
     * 二分光网编码	
     */
    private String efgwbm;

    /**
     * 二分光网名称	
     */
    private String efgwmc;

    /**
     * 二分光网地址	
     */
    private String efgwdz;

    /**
     * 家庭宽带网关	
     */
    private String jtkdwg;

    /**
     * 家庭宽带厂商	
     */
    private String jtkdcs;

    /**
     * 家庭宽带终端型号	
     */
    private String jtkdzdxh;

    /**
     * 家庭宽带接入号	
     */
    private String jtkdjrh;

    /**
     * 家庭宽带账号	
     */
    private String jtkdzh;

    /**
     * olt接收功率	
     */
    private String oltjsgl;

    /**
     * olt发送功率	
     */
    private String oltfsgl;

    /**
     * onu接收功率	
     */
    private String onujsgl;

    /**
     * onu发送功率	
     */
    private String onufsgl;

    /**
     * 上行光衰	
     */
    private String sxgs;

    /**
     * 下行光衰	
     */
    private String xxgs;

    /**
     * olt最小发光功率	
     */
    private String oltzxfggl;

    /**
     * olt最大发光功率	
     */
    private String oltzdfggl;

    /**
     * olt平均发光功率	
     */
    private String oltpjfggl;

    /**
     * 光猫最小收光功率	
     */
    private String gmzxsggl;

    /**
     * 光猫最大收光功率	
     */
    private String gmzdsggl;

    /**
     * 光猫平均收光功率	
     */
    private String gmpjsggl;

    /**
     * 上行最小光衰	
     */
    private String sxzxgs;

    /**
     * 上行最大光衰	
     */
    private String sxzdgs;

    /**
     * 上行平均光衰	
     */
    private String sxpjgs;

    /**
     * 下行最小光衰	
     */
    private String xxzxgs;

    /**
     * 下行最大光衰	
     */
    private String xxzdgs;

    /**
     * 下行平均光衰	
     */
    private String xxpjgs;

    /**
     * 光衰采集时间	
     */
    private String gscjsj;

    /**
     * 采集光衰	
     */
    private String cjgs;

    /**
     * 二分收敛状态	
     */
    private String efslzt;

    /**
     * 二分挂测类型	
     */
    private String efgclx;

    /**
     * 二分挂测时间	
     */
    private LocalDateTime efgcsj;

    /**
     * 二分olt发送功率	
     */
    private String efoltfsgl;

    /**
     * 二分olt接收功率	
     */
    private String efoltjsgl;

    /**
     * 二分光猫发送功率	
     */
    private String efgmfsgl;

    /**
     * 二分光猫接收功率	
     */
    private String efgmjsgl;

    /**
     * 二分上行光衰	
     */
    private String efsxgs;

    /**
     * 二分下行光衰	
     */
    private String efxxgs;

    /**
     * 二分分光器到OLT距离	
     */
    private String effgqdoltjl;

    /**
     * 二分是否达标	
     */
    private String efsfdb;

    /**
     * 二分最新是否挂测成功	
     */
    private String efzxsfgccg;

    /**
     * 二分是补挂测	
     */
    private String efsbgc;

    /**
     * 二分挂测/补挂测时间	
     */
    private LocalDateTime efgcbgcsj;

    /**
     * 二分到olt的距离	
     */
    private String efdoltdjl;

    /**
     * 光猫到OLT的距离	
     */
    private String gmdoltdjl;

    /**
     * 光猫到二分的距离	
     */
    private String gmdefdjl;

    /**
     * ONU温度	
     */
    private String onuwd;

    /**
     * 在线时长	
     */
    private String zxsc;

    /**
     * 上线时间点	
     */
    private String sxsjd;

    /**
     * 下线时间点	
     */
    private String xxsjd;

    /**
     * 用户星级	
     */
    private Integer yhxj;

    /**
     * 沙盘政企类型	
     */
    private String spzqlx;

    /**
     * 是否高带宽	
     */
    private String sfgdk;

    /**
     * 城市农村标志	
     */
    private String csncbz;

    /**
     * 采集状态	
     */
    private String cjzt;

    /**
     * 采集时间	
     */
    private LocalDateTime cjsj;

    /**
     * 光猫状态	
     */
    private String gmzt;

    /**
     * 光衰是否合格	
     */
    private String gssfhg;

    /**
     * 是否4星级及以上用户标识	
     */
    private String sf4xjjysyhbs;

    /**
     * 当月最新光衰日期	
     */
    private String dyzxgsrq;

    /**
     * 当月最新光衰值	
     */
    private String dyzxgsz;

    /**
     * 当月最新合格光衰日期	
     */
    private String dyzxhggsrq;

    /**
     * 当月最新合格光衰值	
     */
    private String dyzxhggsz;


}
