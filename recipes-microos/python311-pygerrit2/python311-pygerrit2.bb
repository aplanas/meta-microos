SUMMARY = "Client library for interacting with Gerrit code review"
DESCRIPTION = "Client library for interacting with Gerrit code review rest api \
 \
Pygerrit2 provides a simple interface for clients to interact with \
Gerrit code review via its rest api. \
 \
See also: https://gerritcodereview.com/"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python311-pygerrit2-2.0.15-1.6.noarch.rpm"
RPM_HASH = "0e294bb31939099b92eadb6d04634006e7d5ab1d560b39ab3479ae94932925bd202d5031a013418062532925965b6b4d33a6d5860d2cc6d4aa25144a9c2d7454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pygerrit2) python311-pygerrit2 python3dist(pygerrit2)"
RDEPENDS:${PN} += "python(abi) python311-pbr python311-requests"

inherit rpm
