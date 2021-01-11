package com.pccc.aops.cmdb.pojo.vo;

import lombok.Data;

@Data
public class TopologyVo {

    private  String topolgyId;

    private  String topologyName;

    private  String centers;

    private  String content;

    private  String fromContent;
    /**
     * 向上深度
     */
    private  Integer depthInBound;

    /**
     * 向下深度
     */
    private  Integer depthOutBound;


    private String centerName;
    /**
     * 更新的时间戳
     */
    private  long updateTime;

}
