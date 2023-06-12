SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python39-requests-unixsocket-0.3.0-2.1.noarch.rpm"
RPM_HASH = "e3262bf5c7af82f0ac5fa19930e472410bec6b47542a6a07e23606e6f8cdb1d0f988c16943ba8180aee7828e660740601fe19424558160cc8c379fbee75d52ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-unixsocket) python39-requests-unixsocket python3dist(requests-unixsocket)"
RDEPENDS:${PN} += "/usr/bin/env python(abi) python39-requests"

inherit rpm
