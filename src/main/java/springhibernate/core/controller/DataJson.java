package main.java.springhibernate.core.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataJson {
	
	@RequestMapping(value = "/data", method= RequestMethod.GET)
	public Map<String, List<String>> getDataJson(){
		Map<String, List<String>> data = new HashMap<>();
		List<String> lstString = new ArrayList<>();
		for (int i = 0; i < lstString.size(); i++) {
			lstString.add("hungbang-"+ i);
		}
		data.put("results", lstString);
		return data;
	}
	
	
	
	
}
