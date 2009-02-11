/*
 * Copyright 2008 Derek Chen-Becker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */

package org.scala_libs.jpa.test

import javax.persistence.EntityManager

import net.liftweb.http.RequestVar
import net.liftweb.util.Full

import org.scala_libs.jpa._

object Model extends LocalEMF("test") with RequestVarEM

object ThreadEM extends LocalEMF("test") with ThreadLocalEM
