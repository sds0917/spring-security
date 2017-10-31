/*
 * Copyright 2002-2016 the original author or authors.
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
package org.springframework.security.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Encapsulates the redirection logic for all classes in the framework which perform
 * redirects.
 *
 * @author Luke Taylor
 * @since 3.0
 */
public interface RedirectStrategy {

	/**
	 * Performs a redirect to the supplied URL
	 * @param request the current request
	 * @param response the response to redirect
	 * @param url the target URL to redirect to, for example "/login"
	 */
	void sendRedirect(HttpServletRequest request, HttpServletResponse response, String url)
			throws IOException;
}
