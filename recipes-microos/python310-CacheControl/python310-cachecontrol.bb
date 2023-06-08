SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.12.11"

RPM_NAME = "python310-CacheControl-0.12.11-2.1.noarch.rpm"
RPM_HASH = "316856334de8c086030916805a9eaacb1f2b31f49059c9e60ed69d198933711087d1e28dcb6e88bab748eb4a2e280b5cf1a04a7c60e10de741855742ab3bd51a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CacheControl python3-cachecontrol python3.10dist(cachecontrol) python310-CacheControl python310-cachecontrol python3dist(cachecontrol)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-msgpack python310-requests update-alternatives"

inherit rpm
