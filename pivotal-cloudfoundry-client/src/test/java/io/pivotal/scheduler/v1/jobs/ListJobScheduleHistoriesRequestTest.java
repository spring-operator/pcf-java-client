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

import org.junit.Test;

public class ListJobScheduleHistoriesRequestTest {

    @Test(expected = IllegalStateException.class)
    public void noJobId() {
        ListJobScheduleHistoriesRequest.builder()
            .scheduleId("test-schedule-id")
            .build();
    }

    @Test(expected = IllegalStateException.class)
    public void noScheduleId() {
        ListJobScheduleHistoriesRequest.builder()
            .jobId("test-job-id")
            .build();
    }

    @Test
    public void valid() {
        ListJobScheduleHistoriesRequest.builder()
            .jobId("test-job-id")
            .scheduleId("test-schedule-id")
            .build();
    }

}
