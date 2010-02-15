/**
 * Copyright 2010 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.regionserver.idx.support.sets;

import org.apache.hadoop.hbase.util.ClassSize;

/**
 * Tests the {@link SparseBitSet} implementation.
 */
public class TestSparseBitSet extends IntSetBaseTestCase {

  @Override
  protected IntSetBase newSet(int max, int... sortedElements) {
    return createSparseBitSet(max, sortedElements);
  }

  /**
   * Tests that the heap size estimate of the fixed parts matches the
   * FIXED SIZE constant.
   */
  public void testHeapSize() {
    assertEquals(ClassSize.estimateBase(SparseBitSet.class, false), SparseBitSet.FIXED_SIZE);
  }

}