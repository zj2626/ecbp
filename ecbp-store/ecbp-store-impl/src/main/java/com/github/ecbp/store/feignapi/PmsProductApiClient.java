package com.github.ecbp.store.feignapi;

import com.github.ecbp.store.service.api.PmsProductApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ecbp-store-service-impl")
public interface PmsProductApiClient extends PmsProductApi {
}

