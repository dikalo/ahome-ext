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
package com.ait.toolkit.sencha.ext.client.chart.laf;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.laf.Color;
import com.google.gwt.core.client.JavaScriptObject;

public class Gradient extends JsObject {

    public Gradient() {
        jsObj = JsoHelper.createObject();
    }

    public void setId(String id) {
        JsoHelper.setAttribute(jsObj, "id", id);
    }

    public void setAngle(int value) {
        JsoHelper.setAttribute(jsObj, "angle", value);
    }

    public void setStops(String rgbColorFrom, String rgbColorTo) {
        JsoHelper.setAttribute(jsObj, "stops", createStops(rgbColorFrom, rgbColorTo));
    }

    public void setStops(Color rgbColorFrom, Color rgbColorTo) {
        setStops(rgbColorFrom.asRgbString(), rgbColorTo.asRgbString());
    }

    public void setFont(String value) {
        JsoHelper.setAttribute(jsObj, "font", value);
    }

    private native JavaScriptObject createStops(String rgbColorFrom, String rgbColorTo)/*-{
		return {
			0 : {
				color : rgbColorFrom
			},
			100 : {
				color : rgbColorTo
			}
		}
    }-*/;

}
