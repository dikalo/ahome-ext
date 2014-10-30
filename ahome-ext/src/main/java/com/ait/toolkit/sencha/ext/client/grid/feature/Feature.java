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
package com.ait.toolkit.sencha.ext.client.grid.feature;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.core.config.BaseConfig;
import com.ait.toolkit.sencha.ext.client.ui.GridPanel;
import com.ait.toolkit.sencha.ext.client.ui.TreePanel;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A feature is a type of plugin that is specific to the {@link GridPanel} or
 * the {@link TreePanel}. It provides several hooks that allows the developer to
 * inject additional functionality at certain points throughout the grid
 * creation cycle. This class provides the base template methods that are
 * available to the developer, it should be extended.
 * 
 * @author alainekambi
 * 
 */
public class Feature extends BaseConfig {

    public Feature() {
        // jsObj = createNativePeer();
    }

    private native JavaScriptObject createNativePeer()/*-{
		return new $wnd.Ext.grid.feature.Feature();
    }-*/;

    /**
     * Most features will not modify the data returned to the view. This is
     * limited to one feature that manipulates the data per grid view.
     * <p>
     * Defaults to: false
     * 
     * @param value
     */
    public void setCollectData(int value) {
        JsoHelper.setAttribute(getJsObj(), "collectData", value);
    }

    /**
     * Prefix to use when firing events on the view. For example a prefix of
     * group would expose "groupclick", "groupcontextmenu", "groupdblclick".
     * <p>
     * Defaults to: null
     */
    public void setEventPrefix(String value) {
        JsoHelper.setAttribute(getJsObj(), "eventPrefix", value);
    }

    public void setType(String value) {
        JsoHelper.setAttribute(getJsObj(), "ftype", value);
    }

    public native void disable()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.disable();
    }-*/;

    public native void enable()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.enable();
    }-*/;

}
