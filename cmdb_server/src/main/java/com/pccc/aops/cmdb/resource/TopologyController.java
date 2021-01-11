package com.pccc.aops.cmdb.resource;

import com.pccc.aops.cmdb.constant.ActionConstant;
import com.pccc.aops.cmdb.constant.PathConstant;
import com.pccc.aops.cmdb.pojo.vo.TopologyVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PathConstant.BASE_TOPOLOGY)
public class TopologyController {


    @RequestMapping(value = ActionConstant.ACTION_ADD,produces = "application/json; charset=utf-8")
    public String addTopology(@RequestBody TopologyVo topologyVo){



        return "success";
    }
}
