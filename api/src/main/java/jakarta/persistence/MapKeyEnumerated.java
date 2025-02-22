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
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Specifies the enum type for a map key whose basic type is an enumerated
 * type.
 *
 * <p>The {@code MapKeyEnumerated} annotation can be applied to an element
 * collection or relationship of type {@link java.util.Map}, in conjunction
 * with the {@link ElementCollection}, {@link OneToMany}, or {@link ManyToMany}
 * annotation. If the enumerated type is not specified or the
 * {@code MapKeyEnumerated} annotation is not used, the enumerated type is
 * assumed to be {@link EnumType#ORDINAL ORDINAL}.
 *
 * <p>Example:
 * <pre>
 *   public enum ProjectStatus {COMPLETE, DELAYED, CANCELLED, IN_PROGRESS}
 *
 *   public enum SalaryRate {JUNIOR, SENIOR, MANAGER, EXECUTIVE}
 *
 *   &#064;Entity public class Employee {
 *       &#064;ManyToMany
 *       public Projects&#060;ProjectStatus, Project&#062; getProjects() {...}
 *       
 *       &#064;OneToMany
 *       &#064;MapKeyEnumerated(STRING)
 *       public Map&#060;SalaryRate, Employee&#062; getEmployees() {...}
 *       ...
 *   }
 * </pre>
 *
 * @see ElementCollection
 * @see OneToMany
 * @see ManyToMany
 *
 * @since 2.0
 */
@Target({METHOD, FIELD}) @Retention(RUNTIME)
public @interface MapKeyEnumerated {
    
    /**
     * (Optional) The type used in mapping a map key enum type.
     */
    EnumType value() default EnumType.ORDINAL;
}
