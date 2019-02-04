/*
 * 3D City Database - The Open Source CityGML Database
 * http://www.3dcitydb.org/
 *
 * Copyright 2013 - 2018
 * Chair of Geoinformatics
 * Technical University of Munich, Germany
 * https://www.gis.bgu.tum.de/
 *
 * The 3D City Database is jointly developed with the following
 * cooperation partners:
 *
 * virtualcitySYSTEMS GmbH, Berlin <http://www.virtualcitysystems.de/>
 * M.O.S.S. Computer Grafik Systeme GmbH, Taufkirchen <http://www.moss.de/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citydb.ade;

import org.citydb.ade.bind.CityDBADEMarshaller;
import org.citydb.ade.bind.CityDBADEUnmarshaller;
import org.citydb.ade.model.module.CityDBADE100Module;
import org.citydb.ade.model.module.CityDBADE200Module;
import org.citygml4j.model.citygml.ade.binding.ADEContext;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.module.ade.ADEModule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CityDBADEContext implements ADEContext {
    private final List<ADEModule> modules = Arrays.asList(CityDBADE100Module.v3_0, CityDBADE200Module.v3_0);

    @Override
    public List<ADEModule> getADEModules() {
        return modules;
    }

    @Override
    public List<String> getModelPackageNames() {
        return Collections.singletonList("org.citydb.ade.model");
    }

    @Override
    public ADEMarshaller createADEMarshaller() {
        return new CityDBADEMarshaller();
    }

    @Override
    public ADEUnmarshaller createADEUnmarshaller() {
        return new CityDBADEUnmarshaller();
    }
}
