package com.pccc.aops.cmdb.arango.po;

import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.Field;
import com.arangodb.springframework.annotation.Relations;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;

@Data
@Document("tbl_cmdb_ci_detail")
public class CiDetail {
    @Id
    private  String ciId;


    @Field("ci_name")
    private  String ciName;

    @Field("ci_version")
    private Integer ciVersion;

    @Field("model_id")
    private String modelId;

    @Field("model_version")
    private Integer modelVersion;

    @Field("content")
    private Map<String,Object> content;

    @Field("update_time")
    private String updateUser;

    @Field("update_time")
    private  Long updateTime;




    @JsonIgnore
    @Relations(edges = CiTopologyRelation.class,direction = Relations.Direction.OUTBOUND,lazy = true)
    private List<CiDetail> childs;

    @JsonIgnore
    @Relations(edges = CiTopologyRelation.class,direction = Relations.Direction.INBOUND,lazy = true)
    private List<CiDetail> parents;

    @Field("crux_key")
    private String cruxKey;

}
