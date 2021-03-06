package com.feign.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.feign.feign.dto.UserResponseDTO;

@FeignClient(value = "feign-service-producer", url = "${service.path}")
public interface FeignService {
	
	@GetMapping("api/user/feignService")
	String hello();

	@GetMapping("api/user/getById/{id}")
	UserResponseDTO userGetById(@PathVariable("id") Long id);
}
