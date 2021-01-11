package com.jia.consumer;

import com.jia.api.CiRpcService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;
@Service(version = "1.0.0")
public class CiRpcServiceImpl implements CiRpcService {
    @Override
    public List<String> getCilist(String accountId, String userId) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("ddd");
        return strings;
    }
}
