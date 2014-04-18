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
package com.ait.toolkit.sencha.ext.client.core;

import com.ait.toolkit.core.client.Function;
import com.google.gwt.core.client.EntryPoint;

/**
 * Base class for bootstrapping an ext4j application. It is recommended to
 * extend this class and implement the {@link #onLoad()} method.
 * 
 */
public abstract class ExtEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Ext.onReady(new Function() {
			@Override
			public void execute() {
				onLoad();
			}
		});
	}

	public abstract void onLoad();
}
