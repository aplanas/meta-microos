SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python39-requests-unixsocket-0.3.0-1.6.noarch.rpm"
RPM_HASH = "6a56426b3508a5a989d50163d654877d6a435cad28159493fb68b193703521d0420b40034ed8b5686cbe88165fd974de17b590718646c997ca3426bb02652486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-unixsocket) python39-requests-unixsocket python3dist(requests-unixsocket)"
RDEPENDS:${PN} += "/usr/bin/env python(abi) python39-requests"

inherit rpm
