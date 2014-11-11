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
import com.ait.toolkit.sencha.ext.client.events.menu.BeforeCheckChangeHandler;
import com.ait.toolkit.sencha.ext.client.events.menu.BeforeItemCheckChangeHandler;
import com.ait.toolkit.sencha.ext.client.events.menu.CheckChangeHandler;
import com.google.gwt.core.client.JavaScriptObject;

public class MenuCheckItem extends MenuItem {

    private static JavaScriptObject configPrototype;

    private native void init()/*-{
		var c = new $wnd.Ext.menu.CheckItem();
		@com.ait.toolkit.sencha.ext.client.ui.MenuCheckItem::configPrototype = c.initialConfig;
    }-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return XType.MENU_CHECK_ITEM.getValue();
    }

    /**
     * Create a new NotificationContainer.
     */
    public MenuCheckItem() {
        // init();
    }

    public MenuCheckItem(JavaScriptObject obj) {
        super(obj);
    }

    public MenuCheckItem(String text) {
        this();
        setText(text);
    }

    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.menu.CheckItem(config);
    }-*/;

    /**
     * True to prevent the checked item from being toggled. Any submenu will
     * still be accessible.
     * 
     * Defaults to: false
     * 
     * @return
     */
    public void setCheckChangeDisabled(boolean value) {
        setAttribute("checkChangeDisable", value, true);
    }

    /**
     * The CSS class used by cls to show the checked state. Defaults to
     * Ext.baseCSSPrefix + 'menu-item-checked'.
     * 
     * Defaults to: "x-menu-item-checked"
     * 
     * @return
     */
    public void setCheckedCls(String value) {
        setAttribute("checkedCls", value, true);
    }

    /**
     * Name of a radio group that the item belongs.
     * 
     * Specifying this option will turn check item into a radio item.
     * 
     * Note that the group name must be globally unique.
     * 
     * @return
     */
    public void setGroup(String value) {
        setAttribute("group", value, true);
    }

    /**
     * The CSS class applied to this item's icon image to denote being a part of
     * a radio group. Defaults to Ext.baseCSSClass + 'menu-group-icon'. Any
     * specified iconCls overrides this.
     * 
     * Defaults to: "x-menu-group-icon"
     * 
     * @return
     */
    public void setGroupCls(String value) {
        setAttribute("groupCls", value, true);
    }

    /**
     * The CSS class used by cls to show the unchecked state. Defaults to
     * Ext.baseCSSPrefix + 'menu-item-unchecked'.
     * 
     * Defaults to: "x-menu-item-unchecked"
     * 
     * @return
     */
    public void setUncheckCls(boolean value) {
        setAttribute("uncheckCls", value, true);
    }

    /**
     * Disables just the checkbox functionality of this menu Item. If this menu
     * item has a submenu, that submenu will still be accessible
     * 
     */
    public native void disableCheckChange() /*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.disableCheckChange();
    }-*/;

    /**
     * Reenables the checkbox functionality of this menu item after having been
     * disabled by disableCheckChange
     * 
     */
    public native void enableCheckChange() /*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.enableCheckChange();
    }-*/;

    /**
     * Sets the checked state of the item
     * 
     * @param value
     *            , true to check, false to uncheck
     * 
     */
    public native void setChecked(boolean value) /*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.setChecked(value);
    }-*/;

    /**
     * Sets the checked state of the item
     * 
     * @param value
     *            , true to check, false to uncheck
     * 
     * @param supressEvent
     *            , True to prevent firing the checkchange events.. Default to
     *            false
     */
    public native void setChecked(boolean value, boolean supressEvent) /*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.setChecked(value, supressEvent);
    }-*/;

    /**
     * Fires before a change event. Return false to cancel.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native void addBeforeCheckChangeHandler(BeforeItemCheckChangeHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_CHECK_CHANGE,
							$entry(function(m, checked) {
								var menu = @com.ait.toolkit.sencha.ext.client.ui.MenuCheckItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
								return handler.@com.ait.toolkit.sencha.ext.client.events.menu.BeforeItemCheckChangeHandler::onEvent(Lcom/ait/toolkit/sencha/ext/client/ui/MenuCheckItem;Z)(menu, checked);
							}));
		}

    }-*/;

    public native HandlerRegistration addBeforeCheckChangeHandler(BeforeCheckChangeHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(m, checked, e) {
			var menu = @com.ait.toolkit.sencha.ext.client.ui.MenuCheckItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
			var event = @com.ait.toolkit.sencha.ext.client.events.menu.BeforeCheckChangeEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/MenuCheckItem;ZLcom/google/gwt/core/client/JavaScriptObject;)(menu,checked,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.menu.BeforeCheckChangeHandler::onBeforeCheckChange(Lcom/ait/toolkit/sencha/ext/client/events/menu/BeforeCheckChangeEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.menu.BeforeCheckChangeEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addCheckChangeHandler(CheckChangeHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(m, checked, e) {
			var menu = @com.ait.toolkit.sencha.ext.client.ui.MenuCheckItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
			var event = @com.ait.toolkit.sencha.ext.client.events.menu.CheckChangeEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/MenuCheckItem;ZLcom/google/gwt/core/client/JavaScriptObject;)(menu,checked,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.menu.CheckChangeHandler::onCheckChange(Lcom/ait/toolkit/sencha/ext/client/events/menu/CheckChangeEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.menu.CheckChangeEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Creates a new MenuCheckItem from the given component
     * 
     * @param component
     *            , the component to cast from
     * @return, a new MenuCheckItem from the component
     * 
     */
    public static MenuCheckItem cast(Component component) {
        return new MenuCheckItem(component.getOrCreateJsObj());
    }
}
