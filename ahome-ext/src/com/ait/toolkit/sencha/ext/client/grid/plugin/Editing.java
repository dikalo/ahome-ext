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
package com.ait.toolkit.sencha.ext.client.grid.plugin;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.core.config.Attribute;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeEditHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.EditHandler;
import com.ait.toolkit.sencha.ext.client.grid.column.GridColumn;
import com.google.gwt.core.client.JavaScriptObject;

public class Editing extends AbstractPlugin {

    public Editing() {

    }

    protected Editing(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * The number of clicks on a grid required to display the editor. The only
     * accepted values are 1 and 2.
     * <p>
     * Defaults to: 2
     * 
     * @param value
     */
    public void setClicksToEdit(int value) {
        JsoHelper.setAttribute(jsObj, Attribute.CLICK_TO_EDIT.getValue(), value);
    }

    /**
     * The event which triggers editing. Supercedes the clicksToEdit
     * configuration. Maybe one of:
     * <p>
     * cellclick, celldblclick, cellfocus, rowfocus.
     */
    public void setTriggerEvent(String value) {
        JsoHelper.setAttribute(jsObj, Attribute.TRIGGER_EVENT.getValue(), value);
    }

    /**
     * Cancels any active editing.
     */
    public native void cancelEdit()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.cancelEdit();
    }-*/;

    /**
     * Completes the edit if there is an active edit in progress.
     */
    public native void completeEdit()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.completeEdit();
    }-*/;

    public native void addBeforeEditHandler(BeforeEditHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_EDIT,
						$entry(function(p, e) {
							var editing = @com.ait.toolkit.sencha.ext.client.grid.plugin.Editing::new(Lcom/google/gwt/core/client/JavaScriptObject;)(p);
							var event = @com.ait.toolkit.sencha.ext.client.events.grid.GridEditEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							return handler.@com.ait.toolkit.sencha.ext.client.events.grid.BeforeEditHandler::onEvent(Lcom/ait/toolkit/sencha/ext/client/grid/plugin/Editing;Lcom/ait/toolkit/sencha/ext/client/events/grid/GridEditEvent;)(editing,event);
						}));
    }-*/;

    public void addCancelEditHandler(EditHandler handler) {
        _addHandler(Event.CANCEL_EDIT, handler);
    }

    public void addEditHandler(EditHandler handler) {
        _addHandler(Event.EDIT, handler);
    }

    public void addValidateEditHandler(EditHandler handler) {
        _addHandler(Event.VALIDATE_EDIT, handler);
    }

    /**
     * Starts editing the specified record, using the specified Column
     * definition to define which field is being edited.
     */
    public native void startEdit(BaseModel model, GridColumn column)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.startEdit(
				model.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				column.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public void startEdit() {
        startEdit(0, 0);
    }

    public native void startEdit(int row, int col)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.startEdit(row, col);
    }-*/;

    private native void _addHandler(String event, EditHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.addEventListener(
						event,
						$entry(function(p, e) {
							var editing = @com.ait.toolkit.sencha.ext.client.grid.plugin.Editing::new(Lcom/google/gwt/core/client/JavaScriptObject;)(p);
							var event = @com.ait.toolkit.sencha.ext.client.events.grid.GridEditEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.ait.toolkit.sencha.ext.client.events.grid.EditHandler::onEvent(Lcom/ait/toolkit/sencha/ext/client/grid/plugin/Editing;Lcom/ait/toolkit/sencha/ext/client/events/grid/GridEditEvent;)(editing,event);
						}));
    }-*/;

}
