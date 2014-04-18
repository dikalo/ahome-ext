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
package com.ait.toolkit.sencha.ext.client.events.tab;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.TabPanel;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class TabChangeEvent extends EventObject {

    public static String EVENT_NAME = Event.TAB_CHANGE;

    private TabPanel source;
    private Component oldCard;
    private Component newCard;

    /**
     * UiBinder implementations
     */
    private static Type<BeforeTabChangeHandler> TYPE = new Type<BeforeTabChangeHandler>(EVENT_NAME, null);

    public static Type<BeforeTabChangeHandler> getType() {
        return TYPE;
    }

    public static Type<BeforeTabChangeHandler> getAssociatedType() {
        return TYPE;
    }

    public TabChangeEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public TabChangeEvent(TabPanel source, Component oldCard, Component newCard, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.oldCard = oldCard;
        this.newCard = newCard;
    }

    /**
     * @return the source
     */
    public TabPanel getSource() {
        return source;
    }

    /**
     * @return the oldValue
     */
    public Component getOldCard() {
        return oldCard;
    }

    /**
     * @return the newValue
     */
    public Component getNewCard() {
        return newCard;
    }

}
