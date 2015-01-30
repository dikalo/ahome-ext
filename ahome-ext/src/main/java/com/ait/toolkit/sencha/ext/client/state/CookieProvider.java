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
package com.ait.toolkit.sencha.ext.client.state;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Provider implementation which saves and retrieves state via cookies. Uasge:
 * *
 * 
 * <pre>
 * CookieProvider cp = new CookieProvider(...);
 * StateManager.setProvider(cp);
 * </pre>
 * 
 * @see com.ait.toolkit.sencha.ext.client.state.StateManager
 */
public class CookieProvider extends Provider {

	public CookieProvider() {
		jsObj = createPeer();
	}

	/**
	 * Creates a new Cookieprovider using the specified configuration.
	 * 
	 * @param config
	 *            the configuration
	 */
	public CookieProvider(CookieProviderConfig config) {
		jsObj = createPeer(config.getJsObj());
	}

	private native JavaScriptObject createPeer() /*-{
		return new $wnd.Ext.state.CookieProvider();
	}-*/;

	private native JavaScriptObject createPeer(JavaScriptObject config) /*-{
		return new $wnd.Ext.state.CookieProvider(config);
	}-*/;
}
