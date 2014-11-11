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

import com.ait.toolkit.application.client.JavaScriptLoadCallback;
import com.ait.toolkit.application.client.ResourceInjector;
import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Utility class to inject Ext4j resources. This class should be used while
 * developing for different devices and form factors. The class will help you
 * inject Ext JS on demand
 * 
 */
public class Ext4jInjector extends ResourceInjector {

	public Ext4jInjector(String extCSSLink, String extJsLink) {
		super(extCSSLink, extJsLink);
	}

	public void inject(final Function handler) {
		this.setJsLoadCallback(new JavaScriptLoadCallback() {
			@Override
			public void onJsLoaded() {
				linkElement.setId(Ext.AIT_MAIN_EXT_THEME_ID);
				JsoHelper.setAttribute(scriptElement, "id", Ext.AIT_MAIN_EXT_JS_ID);
				Ext.onReady(handler);
			}
		}).inject();

	}

}
