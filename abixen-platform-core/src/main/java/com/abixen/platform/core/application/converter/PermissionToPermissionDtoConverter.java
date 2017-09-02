/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.core.application.converter;


import com.abixen.platform.common.application.converter.AbstractConverter;
import com.abixen.platform.core.application.dto.PermissionDto;
import com.abixen.platform.core.domain.model.Permission;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PermissionToPermissionDtoConverter extends AbstractConverter<Permission, PermissionDto> {

    @Override
    public PermissionDto convert(Permission permission, Map<String, Object> parameters) {
        PermissionDto permissionDto = new PermissionDto();

        permissionDto
                .setId(permission.getId())
                .setPermissionName(permission.getPermissionName())
                .setTitle(permission.getTitle())
                .setDescription(permission.getDescription())
                .setPermissionAclClassCategory(permission.getPermissionAclClassCategory())
                .setPermissionGeneralCategory(permission.getPermissionGeneralCategory());

        return permissionDto;
    }
}