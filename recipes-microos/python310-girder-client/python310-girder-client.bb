SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "3.1.3"

RPM_NAME = "python310-girder-client-3.1.3-1.13.noarch.rpm"
RPM_HASH = "de9e5cb53a1b15ff0f603fd152037df80a12437d4005bfc63c9bfb8be542c5d6655d4b7a76586ab7d46de6bfa54fe3a3e680d2bbac3b3aa9590a113e216dc881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-girder-client python3.10dist(girder-client) python310-girder-client python3dist(girder-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-click python310-diskcache python310-requests python310-requests-toolbelt python310-six update-alternatives"

inherit rpm
