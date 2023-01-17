package io.tortoise.plugins.common.service;

import io.tortoise.plugins.common.dto.PluginSysMenu;
import org.springframework.util.StringUtils;

import java.io.InputStream;
import java.util.List;

public abstract class PluginMenuService {

    public abstract List<PluginSysMenu> menus();


    protected abstract InputStream readContent(String name);

    public InputStream vueResource(String name) {
        if (StringUtils.isEmpty(name)) return null;
        if (!name.endsWith(".js")) name += ".js";

        return readContent(name);
    }


}
