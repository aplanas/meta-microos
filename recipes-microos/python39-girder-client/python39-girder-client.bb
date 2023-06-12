SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "3.1.20"

RPM_NAME = "python39-girder-client-3.1.20-1.1.noarch.rpm"
RPM_HASH = "cddc28605d08ac07881bf861c446eda00b67806158bf05f979d26296024c489eb7fc4351d8e26b8846abae694f29eaafe7e9c965c446d88b99562cd273cb4844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(girder-client) python39-girder-client python3dist(girder-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click python39-diskcache python39-requests python39-requests-toolbelt python39-six update-alternatives"

inherit rpm
