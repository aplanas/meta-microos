SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python311-requests-unixsocket-0.3.0-1.6.noarch.rpm"
RPM_HASH = "57a51013f0573123f126c6535274b9b07e53373e9456101535a9d29cf643632b9611fefa1ef9f3353fb81c00a1f6db3703772a0a2d0ded48730a948c2087849d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-unixsocket) python311-requests-unixsocket python3dist(requests-unixsocket)"
RDEPENDS:${PN} += "/usr/bin/env python(abi) python311-requests"

inherit rpm
