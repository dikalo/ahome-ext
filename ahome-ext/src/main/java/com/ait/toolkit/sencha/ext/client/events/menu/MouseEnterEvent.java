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
package com.ait.toolkit.sencha.ext.client.events.menu;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.Menu;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

/**
 * Events that s fired when a button is clicked
 */
public class MouseEnterEvent extends EventObject {

    public static String EVENT_NAME = Event.MOUSE_ENTER;

    private Menu source;

    /**
     * UiBinder implementations
     */
    private static Type<MouseEnterHandler> TYPE = new Type<MouseEnterHandler>(EVENT_NAME, null);

    public static Type<MouseEnterHandler> getType() {
        return TYPE;
    }

    public static Type<MouseEnterHandler> getAssociatedType() {
        return TYPE;
    }

    public MouseEnterEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public MouseEnterEvent(Menu source, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
    }

    /**
     * @return the source
     */
    public Menu getSource() {
        return source;
    }

}
