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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.ext.client.grid.column.GridColumn;
import com.ait.toolkit.sencha.ext.client.ui.TablePanel;
import com.google.gwt.core.client.JavaScriptObject;

public class GridEditEvent extends JsObject {

    public GridEditEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public native TablePanel getGrid() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var grid = e.grid;
		return @com.ait.toolkit.sencha.ext.client.ui.GridPanel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(grid);
    }-*/;

    public native BaseModel getRecord() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var grid = e.record;
		return @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(grid);
    }-*/;

    public native String getField() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return e.field;
    }-*/;

    public native <T> T getValue() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return e.value;
    }-*/;

    public native JavaScriptObject getRow() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return e.row;
    }-*/;

    public native GridColumn getColumn() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = e.column;
		return @com.ait.toolkit.sencha.ext.client.grid.column.GridColumn::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native int getRowIndex() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return e.rowIdx;
    }-*/;

    public native int getColumnIndex() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return e.colIdx;
    }-*/;

    public native void setCancel(boolean value) /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		e.cancel = value;
    }-*/;

    public native boolean isCancel() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return e.cancel;
    }-*/;

    public native <T> T getOriginalValue() /*-{
		var e = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return e.originalValue;
    }-*/;

}
