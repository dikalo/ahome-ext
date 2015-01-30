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
package com.ait.toolkit.sencha.ext.client.grid.column;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.core.config.XType;
import com.ait.toolkit.sencha.shared.client.core.Template;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Column definition class which renders a value by processing a DataModel's
 * data using a configured XTemplate.
 */
public class TemplateGridColumn extends GridColumn {

	public TemplateGridColumn() {
		setXType(XType.TEMPLATE_COLUMN.getValue());
	}

	public TemplateGridColumn(String title) {
		this();
		setHeader(title);
	}

	protected TemplateGridColumn(JavaScriptObject obj) {
		super(obj);
	}

	/**
	 * An XTemplate, or an XTemplate definition string to use to process a
	 * DataModel's data to produce a column's rendered value.
	 */
	public void setTpl(String text) {
		JsoHelper.setAttribute(getJsObj(), "tpl", text);
	}

	/**
	 * An XTemplate, or an XTemplate definition string to use to process a
	 * DataModel's data to produce a column's rendered value.
	 */
	public void setTpl(Template tpl) {
		JsoHelper.setAttribute(getJsObj(), "tpl", tpl.getJsObj());
	}

	public static TemplateGridColumn cast(GridColumn obj) {
		return new TemplateGridColumn(obj.getJsObj());
	}

}
