package io.tortoise.plugins.xpack.display.service;



import io.tortoise.plugins.common.service.PluginMenuService;
import io.tortoise.plugins.xpack.display.dto.response.SysSettingDto;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Map;

public abstract class DisplayXpackService extends PluginMenuService {


    public abstract List<SysSettingDto> systemSettings();

    public abstract Boolean save(Map<String,List<SysSettingDto>> systemParameterMap, List<MultipartFile> bodyFiles);
}
