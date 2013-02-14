package ch.unifr.pai.twice.utils.cursorSimulator.client;

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

import ch.unifr.pai.twice.utils.cursorSimulator.client.utils.MouseMovement;

import com.google.gwt.user.client.Command;

/**
 * A simulated cursor with a predefined path. As soon as the cursor has finished
 * its movement, it stops. If the cursor shall repeat its movements after the
 * end of the path, please use {@link PredefinedLoopCursor}
 * 
 * @author oli
 * 
 */
public class PredefinedCursor extends Cursor {

	protected int i = 0;
	protected MouseMovement[] path;
	private Command callback = new Command() {
		@Override
		public void execute() {
			if (i >= 0 && i < path.length) {
				MouseMovement m = path[i];
				if (m != null && m.getCallback() != null)
					m.getCallback().execute();
			}
			i++;
			move();
		}
	};

	public PredefinedCursor(int index, int startX, int startY,
			MouseMovement... path) {
		super(index, startX, startY);
		this.path = path;
	}

	public void move() {
		if (i < path.length) {
			MouseMovement next = path[i];
			int nextX = next.getX();
			int nextY = next.getY();
			int nextDuration = next.getDuration();
			super.move(nextX, nextY, nextDuration, callback);
		}
	}

}
