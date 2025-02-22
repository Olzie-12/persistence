/*
 * Copyright (c) 2008, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Linda DeMichiel - 2.1
//     Linda DeMichiel - 2.0

package jakarta.persistence;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Used to supply a query property or hint to the {@link NamedQuery}
 * or {@link NamedNativeQuery} annotation.
 *
 * <p>Vendor-specific hints that are not recognized by a provider are
 * ignored.
 *
 * @since 1.0
 */
@Target({}) 
@Retention(RUNTIME)
public @interface QueryHint { 

    /** Name of the hint. */
    String name(); 

    /** Value of the hint. */
    String value();
}
