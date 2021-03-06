/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.rest.internal.resources.doc;

import java.util.List;

import org.sonatype.nexus.repository.rest.api.RepositoryXO;
import org.sonatype.nexus.repository.rest.internal.resources.RepositoriesResource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Swagger documentation for {@link RepositoriesResource}
 *
 * @since 3.next
 */
@Api(value = "repositories")
public interface RepositoriesResourceDoc
{
  @ApiOperation("List repositories")
  List<RepositoryXO> getRepositories();
}
