package com.ibm.ws.cdi12.test.ejbsNoBeansXml;

import javax.ejb.Local;

/*******************************************************************************
 * Copyright (c) 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

/**
 *
 */
@Local
public interface FirstManagedBeanInterface {

    public void setValue1(String value);

    public String getValue1();

}
