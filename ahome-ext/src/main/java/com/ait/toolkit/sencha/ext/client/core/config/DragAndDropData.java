/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.sencha.ext.client.core.config;

import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.data.client.BaseModel;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Object that is passed around during dnd operations
 * 
 * @author alainekambi
 * 
 */
public class DragAndDropData extends BaseConfig {

    DragAndDropData(JavaScriptObject obj) {
        this.jsObj = obj;
    }

    public void setCopy(boolean value) {
        JsoHelper.setAttribute(jsObj, Attribute.COPY.getValue(), value);
    }

    public boolean isCopy() {
        return JsoHelper.getAttributeAsBoolean(jsObj, Attribute.COPY.getValue());
    }

    public List<BaseModel> getRecords() {
        return BaseModel.fromJsArray(_getRecords());
    }

    private JavaScriptObject _getRecords() {
        return JsoHelper.getAttributeAsJavaScriptObject(jsObj, Attribute.RECORDS.getValue());
    }

}
