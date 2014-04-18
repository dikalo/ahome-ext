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
package com.ait.toolkit.sencha.ext.client.events.grid;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.selection.RowSelectionModel;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class BeforeSelectEvent extends EventObject {

    public static String EVENT_NAME = Event.BEFORE_DESELECT;

    private RowSelectionModel source;
    private BaseModel record;
    private int index;

    /**
     * UiBinder implementations
     */
    private static Type<BeforeDeselectHandler> TYPE = new Type<BeforeDeselectHandler>(EVENT_NAME, null);

    public static Type<BeforeDeselectHandler> getType() {
        return TYPE;
    }

    public static Type<BeforeDeselectHandler> getAssociatedType() {
        return TYPE;
    }

    public BeforeSelectEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public BeforeSelectEvent(RowSelectionModel source, BaseModel record, int index, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.record = record;
        this.index = index;

    }

    /**
     * @return the source
     */
    public RowSelectionModel getSelectionModel() {
        return source;
    }

    /**
     * @return the record
     */
    public BaseModel getRecord() {
        return record;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

}
