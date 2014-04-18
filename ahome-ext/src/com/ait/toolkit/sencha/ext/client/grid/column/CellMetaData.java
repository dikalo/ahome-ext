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
package com.ait.toolkit.sencha.ext.client.grid.column;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.core.config.BaseConfig;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A collection of metadata about the current cell; can be used or modified by
 * the renderer. Recognized properties are: tdCls, tdAttr, and style.
 * 
 * @author alainekambi
 * 
 */
public class CellMetaData extends BaseConfig {

    CellMetaData(JavaScriptObject obj) {
        jsObj = obj;
    }

    public void setTdCls(String value) {
        JsoHelper.setAttribute(jsObj, "tdCls", value);
    }

    public void setTdAttr(String value) {
        JsoHelper.setAttribute(jsObj, "tdAttr", value);
    }

    public void setTdAttr(BaseConfig value) {
        JsoHelper.setAttribute(jsObj, "tdAttr", value.getJsObj());
    }

    public void setStyle(String value) {
        JsoHelper.setAttribute(jsObj, "style", value);
    }

    public void setStyle(BaseConfig value) {
        JsoHelper.setAttribute(jsObj, "style", value.getJsObj());
    }

}
