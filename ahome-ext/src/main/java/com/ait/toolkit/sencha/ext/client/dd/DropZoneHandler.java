package com.ait.toolkit.sencha.ext.client.dd;

import com.ait.toolkit.sencha.shared.client.core.EventObject;

public interface DropZoneHandler {
	public boolean onEvent(DragSource source, EventObject event, DragData data);
}
