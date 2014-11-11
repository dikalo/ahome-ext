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
package com.ait.toolkit.sencha.ext.client.events.component;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class BoxReadyEvent extends EventObject {

    public static String EVENT_NAME = Event.BOX_READY;

    private Component source;
    private double height;
    private double width;

    /**
     * UiBinder implementations
     */
    private static Type<BoxReadyHandler> TYPE = new Type<BoxReadyHandler>(EVENT_NAME, null);

    public static Type<BoxReadyHandler> getType() {
        return TYPE;
    }

    public static Type<BoxReadyHandler> getAssociatedType() {
        return TYPE;
    }

    public BoxReadyEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public BoxReadyEvent(Component source, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
    }

    public BoxReadyEvent(Component source, double height, double width, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.height = height;
        this.width = width;
    }

    /**
     * @return the source
     */
    public Component getSource() {
        return source;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

}
