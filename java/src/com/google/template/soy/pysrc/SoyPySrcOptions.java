/*
 * Copyright 2014 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.template.soy.pysrc;


/**
 * Compilation options for the Python backend.
 *
 */
public final class SoyPySrcOptions implements Cloneable {

  /** The full module and fn path to a runtime library for determining global directionality. */
  private final String bidiIsRtlFn;

  /** The base module path for loading the runtime modules. */
  private final String runtimePath;

  public SoyPySrcOptions(String runtimePath, String bidiIsRtlFn) {
    this.runtimePath = runtimePath;
    this.bidiIsRtlFn = bidiIsRtlFn;
  }

  /**
   * @return the bidiIsRtlFn
   */
  public String getBidiIsRtlFn() {
    return bidiIsRtlFn;
  }

  /**
   * @return the runtimePath
   */
  public String getRuntimePath() {
    return runtimePath;
  }

  @Override public final SoyPySrcOptions clone() {
    try {
      return (SoyPySrcOptions) super.clone();
    } catch (CloneNotSupportedException cnse) {
      throw new RuntimeException("Cloneable interface removed from SoyPySrcOptions.");
    }
  }

}
