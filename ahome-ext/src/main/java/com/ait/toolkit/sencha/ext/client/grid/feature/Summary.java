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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * This feature is used to place a summary row at the bottom of the grid. If
 * using a grouping, see {@link GroupingSummary}.
 * 
 * @author alainekambi
 * 
 */
public class Summary extends Feature {

    public Summary() {
        jsObj = createNativePeer();
    }

    /**
     * True to show the summary row.
     * <p>
     * Defaults to: true
     * 
     */
    public void setShowSummaryRow(String value) {
        JsoHelper.setAttribute(jsObj, "showSummaryRow", value);
    }

    /**
     * Toggle whether or not to show the summary row.
     * 
     */
    public native void toggleSummaryRow(boolean visible)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.toggleSummaryRow(visible);
    }-*/;

    private native JavaScriptObject createNativePeer()/*-{
		return new $wnd.Ext.grid.feature.Summary();
    }-*/;

}
