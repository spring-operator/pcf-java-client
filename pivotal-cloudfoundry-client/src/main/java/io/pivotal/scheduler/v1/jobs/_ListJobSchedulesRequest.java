/*
 * Copyright 2018-2018 the original author or authors.
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

package io.pivotal.scheduler.v1.jobs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.pivotal.scheduler.v1.PaginatedRequest;
import org.immutables.value.Value;

/**
 * The request payload for the List Job Schedules operation
 */
@Value.Immutable
abstract class _ListJobSchedulesRequest extends PaginatedRequest {

    /**
     * The job id
     */
    @JsonIgnore
    abstract String getJobId();

}
