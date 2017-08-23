/*
 * Copyright 2016 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.clouddriver.core.provider.agent

import com.google.common.base.CaseFormat
import groovy.transform.CompileStatic

@CompileStatic
public enum Namespace {
  CERTIFICATES,
  IMAGES,
  NAMED_IMAGES,
  SERVER_GROUPS,
  INSTANCES,
  LAUNCH_CONFIGS,
  LISTENERS,
  LOAD_BALANCERS,
  TARGET_GROUPS,
  CLUSTERS,
  APPLICATIONS,
  HEALTH,
  ON_DEMAND,
  RESERVATION_REPORTS,
  RESERVED_INSTANCES

  final String ns

  private Namespace() {
    ns = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name()) // FOO_BAR -> fooBar
  }

  String toString() {
    ns
  }
}
