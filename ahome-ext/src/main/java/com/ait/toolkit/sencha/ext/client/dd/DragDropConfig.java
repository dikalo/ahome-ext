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
package com.ait.toolkit.sencha.ext.client.dd;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.core.config.BaseConfig;

/**
 * 
 * @author Alain Ekambi
 */
public class DragDropConfig extends BaseConfig {

	public void setIsTarget(boolean target) {
		JsoHelper.setAttribute(jsObj, "isTarget", target);
	}

	public void setIgnoreYourSelf(boolean target) {
		JsoHelper.setAttribute(jsObj, "ignoreSelf", target);
	}

	public void setPrimaryButtonOnly(boolean primaryButtonOnly) {
		JsoHelper.setAttribute(jsObj, "primaryButtonOnly", primaryButtonOnly);
	}

	public void setMaintainOffset(boolean maintainOffset) {
		JsoHelper.setAttribute(jsObj, "maintainOffset", maintainOffset);
	}

	public void setMoveOnDrag(boolean value) {
		JsoHelper.setAttribute(jsObj, "moveOnDrag", value);
	}

	public native void onContainerOver(DragDropInteractionHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.onContainerOver = function() {
			return handler.@com.ait.toolkit.sencha.ext.client.dd.DragDropInteractionHandler::onAction()();
		}
	}-*/;

}
