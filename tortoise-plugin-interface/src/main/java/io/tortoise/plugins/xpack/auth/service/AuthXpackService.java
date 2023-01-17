package io.tortoise.plugins.xpack.auth.service;

import io.tortoise.plugins.common.service.PluginMenuService;
import io.tortoise.plugins.xpack.auth.dto.request.XpackBaseTreeRequest;
import io.tortoise.plugins.xpack.auth.dto.request.XpackSysAuthRequest;
import io.tortoise.plugins.xpack.auth.dto.response.XpackSysAuthDetail;
import io.tortoise.plugins.xpack.auth.dto.response.XpackSysAuthDetailDTO;
import io.tortoise.plugins.xpack.auth.dto.response.XpackVAuthModelDTO;
import java.util.List;
import java.util.Map;

public abstract class AuthXpackService extends PluginMenuService {

    public abstract List<XpackVAuthModelDTO> searchAuthModelTree(XpackBaseTreeRequest request, Long userId, Boolean isAdmin);

    public abstract Map<String, List<XpackSysAuthDetailDTO>> searchAuthDetails(XpackSysAuthRequest request);

    public abstract List<XpackSysAuthDetail> searchAuthDetailsModel(String authType);

    public abstract void authChange(XpackSysAuthRequest request, Long userId, String userName, Boolean isAdmin);
}
