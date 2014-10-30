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
package com.ait.toolkit.sencha.ext.client.layout;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Represents a weight of a region in a border layout
 * 
 * @author alainekambi
 * 
 */
public class BorderRegionWeight extends JsObject {

    public BorderRegionWeight() {
        jsObj = JsoHelper.createObject();
    }

    public void setWest(int value) {
        JsoHelper.setAttribute(this.getJsObj(), "west", value);
    }

    public void setNorth(int value) {
        JsoHelper.setAttribute(this.getJsObj(), "north", value);
    }

    public void setEast(int value) {
        JsoHelper.setAttribute(this.getJsObj(), "east", value);
    }

    public void setSouth(int value) {
        JsoHelper.setAttribute(this.getJsObj(), "south", value);
    }
}
