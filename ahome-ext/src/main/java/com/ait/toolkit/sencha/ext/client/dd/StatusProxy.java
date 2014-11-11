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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.sencha.ext.client.ui.Layer;
import com.ait.toolkit.sencha.shared.client.dom.ExtElement;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 

 */
public class StatusProxy extends JsObject {

	public StatusProxy(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public StatusProxy() {
		jsObj = createPeer(null);
	}

	protected native JavaScriptObject createPeer(JavaScriptObject config)/*-{
		return new $wnd.Ext.dd.StatusProxy(config);
	}-*/;

	private static StatusProxy instance(JavaScriptObject jsObj) {
		return new StatusProxy(jsObj);
	}

	/**
	 * Returns the underlying proxy {@link Layer}.
	 * 
	 * @return the underlying proxy Layer
	 */
	public native Layer getEl() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var layer = proxy.getEl();
		return @com.ait.toolkit.sencha.ext.client.ui.Layer::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(layer);
	}-*/;

	/**
	 * Returns the ghost element.
	 * 
	 * @return the ghost element
	 */
	public native ExtElement getGhost() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var ghost = proxy.getGhost();
		return @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(ghost);
	}-*/;

	public native void hide() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.hide();
	}-*/;

	public native void hide(boolean clear) /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.hide(clear);
	}-*/;

	public native void reset() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.reset();
	}-*/;

	public native void reset(boolean clearGhost) /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.reset(clearGhost);
	}-*/;

	public native void setStatus(String cssClass) /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.setStatus(cssClass);
	}-*/;

	public native void show() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.show();
	}-*/;

	public native void stop() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.stop();
	}-*/;

	public native void sync() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.sync();
	}-*/;

	public native void update(String html) /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.update(html);
	}-*/;
}
