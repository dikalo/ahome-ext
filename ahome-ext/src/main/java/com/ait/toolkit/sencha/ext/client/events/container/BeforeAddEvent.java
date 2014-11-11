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
package com.ait.toolkit.sencha.ext.client.events.container;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.Container;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class BeforeAddEvent extends EventObject {

    public static String EVENT_NAME = Event.BEFORE_ADD;

    private Component source;
    private Container container;
    private int index;

    /**
     * UiBinder implementations
     */
    private static Type<BeforeAddHandler> TYPE = new Type<BeforeAddHandler>(EVENT_NAME, null);

    public static Type<BeforeAddHandler> getType() {
        return TYPE;
    }

    public static Type<BeforeAddHandler> getAssociatedType() {
        return TYPE;
    }

    public BeforeAddEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public BeforeAddEvent(Component source, Container container, int position, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.container = container;
        this.index = position;
    }

    /**
     * @return the source
     */
    public Component getComponent() {
        return source;
    }

    /**
     * @return the container
     */
    public Container getSource() {
        return container;
    }

    /**
     * @return the position
     */
    public int geIndex() {
        return index;
    }

}
