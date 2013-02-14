package ch.unifr.pai.twice.mouseControl.standalone.client;
/*
 * Copyright 2013 Oliver Schmid
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import ch.unifr.pai.twice.layout.client.DynamicLayout;
import ch.unifr.pai.twice.mousecontrol.client.TouchPadWidget;
import ch.unifr.pai.twice.utils.device.client.UUID;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class MouseControlStandalone implements EntryPoint {

	@Override
	public void onModuleLoad() {
		TouchPadWidget w = GWT.create(TouchPadWidget.class);
		DynamicLayout.get().addComponent("touchpad", w, new AsyncCallback<TouchPadWidget>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(TouchPadWidget result) {
				// TODO Auto-generated method stub
				
			}
		});
		w.initialize(UUID.get(), null, null);
		w.start();
	}

}
