SUMMARY = "HTTP Body Parser"
DESCRIPTION = "HTTP::Body parses chunks of HTTP POST data and supports \
application/octet-stream, application/json, \
application/x-www-form-urlencoded, and multipart/form-data. \
 \
Chunked bodies are supported by not passing a length value to new(). \
 \
It is currently used by the Catalyst manpage to parse POST bodies."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.22"

RPM_NAME = "perl-HTTP-Body-1.22-1.26.noarch.rpm"
RPM_HASH = "2308fe7d0a44d613f92a4fb94826ad40f6da2ef53f724fcdda08550a1b5d8906f57345a62e6e949cc000648902a39be15c3465f2ad0b6f1db14da16281885c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Body) perl(HTTP::Body::MultiPart) perl(HTTP::Body::OctetStream) perl(HTTP::Body::UrlEncoded) perl(HTTP::Body::XForms) perl(HTTP::Body::XFormsMultipart) perl-HTTP-Body"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(HTTP::Headers) perl(IO::File)"

inherit rpm
