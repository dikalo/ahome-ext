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
package com.ait.toolkit.sencha.ext.client.util;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A wrapper class which can be applied to any element. Fires a "click" event
 * while the mouse is pressed. The interval between firings may be specified in
 * the config but defaults to 10 milliseconds. Optionally, a CSS class may be
 * applied to the element during the time it is pressed.
 * 
 */
public class ClickRepeater extends JsObject {

	/**
	 * Create a new ClickRepeater.
	 * 
	 * @param config
	 *            ClickRepeater configuration
	 */
	public ClickRepeater(ClickRepeaterConfig config) {
		jsObj = createPeer(config.getJsObj());
	}

	private native JavaScriptObject createPeer(JavaScriptObject config) /*-{
		return new $wnd.Ext.util.ClickRepeater(config);
	}-*/;

	/**
	 * Add a ClickRepeater listener.
	 * 
	 * @param listener
	 *            the listener
	 */
	public native void addListener(ClickRepeaterListener listener)/*-{
		var cr = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var crJ = this;

		cr
				.addListener(
						'click',
						function(source) {
							listener.@com.ait.toolkit.sencha.ext.client.util.ClickRepeaterListener::onClick(Lcom/ait/toolkit/sencha/ext/client/util/ClickRepeater;)(crJ);
						});

		cr
				.addListener(
						'mousedown',
						function(source) {
							listener.@com.ait.toolkit.sencha.ext.client.util.ClickRepeaterListener::onMouseDown(Lcom/ait/toolkit/sencha/ext/client/util/ClickRepeater;)(crJ);
						});

		cr
				.addListener(
						'mouseup',
						function(source) {
							listener.@com.ait.toolkit.sencha.ext.client.util.ClickRepeaterListener::onMouseUp(Lcom/ait/toolkit/sencha/ext/client/util/ClickRepeater;)(crJ);
						});
	}-*/;
}
