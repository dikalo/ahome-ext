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
package com.ait.toolkit.sencha.ext.client.events.flash;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.FlashComponent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class SuccessEvent extends EventObject {

    public static String EVENT_NAME = Event.SUCCESS;

    private FlashComponent source;

    /**
     * UiBinder implementations
     */
    private static Type<SuccessHandler> TYPE = new Type<SuccessHandler>(EVENT_NAME, null);

    public static Type<SuccessHandler> getType() {
        return TYPE;
    }

    public static Type<SuccessHandler> getAssociatedType() {
        return TYPE;
    }

    public SuccessEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public SuccessEvent(FlashComponent source, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;

    }

    /**
     * @return the source
     */
    public FlashComponent getSource() {
        return source;
    }

}
