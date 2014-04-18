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
package com.ait.toolkit.sencha.ext.client.events.form;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class BeforeQueryEvent extends EventObject {

    public static String EVENT_NAME = Event.BEFORE_QUERY;

    private String queryPlan;

    /**
     * UiBinder implementations
     */
    private static Type<BeforeQueryHandler> TYPE = new Type<BeforeQueryHandler>(EVENT_NAME, null);

    public static Type<BeforeQueryHandler> getType() {
        return TYPE;
    }

    public static Type<BeforeQueryHandler> getAssociatedType() {
        return TYPE;
    }

    public BeforeQueryEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public BeforeQueryEvent(String quueryPlan, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.queryPlan = quueryPlan;
    }

    /**
     * @return the queryPlan
     */
    public String getQueryPlan() {
        return queryPlan;
    }

}
