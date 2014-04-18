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
package com.ait.toolkit.sencha.ext.client.events.datepicker;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.DatePicker;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class SelectEvent extends EventObject {

    public static String EVENT_NAME = Event.SELECT;

    private DatePicker source;
    private JsDate date;

    /**
     * UiBinder implementations
     */
    private static Type<SelectHandler> TYPE = new Type<SelectHandler>(EVENT_NAME, null);

    public static Type<SelectHandler> getType() {
        return TYPE;
    }

    public static Type<SelectHandler> getAssociatedType() {
        return TYPE;
    }

    public SelectEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public SelectEvent(DatePicker source, JsDate date, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.date = date;
    }

    /**
     * @return the source
     */
    public DatePicker getSource() {
        return source;
    }

    /**
     * @return the date
     */
    public JsDate getDate() {
        return date;
    }

}
