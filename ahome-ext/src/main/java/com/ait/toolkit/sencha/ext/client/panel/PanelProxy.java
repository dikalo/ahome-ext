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
package com.ait.toolkit.sencha.ext.client.panel;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.sencha.ext.client.ui.Panel;
import com.ait.toolkit.sencha.shared.client.dom.ExtElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * This is an internal class.
 * 
 */
public class PanelProxy extends JsObject {

	public PanelProxy(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public PanelProxy() {
		jsObj = createPeer(null);
	}

	protected native JavaScriptObject createPeer(JavaScriptObject config)/*-{
		return new $wnd.Ext.dd.PanelProxy(config);
	}-*/;

	private static PanelProxy instance(JavaScriptObject jsObj) {
		return new PanelProxy(jsObj);
	}

	/**
	 * Gets the proxy's element
	 * 
	 * @return the The proxy's element
	 */
	public native Element getEl() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var el = proxy.getEl();
		return @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
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

	public native Panel getPanel() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var panel = proxy.panel;
		return panel == null || panel === undefined ? null
				: @com.ait.toolkit.sencha.ext.client.ui.ComponentFactory::getComponent(Lcom/google/gwt/core/client/JavaScriptObject;)(panel);
	}-*/;

	public native ExtElement getProxy() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var proxy = proxy.getProxy();
		return @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(proxy);
	}-*/;

	public native void hide() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.hide();
	}-*/;

	public native void show() /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.show();
	}-*/;

	public native void moveProxy(Element parentNode) /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.moveProxy(parentNode, null);
	}-*/;

	public native void moveProxy(Element parentNode, Element before) /*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.moveProxy(parentNode, before);
	}-*/;
}