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
 * CSS Rule class.
 * 
 */
public class CSSRule extends JsObject {

	/**
	 * Constructs a new rule using a native object.
	 * 
	 * @param jsObj
	 *            the native object
	 */
	public CSSRule(JavaScriptObject jsObj) {
		super(jsObj);
	}

	private static CSSRule instance(JavaScriptObject jsObj) {
		return new CSSRule(jsObj);
	}

	/**
	 * The CSS text.
	 * 
	 * @return css text
	 */
	public native String getCssText() /*-{
		var rule = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return rule.cssText;
	}-*/;

	/**
	 * Returns the parent rule.
	 * 
	 * @return the parent rule
	 */
	public native CSSRule getParentRule()/*-{
		var rule = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var parentRule = rule.parentRule;
		if (parentRule == null || parentRule === undefined) {
			return null;
		} else {
			return @com.ait.toolkit.sencha.ext.client.util.CSSRule::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(parentRule);
		}
	}-*/;
}
