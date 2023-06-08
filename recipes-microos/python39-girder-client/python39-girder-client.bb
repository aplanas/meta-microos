SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "3.1.3"

RPM_NAME = "python39-girder-client-3.1.3-1.13.noarch.rpm"
RPM_HASH = "057b0f3fcd8d3d5ccda679f2b8d0572bd1b5a82c23b7dc01440efa8f4c6848c95b5ac54d15cc59ac969f0918750bbcc92aed372a62a081f9b019b5c33cfba417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(girder-client) python39-girder-client python3dist(girder-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click python39-diskcache python39-requests python39-requests-toolbelt python39-six update-alternatives"

inherit rpm
