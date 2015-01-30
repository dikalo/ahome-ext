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
package com.ait.toolkit.sencha.ext.client.events.panel;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.core.handlers.AbstractHandler;
import com.ait.toolkit.sencha.ext.client.ui.PanelHeader;
import com.ait.toolkit.sencha.ext.client.ui.Tool;
import com.ait.toolkit.sencha.shared.client.dom.ExtElement;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A base handler to use for when the tool is clicked.
 */
public abstract class ToolHandler extends AbstractHandler {

	final JavaScriptObject jsoPeer = createPeer(this);

	private static native JavaScriptObject createPeer(ToolHandler listener) /*-{
		return function(e, el, o, t) {
			var eventObject = @com.ait.toolkit.sencha.shared.client.core.EventObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			var extElement = @com.ait.toolkit.sencha.shared.client.dom.ExtElement::new(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
			var header = @com.ait.toolkit.sencha.ext.client.ui.PanelHeader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
			var tool = @com.ait.toolkit.sencha.ext.client.ui.Tool::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
			listener.@com.ait.toolkit.sencha.ext.client.events.panel.ToolHandler::onClick(Lcom/ait/toolkit/sencha/shared/client/core/EventObject;Lcom/ait/toolkit/sencha/shared/client/dom/ExtElement;Lcom/ait/toolkit/sencha/ext/client/ui/PanelHeader;Lcom/ait/toolkit/sencha/ext/client/ui/Tool;)(eventObject,extElement,header,tool);
		};
	}-*/;

	// Called from JSNI
	private final void fireOnEvent(EventObject event, ExtElement el,
			PanelHeader header, Tool tool) {
		UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
		if (handler != null) {
			fireOnEventAndCatch(event, el, header, tool, handler);
		} else {
			onClick(event, el, header, tool);
		}
	}

	private void fireOnEventAndCatch(EventObject event, ExtElement el,
			PanelHeader header, Tool tool, UncaughtExceptionHandler handler) {
		try {
			onClick(event, el, header, tool);
		} catch (Throwable e) {
			handler.onUncaughtException(e);
		}
	}

	@Override
	public JavaScriptObject getJsoPeer() {
		return jsoPeer;
	}

	public abstract void onClick(EventObject event, ExtElement el,
			PanelHeader header, Tool tool);
}
