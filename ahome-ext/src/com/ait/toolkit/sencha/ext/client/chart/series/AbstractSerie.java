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
package com.ait.toolkit.sencha.ext.client.chart.series;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.chart.HighLighter;
import com.ait.toolkit.sencha.ext.client.chart.laf.ChartTooltip;
import com.ait.toolkit.sencha.ext.client.chart.laf.Label;
import com.ait.toolkit.sencha.ext.client.chart.laf.Style;
import com.ait.toolkit.sencha.ext.client.chart.marker.MarkerConfig;
import com.ait.toolkit.sencha.ext.client.chart.series.renderers.SeriesRenderer;
import com.ait.toolkit.sencha.ext.client.laf.Color;
import com.ait.toolkit.sencha.ext.client.ui.ToolTip;
import com.ait.toolkit.sencha.shared.client.core.config.Position;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * AbstractSerie is the abstract class containing the common logic to all chart
 * series. AbstractSerie includes methods from Labels, Highlights, Tips and
 * Callouts mixins. This class implements the logic of handling mouse events,
 * animating, hiding, showing all elements and returning the color of the series
 * to be used as a legend item.
 */
public abstract class AbstractSerie extends JsObject {

	public AbstractSerie() {

	}

	public AbstractSerie(JavaScriptObject obj) {
		super(obj);
	}

	protected void setType(String title) {
		JsoHelper.setAttribute(jsObj, "type", title);
	}

	public String getType() {
		return JsoHelper.getAttribute(jsObj, "type");
	}

	public void setFill(boolean value) {
		JsoHelper.setAttribute(jsObj, "fill", value);
	}

	public void setFill(String value) {
		JsoHelper.setAttribute(jsObj, "fill", value);
	}

	public void setFill(Color color) {
		setFill(color.getValue());
	}

	public void setFillOpacitiy(double value) {
		JsoHelper.setAttribute(jsObj, "fillOpacity", value);
	}

	public void setLabel(Label label) {
		JsoHelper.setAttribute(jsObj, "label", label.getJsObj());
	}

	public void setSmooth(boolean value) {
		JsoHelper.setAttribute(jsObj, "smooth", value);
	}

	public void setDonut(int value) {
		JsoHelper.setAttribute(jsObj, "donut", value);
	}

	public void setDonut(boolean value) {
		JsoHelper.setAttribute(jsObj, "donut", value);
	}

	public void setStyle(Style value) {
		JsoHelper.setAttribute(jsObj, "style", value.getJsObj());
	}

	public void setStyle(String value) {
		JsoHelper.setAttribute(jsObj, "style", value);
	}

	/**
	 * Add tooltips to the visualization's markers. The options for the tips are
	 * the same configuration used with {@link ToolTip}
	 * 
	 * @param value
	 */
	public void setTips(ChartTooltip value) {
		JsoHelper.setAttribute(jsObj, "tips", value.getJsObj());
	}

	/**
	 * If set to true it will highlight the markers or the series when hovering
	 * with the mouse. This parameter can also be an object with the same style
	 * properties you would apply to a Ext.draw.Sprite to apply custom styles to
	 * markers and series.
	 * 
	 * @param value
	 */
	public void setHighLighter(HighLighter value) {
		JsoHelper.setAttribute(jsObj, "highlight", value.getJsObj());
	}

	/**
	 * If set to true it will highlight the markers or the series when hovering
	 * with the mouse. This parameter can also be an object with the same style
	 * properties you would apply to a Ext.draw.Sprite to apply custom styles to
	 * markers and series.
	 * 
	 * @param value
	 */
	public void setHighLight(boolean value) {
		JsoHelper.setAttribute(jsObj, "highlight", value);
	}

	public void setMarker(MarkerConfig marker) {
		JsoHelper.setAttribute(jsObj, "markerConfig", marker.getJsObj());
	}

	/**
	 * Whether to show this series in the legend.
	 * 
	 * Defaults to: true
	 * 
	 * @param value
	 */
	public void setShowInLegend(boolean value) {
		JsoHelper.setAttribute(jsObj, "showInLegend", value);
	}

	public native void setTitle(int index, String title)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.setTitle(index, title);
	}-*/;

	public native void showAll()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showAll(index, title);
	}-*/;

	/**
	 * The position of the axis to bind the values to. Possible values are
	 * 'left', 'bottom', 'top' and 'right'. You must explicitly set this value
	 * to bind the values of the line series to the ones in the axis, otherwise
	 * a relative scale will be used. For example, if you're using a Scatter or
	 * Line series and you'd like to have the values in the chart relative to
	 * the bottom and left axes then axis should be ['left', 'bottom'].
	 * 
	 * Defaults to: "left"
	 * 
	 * @param value
	 */
	public void setAxis(String value) {
		JsoHelper.setAttribute(jsObj, "axis", value);
	}

	public void setAxis(String... fields) {
		JsArrayString array = JsArrayString.createArray().cast();
		for (String string : fields) {
			array.push(string);
		}
		JsoHelper.setAttribute(jsObj, "axis", array);
	}

	public void setAxis(Position position) {
		setAxis(position.getValue());
	}

	public void setAxis(Position... positions) {
		JsArrayString array = JsArrayString.createArray().cast();
		for (Position p : positions) {
			array.push(p.getValue());
		}
		JsoHelper.setAttribute(jsObj, "axis", array);
	}

	/**
	 * The position of the axis to bind the values to. Possible values are
	 * 'left', 'bottom', 'top' and 'right'. You must explicitly set this value
	 * to bind the values of the line series to the ones in the axis, otherwise
	 * a relative scale will be used. For example, if you're using a Scatter or
	 * Line series and you'd like to have the values in the chart relative to
	 * the bottom and left axes then axis should be ['left', 'bottom'].
	 * 
	 * Defaults to: "left"
	 * 
	 * @param value
	 */
	public void setAxis(JsArrayString value) {
		JsoHelper.setAttribute(jsObj, "axis", value);
	}

	/**
	 * A function that can be overridden to set custom styling properties to
	 * each rendered element. Passes in (sprite, record, attributes, index,
	 * store) to the function.
	 * 
	 * @param renderer
	 */
	public final native void setRenderer(SeriesRenderer renderer)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.renderer = function(sprite, record, attr, index, store) {
			var model = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(record);
			var s = @com.ait.toolkit.sencha.ext.client.draw.Sprite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(sprite);
			var st = @com.ait.toolkit.sencha.shared.client.data.Store::new(Lcom/google/gwt/core/client/JavaScriptObject;)(store);
			return renderer.@com.ait.toolkit.sencha.ext.client.chart.series.renderers.SeriesRenderer::onRender(Lcom/ait/toolkit/sencha/ext/client/draw/Sprite;Lcom/ait/toolkit/data/client/BaseModel;Lcom/ait/toolkit/sencha/ext/client/chart/laf/BarAttribute;ILcom/ait/toolkit/sencha/shared/client/data/Store;)(s,model,attr, index,st);
			;
			;
		};
	}-*/;

	public static AbstractSerie create(JavaScriptObject obj) {
		return new AbstractSerie(obj) {
		};
	}

}
