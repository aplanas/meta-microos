SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python311-WSGIProxy2-0.5.1-2.3.noarch.rpm"
RPM_HASH = "14a64d2379bf6d4f52a8c5b40cc404635484ee94acde4c3c060a5d4ca3283a6ee1984d2a89eba07190d1769f1d9ad55699d6286913a57ab587c20179cfbe4559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wsgiproxy2) python311-WSGIProxy2 python3dist(wsgiproxy2)"
RDEPENDS:${PN} += "python(abi) python311-WebOb python311-requests python311-urllib3"

inherit rpm
