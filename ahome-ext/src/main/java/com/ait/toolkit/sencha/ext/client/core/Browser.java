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
package com.ait.toolkit.sencha.ext.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Provides useful information about the current browser.
 */
public class Browser extends JsObject {

	Browser(JavaScriptObject obj) {
		super(obj);
	}

	public native boolean is(String value) /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.is(value);
	}-*/;

	public boolean isIE() {
		return is("IE");
	}

	public boolean isFireFox() {
		return is("Firefox");
	}

	public boolean isSafari() {
		return is("Safari");
	}

	public boolean isChrome() {
		return is("Chrome");
	}

	public boolean isOpera() {
		return is("Opera");
	}

	public boolean isWebKit() {
		return is("Webkit");
	}

	public boolean isGecko() {
		return is("Gecko");
	}

	public boolean isPresto() {
		return is("Presto");
	}

	public boolean isTrident() {
		return is("Trident");
	}

	public boolean isWebView() {
		return is("WebView");
	}

	public boolean isOther() {
		return is("Other");
	}

	/**
	 * The full name of the current browser's engine. Possible values are:
	 * <ul>
	 * <li>
	 * WebKit</li>
	 * <li>Gecko</li>
	 * <li>Presto</li>
	 * <li>Trident</li>
	 * <li>Other</li>
	 * </ul>
	 * 
	 * @return
	 */
	public native String getEngineName() /*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.engineName;
	}-*/;
}
