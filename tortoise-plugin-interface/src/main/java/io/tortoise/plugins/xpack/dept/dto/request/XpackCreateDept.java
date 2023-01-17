package io.tortoise.plugins.xpack.dept.dto.request;

import io.tortoise.plugins.xpack.dept.dto.response.XpackSysDept;
import lombok.Data;

@Data
public class XpackCreateDept extends XpackSysDept {

    private boolean top;
}
