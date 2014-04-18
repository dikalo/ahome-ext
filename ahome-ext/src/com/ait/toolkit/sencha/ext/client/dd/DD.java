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

/**
 * @author Alain Ekambi
 */
public class DD extends DragDrop {

    public DD(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public DD(String id) {
        this(id, null);
    }

    public DD(Component component) {
        super(component);
    }

    public DD(String id, String sGroup) {
        this(id, sGroup, null);
    }

    public DD(Component component, String sGroup) {
        super(component, sGroup);
    }

    public DD(String id, String sGroup, DragDropConfig config) {
        super(id, sGroup, config);
    }

    public DD(Component component, String sGroup, DragDropConfig config) {
        super(component, sGroup, config);
    }

    public DD(Element el, String sGroup, DragDropConfig config) {
        super(el, sGroup, config);
    }

    protected native JavaScriptObject create(String id, String sGroup, JavaScriptObject config)/*-{
		return new $wnd.Ext.dd.DD(id, sGroup, config);
    }-*/;

    protected native JavaScriptObject create(Element element, String sGroup, JavaScriptObject config)/*-{
		return new $wnd.Ext.dd.DD(element, sGroup, config);
    }-*/;

    private static DD ddInstance(JavaScriptObject jsObj) {
        return new DD(jsObj);
    }

    public native boolean isScroll() /*-{
		var dd = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return dd.scroll ? true : false;
    }-*/;

    public native void setScroll(boolean scroll) /*-{
		var dd = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		dd.scroll = scroll;
    }-*/;

    public native void alignElWithMouse(Element el, int iPageX, int iPageY) /*-{
		var dd = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		dd.alignElWithMouse(el, iPageX, iPageY);
    }-*/;

    public native void autoOffset(int iPageX, int iPageY) /*-{
		var dd = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		dd.autoOffset(iPageX, iPageY);
    }-*/;

    public native void cachePosition(int iPageX, int iPageY) /*-{
		var dd = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		dd.cachePosition(iPageX, iPageY);
    }-*/;

    public native void setDelta(int iPageX, int iPageY) /*-{
		var dd = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		dd.setDelta(iPageX, iPageY);
    }-*/;

    public native void setDragElPos(int iPageX, int iPageY) /*-{
		var dd = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		dd.setDragElPos(iPageX, iPageY);
    }-*/;
}
