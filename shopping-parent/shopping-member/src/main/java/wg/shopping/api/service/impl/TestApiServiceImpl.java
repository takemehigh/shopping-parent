package wg.shopping.api.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import wg.shopping.api.service.TestApiService;
@RestController
public class TestApiServiceImpl implements TestApiService {
	//微服务接口规范
//	{
//		"resultcode":"200",
//		"data":{},
//		"msg":"success"
//	}
	@Override
	public Map<String, Object> test(Integer id, String name) {
		// TODO Auto-generated method stub
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("resultcode", "200");
		result.put("msg", "success");
		result.put("data", new String[] {"a","b","c",id+"",name});
		return result;
	}

}
