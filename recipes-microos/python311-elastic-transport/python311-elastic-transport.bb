SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "python311-elastic-transport-8.4.0-3.1.noarch.rpm"
RPM_HASH = "6ee6a7298e7dccd0ccb0f5ba155ebdc0c4f9e27757271a88f881e023bd8b1532cf606e342549a3c842509920cbfd95a526eb3ab0af7125073fa20be27ef801ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(elastic-transport) python311-elastic-transport python3dist(elastic-transport)"
RDEPENDS:${PN} += "(python311-urllib3 >= 1.26.2 with python311-urllib3 < 2) python(abi) python311-certifi"

inherit rpm
