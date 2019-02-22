/** SdsTypeProperty.java
 * 
 *  Copyright 2019 OSIsoft, LLC
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0>
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package  com.github.osisoft.ocs_sample_library_preview.sds;

public class SdsTypeProperty {

    public SdsTypeProperty()
    {}

    public SdsTypeProperty(String id, String name, String description, SdsType sdsType, boolean isKey)
    {
        setName(name);
        setId(id);
        setDescription(description);
        setSdsType(sdsType);
        setIsKey(isKey);    
    }

    private String Name;
    private String Id;
    private String Description;
    private SdsType SdsType;
    private boolean IsKey;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public SdsType getSdsType() {
        return SdsType;
    }

    public void setSdsType(SdsType sdsType) {
        this.SdsType = sdsType;
    }

    public boolean isIsKey() {
        return IsKey;
    }

    public void setIsKey(boolean isKey) {
        IsKey = isKey;
    }
}
