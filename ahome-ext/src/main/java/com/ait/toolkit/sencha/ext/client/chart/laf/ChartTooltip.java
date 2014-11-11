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

import com.ait.toolkit.sencha.ext.client.chart.ChartTooltipRenderer;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.core.config.ToolTipConfig;

public class ChartTooltip extends ToolTipConfig {

	public ChartTooltip() {
		jsObj = JsoHelper.createObject();
	}

	public native void setRenderer(ChartTooltipRenderer renderer)/*-{
		var jso = this.@com.ait.toolkit.sencha.ext.client.core.config.BaseConfig::getJsObj()();
		jso.renderer = function(storeItem, item) {
			var toolTip = @com.ait.toolkit.sencha.ext.client.ui.ToolTip::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this);
			var model = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(storeItem);
			renderer.@com.ait.toolkit.sencha.ext.client.chart.ChartTooltipRenderer::onRender(Lcom/ait/toolkit/sencha/ext/client/ui/ToolTip;Lcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/core/client/JavaScriptObject;)(toolTip,model,item);
		};

	}-*/;

}
