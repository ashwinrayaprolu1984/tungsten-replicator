/**
 * VMware Continuent Tungsten Replicator
 * Copyright (C) 2015 VMware, Inc. All rights reserved.
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
 *
 * Initial developer(s): Ludovic Launer
 * Contributor(s):
 */

package com.continuent.tungsten.common.tdf.dto;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Data Transfer Object for: Server Definition = ServerConf. Definition used
 * when creating a new resource
 * 
 * @author <a href="mailto:ludovic.launer@continuent.com">Ludovic Launer</a>
 * @version 1.0
 */

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class DataSource_Definition extends Service
{
    public String hostname = null;

    public DataSource_Definition()
    {
    }

    /**
     * Creates a new <code>Server_Definition</code> object
     * 
     * @param parentService
     * @param name
     * @param hostname
     */
    public DataSource_Definition(Service parentService, String name,
            String hostname)
    {
        super(parentService);

        this.name = name;
        this.hostname = hostname;
    }

}
