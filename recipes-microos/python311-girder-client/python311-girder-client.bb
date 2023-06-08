SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "3.1.3"

RPM_NAME = "python311-girder-client-3.1.3-1.13.noarch.rpm"
RPM_HASH = "10441a6331b4eaf3abfb29522448e4098f1483e63960e8abe7e602d594716d3d33823f9f86ed147ea6dde242179d6016bd8cc6b5ab7b87ad399736b722c0b6d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(girder-client) python311-girder-client python3dist(girder-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-click python311-diskcache python311-requests python311-requests-toolbelt python311-six update-alternatives"

inherit rpm
