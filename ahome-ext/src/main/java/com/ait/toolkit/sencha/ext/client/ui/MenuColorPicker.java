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
package com.ait.toolkit.sencha.ext.client.ui;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.ext.client.core.config.XType;
import com.ait.toolkit.sencha.ext.client.events.HandlerRegistration;
import com.ait.toolkit.sencha.ext.client.events.menu.SelectHandler;
import com.google.gwt.core.client.JavaScriptObject;

public class MenuColorPicker extends Menu {

    private static JavaScriptObject configPrototype;

    private native void init()/*-{
		var c = new $wnd.Ext.menu.ColorPicker();
		@com.ait.toolkit.sencha.ext.client.ui.MenuColorPicker::configPrototype = c.initialConfig;
    }-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return XType.COLOR_MENU.getValue();
    }

    /**
     * Create a new NotificationContainer.
     */
    public MenuColorPicker() {
        // init();
    }

    public MenuColorPicker(JavaScriptObject obj) {
        super(obj);
    }

    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.menu.ColorPicker(config);
    }-*/;

    /**
     * True to prevent the checked item from being toggled. Any submenu will
     * still be accessible.
     * 
     * Defaults to: false
     * 
     * @return
     */
    public void setHideOnClick(boolean value) {
        setAttribute("hideOnClick", value, true);
    }

    /**
     * An id to assign to the underlying color picker.
     * 
     * Defaults to: null
     * 
     * @return
     */
    public void setPickerId(String value) {
        setAttribute("pickerId", value, true);
    }

    /**
     * The {@link ColorPicker} instance for this ColorMenu
     */
    public native ColorPicker getPicker() /*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var obj = component.picker;
		return @com.ait.toolkit.sencha.ext.client.ui.ColorPicker::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Fires when a color is selected
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native HandlerRegistration addSelectHandler(SelectHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(m, c, e) {
			var menu = @com.ait.toolkit.sencha.ext.client.ui.Menu::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
			var event = @com.ait.toolkit.sencha.ext.client.events.menu.SelectEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/Menu;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(menu,color,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.menu.SelectHandler::onSelect(Lcom/ait/toolkit/sencha/ext/client/events/menu/SelectEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.menu.SelectEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Creates a new MenuColorPicker from the given component
     * 
     * @param component
     *            , the component to cast from
     * @return, a new MenuColorPicker from the component
     * 
     */
    public static MenuColorPicker cast(Component component) {
        return new MenuColorPicker(component.getOrCreateJsObj());
    }

}
