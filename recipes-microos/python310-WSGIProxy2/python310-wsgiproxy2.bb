SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-WSGIProxy2-0.5.1-2.3.noarch.rpm"
RPM_HASH = "373c7c6bf4e0fce95a0d1d14f8098e68c90d2169b93e8caa84ffd5f17866f6187380f82f4174804ed0f1e8f9713b832d9f1be6bc32e523f0064ed44c2b71833a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WSGIProxy2 python3.10dist(wsgiproxy2) python310-WSGIProxy2 python3dist(wsgiproxy2)"
RDEPENDS:${PN} += "python(abi) python310-WebOb python310-requests python310-urllib3"

inherit rpm
