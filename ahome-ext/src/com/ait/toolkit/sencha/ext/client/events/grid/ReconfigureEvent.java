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

import java.util.List;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.grid.column.GridColumn;
import com.ait.toolkit.sencha.ext.client.ui.GridPanel;
import com.ait.toolkit.sencha.shared.client.data.Store;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ReconfigureEvent extends EventObject {

	public static String EVENT_NAME = Event.RECONFIGURE;

	private Store store;
	private GridPanel panel;
	List<GridColumn> columns;
	private Store oldStore;
	List<GridColumn> columnHeaders;

	/**
	 * UiBinder implementations
	 */
	private static Type<ReconfigureHandler> TYPE = new Type<ReconfigureHandler>(
			EVENT_NAME, null);

	public static Type<ReconfigureHandler> getType() {
		return TYPE;
	}

	public static Type<ReconfigureHandler> getAssociatedType() {
		return TYPE;
	}

	public ReconfigureEvent(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public ReconfigureEvent(Store store, JavaScriptObject nativeEvent) {
		super(nativeEvent);

	}

	/**
	 * @return the store
	 */
	public Store getStore() {
		return store;
	}

	/**
	 * @return the panel
	 */
	public GridPanel getPanel() {
		return panel;
	}

	/**
	 * @return the columns
	 */
	public List<GridColumn> getColumns() {
		return columns;
	}

	/**
	 * @return the oldStore
	 */
	public Store getOldStore() {
		return oldStore;
	}

	/**
	 * @return the columnHeaders
	 */
	public List<GridColumn> getColumnHeaders() {
		return columnHeaders;
	}

}
