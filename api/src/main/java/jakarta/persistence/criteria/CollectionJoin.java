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


package jakarta.persistence.criteria;

import java.util.Collection;
import jakarta.persistence.metamodel.CollectionAttribute;

/**
 * The {@code CollectionJoin} interface is the type of the result of
 * joining to a collection over an association or element 
 * collection that has been specified as a {@link java.util.Collection}.
 *
 * @param <Z> the source type of the join
 * @param <E> the element type of the target {@code Collection} 
 *
 * @since 2.0
 */
public interface CollectionJoin<Z, E> 
		extends PluralJoin<Z, Collection<E>, E> {

    /**
     * Modify the join to restrict the result according to the
     * specified ON condition and return the join object.  
     * Replaces the previous ON condition, if any.
     * @param restriction  a simple or compound boolean expression
     * @return the modified join object
     * @since 2.1
     */
    CollectionJoin<Z, E> on(Expression<Boolean> restriction);

    /**
     * Modify the join to restrict the result according to the
     * specified ON condition and return the join object.  
     * Replaces the previous ON condition, if any.
     * @param restrictions  zero or more restriction predicates
     * @return the modified join object
     * @since 2.1
     */
    CollectionJoin<Z, E> on(Predicate... restrictions);

    /**
     * Return the metamodel representation for the collection
     * attribute.
     * @return metamodel type representing the {@code Collection} that is
     *         the target of the join
     */
    CollectionAttribute<? super Z, E> getModel();
}
