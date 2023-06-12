SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "3.1.20"

RPM_NAME = "python310-girder-client-3.1.20-1.1.noarch.rpm"
RPM_HASH = "828a32d65269b812685c4f1915b72a1081b68888ca7caddb78ead6c45f2483db704d19093ab4616342d48da6e63a1968e0c1c20fe6aa00da7eef0581bb23ff59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-girder-client python3.10dist(girder-client) python310-girder-client python3dist(girder-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-click python310-diskcache python310-requests python310-requests-toolbelt python310-six update-alternatives"

inherit rpm
