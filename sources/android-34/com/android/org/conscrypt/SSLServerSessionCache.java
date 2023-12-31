/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 * Copyright (C) 2009 The Android Open Source Project
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

package com.android.org.conscrypt;

import javax.net.ssl.SSLSession;

/**
 * A persistent {@link javax.net.ssl.SSLSession} cache used by
 * {@link javax.net.ssl.SSLSessionContext} to share server-side SSL sessions
 * across processes. For example, this cache enables one server to resume
 * a session started by a different server based on a session ID provided
 * by the client.
 *
 * <p>The {@code SSLSessionContext} implementation converts
 * {@code SSLSession}s into raw bytes and vice versa. The exact makeup of the
 * session data is dependent upon the caller's implementation and is opaque to
 * the {@code SSLServerSessionCache} implementation.
 * @hide This class is not part of the Android public SDK API
 */
public interface SSLServerSessionCache {
    /**
     * Gets the session data for given session ID.
     *
     * @param id from {@link javax.net.ssl.SSLSession#getId()}
     * @return the session data or null if none is cached
     * @throws NullPointerException if id is null
     */
    byte[] getSessionData(byte[] id);

    /**
     * Stores session data for the given session.
     *
     * @param session to cache data for
     * @param sessionData to cache
     * @throws NullPointerException if session or data is null
     */
    void putSessionData(SSLSession session, byte[] sessionData);
}
