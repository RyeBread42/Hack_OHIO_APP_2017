/*
 * Copyright 2014 Google Inc. All rights reserved.
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.example.mnrye.hack_ohio_app_2017.maps.errors;

/** Indicates that the requesting account has exceeded its short-term quota. */
public class OverQueryLimitException extends ApiException {

  private static final long serialVersionUID = -6888513535435397042L;

  public OverQueryLimitException(String errorMessage) {
    super(errorMessage);
  }
}
