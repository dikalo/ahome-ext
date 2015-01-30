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
package com.ait.toolkit.sencha.ext.client.selection;

import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.ext.client.events.CallbackRegistration;
import com.ait.toolkit.sencha.ext.client.events.selection.DeselectHandler;
import com.ait.toolkit.sencha.ext.client.events.selection.FocusChangeHandler;
import com.ait.toolkit.sencha.ext.client.events.selection.SelectHandler;
import com.ait.toolkit.sencha.ext.client.events.selection.SelectionChangeHandler;
import com.ait.toolkit.sencha.shared.client.core.ObservableJso;
import com.ait.toolkit.sencha.shared.client.data.NodeInterface;
import com.ait.toolkit.sencha.shared.client.data.Store;
import com.ait.toolkit.sencha.shared.client.util.MixedCollection;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Tracks what records are currently selected in a databound component.
 */
public class SelectionModel extends ObservableJso {

	protected SelectionModel() {
		jsObj = JsoHelper.createObject();
	}

	protected SelectionModel(JavaScriptObject obj) {
		this.jsObj = obj;
	}

	/**
	 * A {@link MixedCollection} that maintains all of the currently selected
	 * records.
	 * 
	 * @return
	 */
	public native MixedCollection getSelected()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso.selected;
		return @com.ait.toolkit.sencha.shared.client.util.MixedCollection::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Gets the current position
	 */
	public native CellPosition getCurrentPosition()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (!jso.getCurrentPosition) {
			return null;
		}
		var obj = jso.getCurrentPosition();
		return @com.ait.toolkit.sencha.ext.client.selection.CellPosition::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Binds a store to this instance.
	 * 
	 * @param store
	 *            , The store to bind . When no store given (or when null or
	 *            undefined passed), unbinds the existing store.
	 */
	public native void bindStore(Store store)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso
				.bindStore(store.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Binds a store to this instance.
	 * 
	 * @param store
	 *            , The store to bind . When no store given (or when null or
	 *            undefined passed), unbinds the existing store.
	 * @param initial
	 *            , True to not remove listeners from existing store.(Default to
	 *            false)
	 */
	public native void bindStore(Store store, boolean initial)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.bindStore(
				store.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				initial);
	}-*/;

	/**
	 * Deselects all records in the view.
	 */
	public native void deselectAll()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.deselectAll();
	}-*/;

	/**
	 * Deselects all records in the view.
	 */
	public native void deselectAll(boolean suppressEvent)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.deselectAll(suppressEvent);
	}-*/;

	/**
	 * Deselects all records in the view.
	 */
	public native void deselect(List<BaseModel> elements)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var peers = @com.ait.toolkit.data.client.BaseModel::fromList(Ljava/util/List;)(elements);
		jso.deselect(peers);
	}-*/;

	/**
	 * Deselects all records in the view.
	 */
	public native void deselect(List<BaseModel> elements, boolean suppressEvent)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var peers = @com.ait.toolkit.data.client.BaseModel::fromList(Ljava/util/List;)(elements);
		jso.deselect(peers, suppressEvent);
	}-*/;

	/**
	 * Deselects all records in the view.
	 */
	public native void deselect(int records)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.deselect(records);
	}-*/;

	/**
	 * Deselects all records in the view.
	 */
	public native void deselect(int records, boolean suppressEvent)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.deselect(records, suppressEvent);
	}-*/;

	/**
	 * Returns the count of selected records.
	 */
	public native int getCount()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.getCount();
	}-*/;

	/**
	 * Returns an array of the currently selected records.
	 */
	public native List<BaseModel> getSelection()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso.getSelection();
		return @com.ait.toolkit.data.client.BaseModel::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Returns the current selectionMode.
	 * 
	 * @return The selectionMode: 'SINGLE', 'MULTI' or 'SIMPLE'.
	 */
	public native String getSelectionMode()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.getSelectionMode();
	}-*/;

	/**
	 * Gets the current store instance.
	 */
	public native Store getStore()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso.getStore();
		return @com.ait.toolkit.sencha.shared.client.data.Store::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Returns true if there are any a selected records.
	 */
	public native boolean hasSelection()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.hasSelection();
	}-*/;

	/**
	 * Returns true if there are any a selected records.
	 */
	public native boolean isFocused(BaseModel model)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso
				.isFocused(model.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Returns true if the selections are locked.
	 */
	public native boolean isLocked()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isLocked();
	}-*/;

	/**
	 * Returns true if the specified row is selected.
	 */
	public native boolean isSelected(BaseModel model)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso
				.isSelected(model.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Returns true if the specified row is selected.
	 */
	public native boolean isSelected(int row)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isSelected(row);
	}-*/;

	/**
	 * Selects a record instance by record instance or index.
	 * 
	 * @param records
	 */
	public void select(NodeInterface... records) {
		for (NodeInterface node : records) {
			_select(node);
		}
	}

	/**
	 * Selects a record instance by record instance or index.
	 * 
	 * @param records
	 */
	public void select(boolean keepExisting, NodeInterface... records) {
		for (NodeInterface node : records) {
			_select(node, keepExisting);
		}
	}

	/**
	 * Selects a record instance by record instance or index.
	 * 
	 * @param records
	 */
	public void select(boolean keepExisting, boolean suppressEvent,
			NodeInterface... records) {
		for (NodeInterface node : records) {
			_select(node, keepExisting, suppressEvent);
		}
	}

	/**
	 * Selects a record instance by record instance or index.
	 * 
	 * @param records
	 */
	public void select(List<NodeInterface> records) {
		for (NodeInterface node : records) {
			_select(node);
		}
	}

	/**
	 * Selects a record instance by record instance or index.
	 * 
	 * @param records
	 */
	public void select(List<NodeInterface> records, boolean keepExisiting) {
		for (NodeInterface node : records) {
			_select(node, keepExisiting);
		}
	}

	/**
	 * Selects a record instance by record instance or index.
	 * 
	 * @param records
	 */
	public void select(List<NodeInterface> records, boolean keepExisiting,
			boolean suppressEvent) {
		for (NodeInterface node : records) {
			_select(node, keepExisiting, suppressEvent);
		}
	}

	/**
	 * Selects a record instance by record instance or index.
	 * 
	 * @param records
	 */
	public native void select(int row)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.select(row);
		}
	}-*/;

	/**
	 * Selects a record instance by record instance or index.
	 * 
	 * @param records
	 */
	public native void select(int row, boolean keepExisting)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.select(row, keepExisting);
		}
	}-*/;

	/**
	 * Selects a record instance by record instance or index.
	 * 
	 * @param records
	 */
	public native void select(int row, boolean keepExisting,
			boolean suppressEvent)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.select(row, keepExisting, suppressEvent);
		}
	}-*/;

	/**
	 * Selects all records in the view.
	 */
	public native void selectAll()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.selectAll();
		}
	}-*/;

	/**
	 * Selects all records in the view.
	 */
	public native void selectAll(boolean suppressEvent)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.selectAll(suppressEvent);
		}
	}-*/;

	/**
	 * Selects a range of rows if the selection model is not locked. All rows in
	 * between startRow and endRow are also selected..
	 */
	public native void selectRange(int startRow, int endRow)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.selectRange(startRow, endRow);
		}
	}-*/;

	/**
	 * Selects a range of rows if the selection model is not locked. All rows in
	 * between startRow and endRow are also selected..
	 */
	public native void selectRange(int startRow, int endRow,
			boolean keepExisting)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.selectRange(startRow, endRow, keepExisting);
		}
	}-*/;

	/**
	 * Sets a record as the last focused record. This does NOT mean that the
	 * record has been selected.
	 */
	public native void setLastFocused(BaseModel record)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso
					.setLastFocused(record.@com.ait.toolkit.core.client.JsObject::jsObj);
		}
	}-*/;

	/**
	 * Locks the current selection and disables any changes from happening to
	 * the selection.
	 */
	public native void setLocked(boolean locked)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.setLocked(locked);
		}
	}-*/;

	/**
	 * Fired when a row is focused
	 */
	public native CallbackRegistration addFocusChangeHandler(
			FocusChangeHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(model, of, nf, e) {
			var sm = @com.ait.toolkit.sencha.ext.client.selection.SelectionModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(model);
			var oldFocused = @com.ait.toolkit.data.client.TableItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(of);
			var newFocused = @com.ait.toolkit.data.client.TableItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(nf);

			var event = @com.ait.toolkit.sencha.ext.client.events.selection.FocusChangeEvent::new(Lcom/ait/toolkit/sencha/ext/client/selection/SelectionModel;Lcom/ait/toolkit/data/client/TableItem;Lcom/ait/toolkit/data/client/TableItem;Lcom/google/gwt/core/client/JavaScriptObject;)(sm, oldFocused, newFocused)
			handler.@com.ait.toolkit.sencha.ext.client.events.selection.FocusChangeHandler::onFocusChange(Lcom/ait/toolkit/sencha/ext/client/events/selection/FocusChangeEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.selection.FocusChangeEvent::EVENT_NAME;
		obj.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.CallbackRegistration::new(Lcom/ait/toolkit/core/client/JsObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName, fn);
		return toReturn;
	}-*/;

	/**
	 * Fired after a selection change has occurred
	 */
	public native CallbackRegistration addSelectionChangeHandler(
			SelectionChangeHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(model, selection, e) {
			var sm = @com.ait.toolkit.sencha.ext.client.selection.SelectionModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(model);
			var items = @com.ait.toolkit.data.client.TableItem::fromArray(Lcom/google/gwt/core/client/JavaScriptObject;)(selection);

			var event = @com.ait.toolkit.sencha.ext.client.events.selection.SelectionChangeEvent::new(Lcom/ait/toolkit/sencha/ext/client/selection/SelectionModel;Ljava/util/List;Lcom/google/gwt/core/client/JavaScriptObject;)(sm,item,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.selection.SelectionChangeHandler::onSelectionChange(Lcom/ait/toolkit/sencha/ext/client/events/selection/SelectionChangeEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.selection.SelectionChangeEvent::EVENT_NAME;
		obj.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.CallbackRegistration::new(Lcom/ait/toolkit/core/client/JsObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName, fn);
		return toReturn;
	}-*/;

	/**
	 * Fired after a record is selected
	 */
	public native CallbackRegistration addSelectHandler(SelectHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(model, record, row, column, e) {
			var sm = @com.ait.toolkit.sencha.ext.client.selection.SelectionModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(model);
			var model = @com.ait.toolkit.data.client.BaseModel::from(Lcom/google/gwt/core/client/JavaScriptObject;)(record);
			var event = @com.ait.toolkit.sencha.ext.client.events.selection.SelectEvent::new(Lcom/ait/toolkit/sencha/ext/client/selection/SelectionModel;Lcom/ait/toolkit/data/client/BaseModel;IILcom/google/gwt/core/client/JavaScriptObject;)(sm,model,row,column,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.selection.SelectHandler::onSelect(Lcom/ait/toolkit/sencha/ext/client/events/selection/SelectEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.selection.SelectEvent::EVENT_NAME;
		obj.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.CallbackRegistration::new(Lcom/ait/toolkit/core/client/JsObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName, fn);
		return toReturn;
	}-*/;

	/**
	 * Fired after a record is deselected
	 */
	public native CallbackRegistration addDeselectHandler(
			DeselectHandler handler)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(model, record, row, column, e) {
			var sm = @com.ait.toolkit.sencha.ext.client.selection.SelectionModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(model);
			var model = @com.ait.toolkit.data.client.BaseModel::from(Lcom/google/gwt/core/client/JavaScriptObject;)(record);
			var event = @com.ait.toolkit.sencha.ext.client.events.selection.DeselectEvent::new(Lcom/ait/toolkit/sencha/ext/client/selection/SelectionModel;Lcom/ait/toolkit/data/client/BaseModel;IILcom/google/gwt/core/client/JavaScriptObject;)(sm,model,row,column,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.selection.DeselectHandler::onDeselect(Lcom/ait/toolkit/sencha/ext/client/events/selection/DeselectEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.selection.DeselectEvent::EVENT_NAME;
		obj.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.CallbackRegistration::new(Lcom/ait/toolkit/core/client/JsObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName, fn);
		return toReturn;
	}-*/;

	private native void _select(NodeInterface record)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = record.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso && obj) {
			jso.select(obj);
		}
	}-*/;

	private native void _select(NodeInterface record, boolean keepExisting)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = record.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso && obj) {
			jso.select(obj, keepExisting);
		}
	}-*/;

	private native void _select(NodeInterface record, boolean keepExisting,
			boolean suppressEvent)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = record.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso && obj) {
			jso.select(obj, keepExisting, suppressEvent);
		}
	}-*/;

}
