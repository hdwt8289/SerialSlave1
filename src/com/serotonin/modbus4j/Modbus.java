/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2006-2011 Serotonin Software Technologies Inc. http://serotoninsoftware.com
 * @author Matthew Lohbihler
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.serotonin.modbus4j;

import com.serotonin.messaging.DefaultMessagingExceptionHandler;
import com.serotonin.messaging.MessagingExceptionHandler;

/**
 * Base level for masters and slaves/listeners
 * <p/>
 * TODO: - handle echoing in RS485
 *
 * @author mlohbihler
 */
public class Modbus {
    private MessagingExceptionHandler exceptionHandler = new DefaultMessagingExceptionHandler();

    public void setExceptionHandler(MessagingExceptionHandler exceptionHandler) {
        if (exceptionHandler == null)
            this.exceptionHandler = new DefaultMessagingExceptionHandler();
        else
            this.exceptionHandler = exceptionHandler;
    }

    public MessagingExceptionHandler getExceptionHandler() {
        return exceptionHandler;
    }
}
