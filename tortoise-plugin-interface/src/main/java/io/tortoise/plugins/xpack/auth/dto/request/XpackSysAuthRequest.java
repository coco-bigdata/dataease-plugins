package io.tortoise.plugins.xpack.auth.dto.request;

import io.tortoise.plugins.xpack.auth.dto.response.XpackSysAuth;
import io.tortoise.plugins.xpack.auth.dto.response.XpackSysAuthDetail;
import lombok.Data;

import java.util.List;

@Data
public class XpackSysAuthRequest extends XpackSysAuth {

    private List<String> authSources;

    private List<String> authTargets;

    private XpackSysAuthDetail authDetail;
}
