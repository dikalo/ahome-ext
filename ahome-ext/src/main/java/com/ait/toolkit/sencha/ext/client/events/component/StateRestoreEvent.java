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
package com.ait.toolkit.sencha.ext.client.events.component;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.core.State;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class StateRestoreEvent extends EventObject {

    public static String EVENT_NAME = Event.STATE_RESTORE;

    private Component source;
    private State state;

    /**
     * UiBinder implementations
     */
    private static Type<StateRestoreHandler> TYPE = new Type<StateRestoreHandler>(EVENT_NAME, null);

    public static Type<StateRestoreHandler> getType() {
        return TYPE;
    }

    public static Type<StateRestoreHandler> getAssociatedType() {
        return TYPE;
    }

    public StateRestoreEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public StateRestoreEvent(Component source, State state, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.state = state;

    }

    /**
     * @return the source
     */
    public Component getSource() {
        return source;
    }

    /**
     * The hash of state values returned from the StateProvider. If this event
     * is not vetoed, then the state object is passed to applyState. By default,
     * that simply copies property values into this object.
     * 
     * @return
     */
    public State getState() {
        return state;
    }

}
