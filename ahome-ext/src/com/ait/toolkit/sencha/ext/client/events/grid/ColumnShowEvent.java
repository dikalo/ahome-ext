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
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.grid.HeaderContainer;
import com.ait.toolkit.sencha.ext.client.grid.column.GridColumn;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ColumnShowEvent extends EventObject {

    public static String EVENT_NAME = Event.COLUMN_SHOW;

    private HeaderContainer source;
    private GridColumn column;

    /**
     * UiBinder implementations
     */
    private static Type<ColumnShowHandler> TYPE = new Type<ColumnShowHandler>(EVENT_NAME, null);

    public static Type<ColumnShowHandler> getType() {
        return TYPE;
    }

    public static Type<ColumnShowHandler> getAssociatedType() {
        return TYPE;
    }

    public ColumnShowEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public ColumnShowEvent(HeaderContainer source, GridColumn column, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.column = column;

    }

    /**
     * @return the source
     */
    public HeaderContainer getHeaderContainer() {
        return source;
    }

    /**
     * @return the column
     */
    public GridColumn getColumn() {
        return column;
    }

}
