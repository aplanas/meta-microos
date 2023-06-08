SUMMARY = "HTTP cookie jars"
DESCRIPTION = "This class is for objects that represent a 'cookie jar' -- that is, a \
database of all the HTTP cookies that a given LWP::UserAgent object knows \
about. \
 \
Cookies are a general mechanism which server side connections can use to \
both store and retrieve information on the client side of the connection. \
For more information about cookies refer to at \
http://curl.haxx.se/rfc/cookie_spec.html and at \
http://www.cookiecentral.com. This module also implements the new style \
cookies described in at https://tools.ietf.org/html/rfc2965. The two \
variants of cookies are supposed to be able to coexist happily. \
 \
Instances of the class _HTTP::Cookies_ are able to store a collection of \
Set-Cookie2: and Set-Cookie: headers and are able to use this information \
to initialize Cookie-headers in _HTTP::Request_ objects. The state of a \
_HTTP::Cookies_ object can be saved in and restored from files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.10"

RPM_NAME = "perl-HTTP-Cookies-6.10-1.10.noarch.rpm"
RPM_HASH = "4c42e4152fa728796f3e8b166cfea4af31c0ab8a12e853bde4b9fe43606393d7587f405cb8122b101da178e4dbc7d62e2ef5502c14897e506adc967e8194073c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Cookies) perl(HTTP::Cookies::Microsoft) perl(HTTP::Cookies::Netscape) perl-HTTP-Cookies"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(HTTP::Date) perl(HTTP::Headers::Util) perl(HTTP::Request)"

inherit rpm
