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

/**
 * Defines the set of cascadable operations that are propagated 
 * to the associated entity. The value {@link #ALL cascade=ALL}
 * is equivalent to
 * {@code cascade={PERSIST, MERGE, REMOVE, REFRESH, DETACH}}.
 *
 * @see ManyToOne#cascade
 * @see OneToOne#cascade
 * @see OneToMany#cascade
 * @see ManyToMany#cascade
 *
 * @since 1.0
 */
public enum CascadeType { 

    /**
     * Cascade all operations
     */
    ALL, 

    /**
     * Cascade the {@linkplain EntityManager#persist persist}
     * operation
     */
    PERSIST, 

    /**
     * Cascade the {@linkplain EntityManager#merge merge}
     * operation
     */
    MERGE, 

    /**
     * Cascade the {@linkplain EntityManager#remove remove}
     * operation
     */
    REMOVE,

    /**
     * Cascade the {@linkplain EntityManager#refresh refresh}
     * operation
     */
    REFRESH,

    /**
     * Cascade the {@linkplain EntityManager#detach detach}
     * operation
     *
     * @since 2.0
     * 
     */   
    DETACH
}
