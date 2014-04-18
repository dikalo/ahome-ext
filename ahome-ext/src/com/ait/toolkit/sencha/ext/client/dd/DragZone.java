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
package com.ait.toolkit.sencha.ext.client.dd;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class DragZone extends DragSource {

    public DragZone(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public DragZone(String id, DragSourceConfig config) {
        super(id, config);
    }

    public DragZone(Component component, DragSourceConfig config) {
        super(component, config);
    }

    public DragZone(Element el, DragSourceConfig config) {
        super(el, config);
    }

    protected native JavaScriptObject create(String id, String sGroup, JavaScriptObject config)/*-{
		return new $wnd.Ext.dd.DragZone(id, config);
    }-*/;

    protected native JavaScriptObject create(Element element, String sGroup, JavaScriptObject config)/*-{
		return new $wnd.Ext.dd.DragZone(element, config);
    }-*/;
}
