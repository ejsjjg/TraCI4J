/*   
    Copyright (C) 2013 ApPeAL Group, Politecnico di Torino

    This file is part of TraCI4J.

    TraCI4J is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    TraCI4J is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with TraCI4J.  If not, see <http://www.gnu.org/licenses/>.
*/

package it.polito.appeal.traci;

import it.polito.appeal.traci.TraCIException.UnexpectedDatatype;
import it.polito.appeal.traci.protocol.Constants;
import de.uniluebeck.itm.tcpip.Storage;

public class Program {
	private final Logic[] logics;
	Program(Storage content) throws UnexpectedDatatype {
		Utils.checkType(content, Constants.TYPE_COMPOUND);
		content.readInt(); // compund length ignored
		Utils.checkType(content, Constants.TYPE_INTEGER);
		int nLogics = content.readInt();
		logics = new Logic[nLogics];
		for (int i=0; i<nLogics; i++) {
			logics[i] = new Logic(content);
		}
	}
	public Logic[] getLogics() {
		return logics;
	}
}