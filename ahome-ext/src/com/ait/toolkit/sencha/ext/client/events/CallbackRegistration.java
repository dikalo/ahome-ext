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
package com.ait.toolkit.sencha.ext.client.events;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Registration class for callbacks. This class is returned when adding an event
 * handler to an observable.
 */
public class CallbackRegistration implements com.google.gwt.event.shared.HandlerRegistration {

    private final JsObject target;
    private final String eventName;
    private final JavaScriptObject callback;

    public CallbackRegistration(JsObject target, String eventName, JavaScriptObject callback) {
        this.target = target;
        this.eventName = eventName;
        this.callback = callback;
    }

    public JsObject getTarget() {
        return target;
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @return the callback
     */
    public JavaScriptObject getCallback() {
        return callback;
    }

    /**
     * Unregisters the event handler from the observable
     */
    public native void unregister()/*-{
		var target = this.@com.ait.toolkit.sencha.ext.client.events.CallbackRegistration::getTarget()();
		var peer = target.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var event = this.@com.ait.toolkit.sencha.ext.client.events.CallbackRegistration::getEventName()();
		var fn = this.@com.ait.toolkit.sencha.ext.client.events.CallbackRegistration::getCallback()();
		peer.removeListener(event, fn);
    }-*/;

    @Override
    public void removeHandler() {
        unregister();
    }

}
