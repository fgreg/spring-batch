/*
 * Copyright 2006-2007 the original author or authors.
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
package org.springframework.batch.core.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobListener;

/**
 * @author Dave Syer
 *
 */
public class JobListenerSupport implements JobListener {

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.domain.JobListener#afterJob()
	 */
	public void afterJob(JobExecution jobExecution) {
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.domain.JobListener#beforeJob(org.springframework.batch.core.domain.JobExecution)
	 */
	public void beforeJob(JobExecution jobExecution) {
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.JobListener#onError(org.springframework.batch.core.JobExecution, java.lang.Throwable)
	 */
	public void onError(JobExecution jobExecution, Throwable e) {
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.JobListener#onInterrupt(org.springframework.batch.core.JobExecution)
	 */
	public void onInterrupt(JobExecution jobExecution) {
	}

}
