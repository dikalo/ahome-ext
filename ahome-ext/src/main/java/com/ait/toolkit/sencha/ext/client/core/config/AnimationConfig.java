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
package com.ait.toolkit.sencha.ext.client.core.config;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.shared.client.fx.Easing;

/**
 * /** Configuration class for amination settings.
 * 
 */
public class AnimationConfig extends JsObject {

	public AnimationConfig() {
	}

	/**
	 * The duration of the animation in seconds
	 * 
	 * @param duration
	 *            defaults to 0.35
	 */
	public void setDuration(float duration) {
		JsoHelper.setAttribute(jsObj, "duration", duration);
	}

	/**
	 * The Easing method.
	 * 
	 * @param easing
	 *            defaults to
	 *            {@link com.ait.toolkit.sencha.ext.client.fx.easing.Easing#EASE_NONE}
	 */
	public void setEasing(Easing easing) {
		JsoHelper.setAttribute(jsObj, "easing", easing.getValue());
	}

	/**
	 * A function to execute when the anim completes.
	 * 
	 * @param callback
	 *            the callback function
	 */
	public native void setCallback(Function callback) /*-{
		var config = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		config['callback'] = function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

}
