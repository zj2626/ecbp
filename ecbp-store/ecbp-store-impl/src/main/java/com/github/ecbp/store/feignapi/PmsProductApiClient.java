package com.github.ecbp.store.feignapi;

import com.github.ecbp.store.service.api.PmsProductApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 商品信息API
 *
 * @author zhangj
 * @version $Id: PmsProductApiClient.java, v 0.1 2020/3/6 20:49 zhangj Exp $
 */
@FeignClient(value = "${ecbp.feign.name.service.store}")
public interface PmsProductApiClient extends PmsProductApi {
}

