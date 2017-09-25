package com.unicom.shop.common.web.api;

import com.icourt.core.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by zhangyq on 2017/9/24.
 */
@Api(tags = "common",description = "通用管理")
public interface CommonControllerApi {

    @ApiOperation(value="删除产品")
    Result<Void> delete(@PathVariable Long id);

}
