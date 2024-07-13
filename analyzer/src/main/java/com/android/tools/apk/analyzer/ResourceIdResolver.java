/*
 * Copyright (C) 2023 The Android Open Source Project
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

package com.android.tools.apk.analyzer;

/** Resolves resource id into a @[<resource package>:]<resource type>/<resource name> string. */
public interface ResourceIdResolver {
    String resolve(int resId);

    /** ResourceIdResolver that does not resolve a resource id and returns is as string. */
    ResourceIdResolver NO_RESOLUTION = i -> String.format("@ref/0x%x", i);
}
