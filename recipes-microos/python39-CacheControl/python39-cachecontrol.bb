SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.12.11"

RPM_NAME = "python39-CacheControl-0.12.11-2.1.noarch.rpm"
RPM_HASH = "d5d09a66a49b7ff60e04e8d7bd7e4dc05ebbafee943cc3776b6ceb699d3be82230cce6ea0151bc729762b766329ffd9dc459f57bfca2ffc01630d37547a7acc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cachecontrol) python39-CacheControl python39-cachecontrol python3dist(cachecontrol)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-msgpack python39-requests update-alternatives"

inherit rpm
