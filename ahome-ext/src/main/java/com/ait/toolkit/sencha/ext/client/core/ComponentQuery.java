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

import java.util.List;

import com.ait.toolkit.sencha.ext.client.ui.ComponentFactory;
import com.ait.toolkit.sencha.ext.client.ui.Container;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Provides searching of Components within {@link ComponentManager} (globally)
 * or a specific {@link Container} on the document with a similar syntax to a
 * CSS selector. Returns List of matching Components, or empty List.
 */
public class ComponentQuery {

    private ComponentQuery() {

    }

    /**
     * Tests whether the passed Component matches the selector string.
     */
    public static native boolean is(Component component, String selector)/*-{
		return $wnd.Ext.ComponentQuery
				.is(
						component.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()(),
						selector);
    }-*/;

    /**
     * Returns an array of matched Components from within the passed root
     * object.
     * <p>
     * This method filters returned Components in a similar way to how CSS
     * selector based DOM queries work using a textual selector string.
     */
    public static List<Component> query(String selector) {
        return ComponentFactory.fromJsArray(_query(selector));
    }

    /**
     * Returns an array of matched Components from within the passed root
     * object.
     * <p>
     * This method filters returned Components in a similar way to how CSS
     * selector based DOM queries work using a textual selector string.
     */
    public static List<Component> query(String selector, Container root) {
        return ComponentFactory.fromJsArray(_query(selector, root));
    }

    private static native JavaScriptObject _query(String selector)/*-{
		return $wnd.Ext.ComponentQuery.query(selector);
    }-*/;

    private static native JavaScriptObject _query(String selector, Container root)/*-{
		return $wnd.Ext.ComponentQuery
				.query(
						selector,
						root.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()());
    }-*/;

}
