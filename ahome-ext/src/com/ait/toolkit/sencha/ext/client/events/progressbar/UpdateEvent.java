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
package com.ait.toolkit.sencha.ext.client.events.progressbar;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.ProgressBar;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class UpdateEvent extends EventObject {

    public static String EVENT_NAME = Event.UPDATE;

    private ProgressBar source;
    private double value;
    private String text;

    /**
     * UiBinder implementations
     */
    private static Type<UpdateHandler> TYPE = new Type<UpdateHandler>(EVENT_NAME, null);

    public static Type<UpdateHandler> getType() {
        return TYPE;
    }

    public static Type<UpdateHandler> getAssociatedType() {
        return TYPE;
    }

    public UpdateEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public UpdateEvent(ProgressBar source, double value, String text, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.value = value;
        this.text = text;
    }

    /**
     * @return the source
     */
    public ProgressBar getSource() {
        return source;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

}
