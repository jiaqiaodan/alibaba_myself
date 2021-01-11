package com.pccc.aops.cmdb.arango.po;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.Field;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Edge("tbl_cmdb_ci_topology_relation")
public class CiTopologyRelation {

    @Id
    private String id;

    @From
    private CiDetail from;

    @To
    private  CiDetail to;

    @Field("from_model_id")
    private String formModelId;
    @Field("to_model_id")
    private String toModelId;

    @Field("create_user")
    private String user;

    @Field("create_time")
    private Long createTime;

}
