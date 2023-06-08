SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python310-requests-unixsocket-0.3.0-1.6.noarch.rpm"
RPM_HASH = "16656ea0c38ad30240d33cbfbe0668b078be675fe5878d3c5c472326e24a39490b216f27cdfe8bfb93fa7859a7efead11beb1ce74a447f08a3a8afb10cc8101b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-unixsocket python3.10dist(requests-unixsocket) python310-requests-unixsocket python3dist(requests-unixsocket)"
RDEPENDS:${PN} += "/usr/bin/env python(abi) python310-requests"

inherit rpm
