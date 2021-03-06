/*******************************************************************************
 * Copyright (c) 2015 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.ibm.ws.repository.exceptions;


public class RepositoryResourceDeletionException extends RepositoryResourceException {

    private static final long serialVersionUID = 3722331322149807437L;

    public RepositoryResourceDeletionException(String message, String resourceId) {
        super(message, resourceId);
    }

    public RepositoryResourceDeletionException(String message, String resourceId, Throwable cause) {
        super(message, resourceId, cause);
    }

}
