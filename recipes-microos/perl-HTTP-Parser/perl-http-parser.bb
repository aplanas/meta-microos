SUMMARY = "Parse HTTP/1.1 request into HTTP::Request/Response object"
DESCRIPTION = "This is an HTTP request parser. It takes chunks of text as received and \
returns a 'hint' as to what is required, or returns the HTTP::Request when \
a complete request has been read. HTTP/1.1 chunking is supported. It dies \
if it finds an error."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-HTTP-Parser-0.06-1.10.noarch.rpm"
RPM_HASH = "7aac79c29d6da417f8721d69d5f4d7fd7e3a5f58354d96e6d8a66c84509a10fa53a7f8c6d36451b3881c5a8a453655e3865484dd12f4b8b2c8c07276fdf166ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Parser) perl-HTTP-Parser"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(HTTP::Request) perl(HTTP::Response) perl(URI)"

inherit rpm
