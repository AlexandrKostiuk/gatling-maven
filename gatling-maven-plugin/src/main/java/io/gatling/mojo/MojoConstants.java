/**
 * Copyright 2011-2014 eBusiness Information, Groupe Excilys (www.ebusinessinformation.fr)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gatling.mojo;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class MojoConstants {

    private MojoConstants() {
        throw new AssertionError();
    }

    // Recorder constants
    public static final String RECORDER_MAIN_CLASS = "io.gatling.recorder.GatlingRecorder";

    // Compiler constants
    public static final String SCALA_VERSION = "2.11.6";
    public static final String COMPILER_MAIN_CLASS = "io.gatling.compiler.ZincCompiler";
    public static final List<String> ZINC_JVM_ARGS = singletonList("-Xss10M");

    // Gatling constants
    public static final String GATLING_MAIN_CLASS = "io.gatling.app.Gatling";
    public static final List<String> GATLING_JVM_ARGS = asList(
            "-server", "-XX:+UseThreadPriorities", "-XX:ThreadPriorityPolicy=42", "-Xms512M",
            "-Xmx512M", "-Xmn100M", "-XX:+HeapDumpOnOutOfMemoryError", "-XX:+AggressiveOpts",
            "-XX:+OptimizeStringConcat", "-XX:+UseFastAccessorMethods", "-XX:+UseParNewGC",
            "-XX:+UseConcMarkSweepGC", "-XX:+CMSParallelRemarkEnabled");
}