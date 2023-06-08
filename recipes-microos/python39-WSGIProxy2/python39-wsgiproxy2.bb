SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python39-WSGIProxy2-0.5.1-2.3.noarch.rpm"
RPM_HASH = "dc1dd0ff0586d3750f9a61c4d71abffee65db011a5f0a96a255f0b309e73c4b8e30811c161ba2bc531a20e09efe1370ec72db058956745d6936ac14190eac9c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wsgiproxy2) python39-WSGIProxy2 python3dist(wsgiproxy2)"
RDEPENDS:${PN} += "python(abi) python39-WebOb python39-requests python39-urllib3"

inherit rpm
