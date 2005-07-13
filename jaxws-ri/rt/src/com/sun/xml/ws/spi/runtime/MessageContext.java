/**
 * $Id: MessageContext.java,v 1.2 2005-07-13 00:45:32 jitu Exp $
 *
 * Copyright 2005 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.sun.xml.ws.spi.runtime;

import java.lang.reflect.Method;

/**
 */
public interface MessageContext extends javax.xml.ws.handler.MessageContext {
    /**
     * Returns the invocation method.
     *
     * @return invocation method, null if the model doesn't know
     */
    public Method getMethod();
}
