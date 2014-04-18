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
package com.ait.toolkit.sencha.ext.client.events.form;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.field.FieldBase;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class WritableChangeEvent extends EventObject {

    public static String EVENT_NAME = Event.WRITEABLE_CHANGE;

    private FieldBase source;
    private boolean read;

    /**
     * UiBinder implementations
     */
    private static Type<WritableChangeHandler> TYPE = new Type<WritableChangeHandler>(EVENT_NAME, null);

    public static Type<WritableChangeHandler> getType() {
        return TYPE;
    }

    public static Type<WritableChangeHandler> getAssociatedType() {
        return TYPE;
    }

    public WritableChangeEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public WritableChangeEvent(FieldBase source, boolean read, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.read = read;
    }

    /**
     * @return the source
     */
    public FieldBase getSource() {
        return source;
    }

    /**
     * @return the read
     */
    public boolean isRead() {
        return read;
    }

}
