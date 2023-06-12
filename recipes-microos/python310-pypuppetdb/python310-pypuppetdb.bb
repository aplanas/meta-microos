SUMMARY = "Library to work with PuppetDB's REST API"
DESCRIPTION = "This library is a wrapper around the REST API providing some convinience functions and objects to request and hold data from PuppetDB. \
More information: https://github.com/nedap/pypuppetdb"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python310-pypuppetdb-2.5.1-1.6.noarch.rpm"
RPM_HASH = "5f75e4c8a43c1a3ee0c6261fa90850ed79b9a664395f2f8f02bc9ee5d148db194f10074e368bf24f65c5ecab424b01800c717103a90f31cdcf1261839cf9b836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypuppetdb \
python3.10dist(pypuppetdb) \
python310-pypuppetdb \
python3dist(pypuppetdb)"
RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
