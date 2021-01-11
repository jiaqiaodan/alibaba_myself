package com.pccc.aops.cmdb.mapper.arango;

import com.arangodb.springframework.repository.ArangoRepository;
import com.pccc.aops.cmdb.arango.po.CiDetail;

public interface CiRepository  extends ArangoRepository<CiDetail,String> {



}
