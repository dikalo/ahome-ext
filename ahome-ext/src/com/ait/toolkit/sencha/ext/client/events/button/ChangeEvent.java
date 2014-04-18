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
package com.ait.toolkit.sencha.ext.client.events.button;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.CycleButton;
import com.ait.toolkit.sencha.ext.client.ui.MenuItem;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ChangeEvent extends EventObject {

    public static String EVENT_NAME = Event.CHANGE;

    private CycleButton source;
    private MenuItem menuItem;

    /**
     * UiBinder implementations
     */
    private static Type<ChangeHandler> TYPE = new Type<ChangeHandler>(EVENT_NAME, null);

    public static Type<ChangeHandler> getType() {
        return TYPE;
    }

    public static Type<ChangeHandler> getAssociatedType() {
        return TYPE;
    }

    public ChangeEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public ChangeEvent(CycleButton source, MenuItem menuItem, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.menuItem = menuItem;
    }

    /**
     * @return the source
     */
    public CycleButton getSource() {
        return source;
    }

    /**
     * @return the menuItem
     */
    public MenuItem getMenuItem() {
        return menuItem;
    }

}
