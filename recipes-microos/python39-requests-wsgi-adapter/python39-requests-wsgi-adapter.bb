SUMMARY = "WSGI Transport Adapter for Requests"
DESCRIPTION = "WSGI Transport Adapter for Requests"
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python39-requests-wsgi-adapter-0.4.1-1.3.noarch.rpm"
RPM_HASH = "d458e2bbab6dca021f9d237fb4c6c85c390a9d01ff32d029545068280d6fedf52c61ab033eb4d3f629d406efeefe5108a68cfa4e0ea8c9dfa98bfeb777ca64ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-wsgi-adapter) python39-requests-wsgi-adapter python3dist(requests-wsgi-adapter)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
