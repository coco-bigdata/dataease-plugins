package io.tortoise.plugins.xpack.dept.service;

import io.tortoise.plugins.common.entity.XpackGridRequest;
import io.tortoise.plugins.common.service.PluginMenuService;
import io.tortoise.plugins.xpack.dept.dto.request.XpackCreateDept;
import io.tortoise.plugins.xpack.dept.dto.request.XpackDeleteDept;
import io.tortoise.plugins.xpack.dept.dto.response.XpackDeptTreeNode;
import io.tortoise.plugins.xpack.dept.dto.response.XpackSysDept;
import java.util.List;

public abstract class DeptXpackService extends PluginMenuService {

    public abstract List<XpackSysDept> nodesByPid(Long pid);

    public abstract List<XpackSysDept> nodesTreeByCondition(XpackGridRequest request);

    public abstract List<XpackDeptTreeNode> searchTree(Long deptId);

    public abstract int add(XpackCreateDept xpackCreateDept);

    public abstract int update(XpackCreateDept xpackCreateDept);

    public abstract int batchDelete(List<XpackDeleteDept> requests);
}
