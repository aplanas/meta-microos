SUMMARY = "Implements a topological sort algorithm"
DESCRIPTION = "Implements a topological sort algorithm."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "python311-toposort-1.7-1.14.noarch.rpm"
RPM_HASH = "df4e445aecc7730354263253504d395b28c907445d26604292c44abd718d5f76511320b1f82d40c635a0cab20d806df49b3b3a350173c4667fc7d37dfd8c1da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(toposort) \
python311-toposort \
python3dist(toposort)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
