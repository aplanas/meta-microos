SUMMARY = "Minimalist HTTP user agent cookie jar"
DESCRIPTION = "This module implements a minimalist HTTP user agent cookie jar in \
conformance with at http://tools.ietf.org/html/rfc6265. \
 \
Unlike the commonly used HTTP::Cookies module, this module does not require \
use of HTTP::Request and HTTP::Response objects. An LWP-compatible adapter \
is available as HTTP::CookieJar::LWP."
LICENSE = "Apache-2.0"

PV = "0.014"

RPM_NAME = "perl-HTTP-CookieJar-0.014-1.2.noarch.rpm"
RPM_HASH = "653528c7f6289419e7dc51c5e4e86b2a62d3ad77eecd3d78c682b32b1da99eb26a71d9b006816c7cf22f79ef20c1c9e29f0d7f263ae356a947fb9710e5a3ace0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::CookieJar) perl(HTTP::CookieJar::LWP) perl-HTTP-CookieJar"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(HTTP::Date) perl(Time::Local) perl(parent)"

inherit rpm
