SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "python39-elastic-transport-8.4.0-3.1.noarch.rpm"
RPM_HASH = "d47957230139e0576f209b0839e59457c248eab1d3d8dc219c57ad0b5429e3d8cf63ebc5885f574c3f37bac027f1e78c89985d241099564a80e3b054c7c1c133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(elastic-transport) python39-elastic-transport python3dist(elastic-transport)"
RDEPENDS:${PN} += "(python39-urllib3 >= 1.26.2 with python39-urllib3 < 2) python(abi) python39-certifi"

inherit rpm
