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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Column definition class which renders a passed date according to the
 * default locale, or a configured format.
 * 
 * @author alainekambi
 * 
 */
public class DateGridColumn extends GridColumn {

    public DateGridColumn() {
        setXType(XType.DATE_COLUMN.getValue());
    }

    public DateGridColumn(String title) {
        this();
        setHeader(title);
    }

    public DateGridColumn(String title, String dataIndex) {
        this(title);
        setDataIndex(dataIndex);
    }

    protected DateGridColumn(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * A formatting string as used by Ext.Date.format to format a Date for this
     * Column.
     * <p>
     * Defaults to the default date from Ext.Date.defaultFormat which itself my
     * be overridden in a locale file.
     */
    public void setFormat(String text) {
        JsoHelper.setAttribute(getJsObj(), "format", text);
    }

    public static DateGridColumn cast(GridColumn obj) {
        return new DateGridColumn(obj.getJsObj());
    }

}
