/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.as.security.providers.extension;

import org.jboss.as.controller.AbstractAddStepHandler;
import org.jboss.as.controller.AbstractRemoveStepHandler;
import org.jboss.as.controller.OperationFailedException;
import org.jboss.as.controller.SimpleResourceDefinition;
import org.jboss.dmr.ModelNode;
import org.jboss.logging.Logger;

/**
 * Resource definition for security-providers extension.
 * 
 * @author Josef Cacek
 */
public class SecuritProvidersDefinition extends SimpleResourceDefinition {

    private static final Logger LOGGER = Logger.getLogger(SecuritProvidersDefinition.class);

    public static final SecuritProvidersDefinition INSTANCE = new SecuritProvidersDefinition();

    // Constructors ----------------------------------------------------------

    /**
     * Create a new SecuritProvidersDefinition (with Add and Remove operations).
     */
    private SecuritProvidersDefinition() {
        super(SecurityProvidersExtension.SUBSYSTEM_PATH, SecurityProvidersExtension.getResourceDescriptionResolver(null),
                new AbstractAddStepHandler() {
                    @Override
                    protected void populateModel(ModelNode operation, ModelNode model) throws OperationFailedException {
                        model.setEmptyObject();
                    }
                }, new AbstractRemoveStepHandler() {
                });
        LOGGER.debug("Creating SecuritProvidersDefinition.");
    }
}
