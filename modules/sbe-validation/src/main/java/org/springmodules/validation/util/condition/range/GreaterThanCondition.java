/*
 * Copyright 2004-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springmodules.validation.util.condition.range;

import java.util.Comparator;

/**
 * An {@link AbstractSingleBoundCondition} implementation that checkCalendar whether the checked value is greater than a
 * specific loweer bound.
 *
 * @author Uri Boness
 */
public class GreaterThanCondition extends AbstractSingleBoundCondition {

    /**
     * Constructs a new GreaterThanCondition with a given lower bound.
     *
     * @param lowerBound The lower bound.
     */
    public GreaterThanCondition(Comparable lowerBound) {
        super(lowerBound);
    }

    /**
     * Constructs a new GreaterThanCondition with given lower bound and the comparator to be used to compare the checked value.
     *
     * @param lowerBound The lower bound.
     * @param comparator The comparator.
     */
    public GreaterThanCondition(Object lowerBound, Comparator comparator) {
        super(lowerBound, comparator);
    }

    /**
     * Checks whether the given value is greater than the lower bound associated with this condition.
     *
     * @param value The value to be checked.
     * @param comparator The comparator to be used to compare the checked value.
     * @return <code>true</code> if the given value is greater than the lower bound, <code>false</code> otherwise.
     */
    protected boolean checkRange(Object value, Comparator comparator) {
        return comparator.compare(value, bound) > 0;
    }

}
