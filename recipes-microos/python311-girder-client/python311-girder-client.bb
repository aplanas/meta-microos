SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "3.1.20"

RPM_NAME = "python311-girder-client-3.1.20-1.1.noarch.rpm"
RPM_HASH = "3c103e22f18618135091a8d6a180ebdc1af90ba7a13da50162218e5037fc3603cb74250565cd89064cf71912a970e30451376d6dfbc082f75cc61e189e6517eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(girder-client) python311-girder-client python3dist(girder-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-click python311-diskcache python311-requests python311-requests-toolbelt python311-six update-alternatives"

inherit rpm
