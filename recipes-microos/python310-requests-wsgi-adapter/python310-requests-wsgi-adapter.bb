SUMMARY = "WSGI Transport Adapter for Requests"
DESCRIPTION = "WSGI Transport Adapter for Requests"
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python310-requests-wsgi-adapter-0.4.1-1.3.noarch.rpm"
RPM_HASH = "0fa33f26a95a63ec0a31c6981b0a66ca2b6bcedec31c251ff7104dc11c818de7eec9921acfe735ea63e68ea91a5a3f2de695fa8a42c852fea4a3f37fcd6e781d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-wsgi-adapter python3.10dist(requests-wsgi-adapter) python310-requests-wsgi-adapter python3dist(requests-wsgi-adapter)"
RDEPENDS:${PN} += "python(abi) python310-requests"

inherit rpm
