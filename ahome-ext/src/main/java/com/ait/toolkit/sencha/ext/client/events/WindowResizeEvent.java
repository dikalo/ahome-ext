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

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Fired when the browser window is resized
 * 
 */
public class WindowResizeEvent extends EventObject {

    private int width;
    private int height;

    protected WindowResizeEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    protected WindowResizeEvent(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

}
