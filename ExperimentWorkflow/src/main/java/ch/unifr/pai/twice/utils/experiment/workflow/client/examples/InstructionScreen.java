package ch.unifr.pai.twice.utils.experiment.workflow.client.examples;
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
import ch.unifr.pai.twice.utils.experiment.workflow.client.Task;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;


public class InstructionScreen extends Task<Label>{	
	
	public InstructionScreen(){
		super(new Label());
		getRootWidget().setText("TTTTTTT");
	}
	
	@Override
	public String getLog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		Window.alert("Stopped");
	}
	
}
