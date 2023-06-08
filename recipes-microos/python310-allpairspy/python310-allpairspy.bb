SUMMARY = "Pairwise test combinations generator"
DESCRIPTION = "Pairwise test combinations generator."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-allpairspy-2.5.0-2.3.noarch.rpm"
RPM_HASH = "2e0e84148bb98734e200b15830f21f425b7bb1aed45910aa44d59f9d7876a555fd5e5cc399cd0429c2acdfdda29d12f62849e95236c92e0fc3e17f11ca5010b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-allpairspy python3.10dist(allpairspy) python310-allpairspy python3dist(allpairspy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
