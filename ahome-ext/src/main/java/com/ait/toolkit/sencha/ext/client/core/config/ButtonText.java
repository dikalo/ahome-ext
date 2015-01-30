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

import com.ait.toolkit.core.client.JsoHelper;

public class ButtonText extends BaseConfig {

    public ButtonText() {

    }

    public ButtonText(String yesText) {
        this();
        setYesText(yesText);
    }

    public ButtonText(String yesText, String noText) {
        this(yesText);
        setNoText(noText);
    }

    public ButtonText(String yesText, String noText, String cancelText) {
        this(yesText, noText);
        setCancelText(cancelText);
    }

    public void setYesText(String value) {
        JsoHelper.setAttribute(jsObj, "yes", value);
    }

    public void setNoText(String value) {
        JsoHelper.setAttribute(jsObj, "no", value);
    }

    public void setCancelText(String value) {
        JsoHelper.setAttribute(jsObj, "cancel", value);
    }

}
