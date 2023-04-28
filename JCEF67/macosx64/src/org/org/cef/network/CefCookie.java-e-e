// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package org.cef.network;

import java.util.Date;

/**
 * Cookie information.
 */
public  class CefCookie {
    public CefCookie(String name, String value, String domain, String path, boolean secure,
            boolean httponly, Date creation, Date lastAccess, boolean hasExpires, Date expires) {
        this.name = name;
        this.value = value;
        this.domain = domain;
        this.path = path;
        this.secure = secure;
        this.httponly = httponly;
        this.creation = creation;
        this.lastAccess = lastAccess;
        this.hasExpires = hasExpires;
        this.expires = expires;
    }

    /**
     * The cookie name.
     */
    public  String name;

    /**
     * The cookie value.
     */
    public  String value;

    /**
     * If domain is empty a host cookie will be created instead of a domain
     * cookie. Domain cookies are stored with a leading "." and are visible to
     * sub-domains whereas host cookies are not.
     */
    public  String domain;

    /**
     * If path is non-empty only URLs at or below the path will get the cookie
     * value.
     */
    public  String path;

    /**
     * If secure is true the cookie will only be sent for HTTPS requests.
     */
    public  boolean secure;

    /**
     * If httponly is true the cookie will only be sent for HTTP requests.
     */
    public  boolean httponly;

    /**
     * The cookie creation date. This is automatically populated by the system on
     * cookie creation.
     */
    public  Date creation;

    /**
     * The cookie last access date. This is automatically populated by the system
     * on access.
     */
    public  Date lastAccess;

    /**
     * The cookie expiration date is only valid if |has_expires| is true.
     */
    public  boolean hasExpires;
    public  Date expires;
}
