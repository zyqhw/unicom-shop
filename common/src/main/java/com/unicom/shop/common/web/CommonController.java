package com.unicom.shop.common.web;

import com.icourt.core.Result;
import com.unicom.shop.common.web.api.CommonControllerApi;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhangyq on 2017/9/24.
 */
@RestController
@RequestMapping("/common")
public class CommonController implements CommonControllerApi {

    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Long id) {
        return Result.success();
    }
}
