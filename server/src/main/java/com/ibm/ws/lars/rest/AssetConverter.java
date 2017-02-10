/*******************************************************************************
 * Copyright (c) 2017 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.ibm.ws.lars.rest;

import java.util.Map;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.ibm.ws.lars.rest.model.Asset;

/**
 *
 */
public class AssetConverter extends StdConverter<Asset, Map<String, Object>> {

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> convert(Asset value) {
        return value.getProperties();
    }

}
